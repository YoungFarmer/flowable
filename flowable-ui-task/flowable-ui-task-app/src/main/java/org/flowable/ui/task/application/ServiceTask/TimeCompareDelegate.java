package org.flowable.ui.task.application.ServiceTask;

import com.alibaba.fastjson.JSON;
import com.arronlong.httpclientutil.HttpClientUtil;
import com.arronlong.httpclientutil.common.HttpConfig;
import com.arronlong.httpclientutil.exception.HttpProcessException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.flowable.job.service.impl.persistence.entity.JobEntity;
import org.flowable.ui.task.application.vo.BedPresCompareView;
import org.flowable.ui.task.application.vo.BedPresView;
import org.flowable.ui.task.application.vo.NursingServices_Bedprescompare;
import org.flowable.ui.task.application.vo.NursingServices_Bedpressures;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TimeCompareDelegate implements JavaDelegate {
//    @Autowired
//    JobEntity jobEntity;

    Logger logger = LogManager.getLogger(this.getClass());
    @Override
    public void execute(DelegateExecution delegateExecution) {
//        List<BedPresView.DataEntity> dataEntities = (List<BedPresView.DataEntity>)delegateExecution.getVariable("dataCollection");
        List<NursingServices_Bedpressures> dataEntities = (List<NursingServices_Bedpressures>)delegateExecution.getVariable("dataCollection");
        logger.info("卧床时间对比任务获取到的床压监控数据的个数" + dataEntities.size());
//        System.out.println("这里是卧床时间对比里的jobEntity测试："+jobEntity.getElementName());
//        BedPresView resultData = new BedPresView();
//        resultData.setData(dataEntities);
//        NursingServices_Bedpressures resultData = new NursingServices_Bedpressures();
//        resultData.setData(dataEntities);

//        String url = "http://localhost:8887/v1/bedprescompare";
        String url = "http://39.96.139.30:9080/nursingservices/v1/bedprescompare?press_threshold=20&time_threshold=30";
        String html = null;
        try {
            html = HttpClientUtil.get(HttpConfig.custom().url(url));

        } catch (HttpProcessException e) {
            delegateExecution.setVariable("TimeCompareDelegate_Status","Failed");
            e.printStackTrace();

        }
//        HttpConfig config = HttpConfig.custom()
//                .url(url)	          //设置请求的url
//                .encoding("utf-8") //设置请求和返回编码，默认就是Charset.defaultCharset()
//                .json(JSON.toJSONString(resultData))                          //json方式请求的话，就不用设置map方法，当然二者可以共用。
//                ;
//
//        logger.info( "请求卧床时间对比接口");
//        try {
//            html = HttpClientUtil.post(config);
//        } catch (HttpProcessException e) {
//            delegateExecution.setVariable("TimeCompareDelegate_Status","Failed");
//            e.printStackTrace();
//        }

        List<NursingServices_Bedprescompare> nursingServices_bedprescompare =null;
        if(html != null) {
            nursingServices_bedprescompare = JSON.parseArray(html, NursingServices_Bedprescompare.class);
            delegateExecution.setVariable("TimeCompareDelegate_Status","Success");
            logger.info("卧床时间数据请求成功");
        }

        if(nursingServices_bedprescompare != null) {
            logger.info("已收集到" + nursingServices_bedprescompare.size() + "个用户的卧床时间对比数据");
            logger.info("卧床时间对比如下:");
            for(NursingServices_Bedprescompare dataEntity : nursingServices_bedprescompare) {
                
                logger.info("老人姓名："+dataEntity.getName()+"；老人号码："+dataEntity.getNumber()+";是否需要被提醒："+dataEntity.isAlarm());
//                logger.info(dataEntity.getNumber());
//                logger.info(dataEntity.isAlarm());
                logger.info(dataEntity);

            }

//            BedPresCompareView.DataEntity dataEntity = null;
//            logger.info("alarm的值是"+bedPresCompareView.getData().get(0).isAlarm());
            List<Boolean> alarm = new ArrayList<>();
            alarm.add(nursingServices_bedprescompare.get(0).isAlarm());
            alarm.add(nursingServices_bedprescompare.get(1).isAlarm());
            delegateExecution.setVariable("alarm",alarm);
//            logger.info("compare的值是"+bedPresCompareView.getData());
            delegateExecution.setVariable("compare",nursingServices_bedprescompare);
        }else {
            logger.info("床压对比数据为空");
        }
    }
}
