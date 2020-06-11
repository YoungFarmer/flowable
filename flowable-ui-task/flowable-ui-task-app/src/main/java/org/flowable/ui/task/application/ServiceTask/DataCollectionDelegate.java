package org.flowable.ui.task.application.ServiceTask;

import com.alibaba.fastjson.JSON;
import com.arronlong.httpclientutil.HttpClientUtil;
import com.arronlong.httpclientutil.common.HttpConfig;
import com.arronlong.httpclientutil.exception.HttpProcessException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.flowable.ui.task.application.pojo.ResultData;
import org.flowable.ui.task.application.vo.BedPresView;

import java.util.List;

/**
 * @author LyuBo
 * @create 2020-05-15 23:50
 */
public class DataCollectionDelegate implements JavaDelegate {
    Logger logger = LogManager.getLogger(this.getClass());
    @Override
    public void execute(DelegateExecution delegateExecution) {
        List<ResultData.DataEntity> dataEntities = (List<ResultData.DataEntity>)delegateExecution.getVariable("userList");
        logger.info("床压监控任务获得的用户个数是：" + dataEntities.size());
        //请求用
        ResultData resultData = new ResultData();
        resultData.setData(dataEntities);

        String url = "http://localhost:8887/v1/bedpressures";
        String html = null;
        HttpConfig config = HttpConfig.custom()
                .url(url)	          //设置请求的url
                .encoding("utf-8") //设置请求和返回编码，默认就是Charset.defaultCharset()
                .json(JSON.toJSONString(resultData))                          //json方式请求的话，就不用设置map方法，当然二者可以共用。
                ;
        //使用方式：
        logger.info( "用获得的用户数据来请求床压监测数据接口");
        try {
            html = HttpClientUtil.post(config);
        } catch (HttpProcessException e) {
            delegateExecution.setVariable("DataCollectionDelegate_Status","Failed");
            e.printStackTrace();

        }


        BedPresView bedPresView = null;
        if(html != null) {
            bedPresView = JSON.parseObject(html, BedPresView.class);
            delegateExecution.setVariable("DataCollectionDelegate_Status","Success");
            logger.info("床压监控数据请求成功");
        }

        if(bedPresView != null) {
            logger.info("已收集到" + bedPresView.getData().size() + "个用户的床压监测数据");
            logger.info("床压监控数据如下:");
            for(BedPresView.DataEntity dataEntity : bedPresView.getData()) {
                logger.info(dataEntity);
            }
            delegateExecution.setVariable("dataCollection", bedPresView.getData());
            String chuangya = null;
//            delegateExecution.setVariable("chuangyajiankong", "床压监测数据为空");
        }else {
            logger.info("床压监测数据为空");
        }

    }
}
