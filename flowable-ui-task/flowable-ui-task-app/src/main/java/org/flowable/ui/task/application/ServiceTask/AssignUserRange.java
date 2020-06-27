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
import org.flowable.ui.task.application.vo.NursingServices_Users;

import java.util.ArrayList;
import java.util.List;

public class AssignUserRange implements JavaDelegate {
    Logger logger = LogManager.getLogger(this.getClass());

    @Override
    public void execute(DelegateExecution delegateExecution) {
//        String url = "http://localhost:8887/v1/users";
        String url = "http://39.96.139.30:9080/nursingservices/v1/users";
        String html = null;
        try {
            html = HttpClientUtil.get(HttpConfig.custom().url(url));

        } catch (HttpProcessException e) {
            delegateExecution.setVariable("AssignUserRange_Status","Failed");
            e.printStackTrace();

        }
//        ResultData resultData = null;
//        if (html != null) {
//            delegateExecution.setVariable("AssignUserRange_Status","Success");
//            resultData = JSON.parseObject(html, ResultData.class);
//        }
//
//        if (resultData != null) {
//            logger.info("获取到了用户数据,总个数为" + resultData.getData().size());
//            List<ResultData.DataEntity> dataEntities = new ArrayList<>();
//            dataEntities.add(resultData.getData().get(0));
//            dataEntities.add(resultData.getData().get(1));
//
//            delegateExecution.setVariable("userList", dataEntities);
//            logger.info("分配用户范围任务已经结束");
//
//        }
        List<NursingServices_Users> users = null;
        if (html != null) {
            delegateExecution.setVariable("AssignUserRange_Status","Success");
            System.out.println("html:"+html);
//            System.out.println("JSON.parseObject(html):"+JSON.parseObject(html));
//            nursingServices_users = JSON.parseObject(html, NursingServices_Users.class);
            users = JSON.parseArray(html, NursingServices_Users.class);
            for (NursingServices_Users nursingServicesUsers : users) {
                System.out.println("users:"+nursingServicesUsers);
            }
        }

        if (users != null) {
            logger.info("获取到了用户数据,总个数为" + users.size());
            List<NursingServices_Users> dataEntities = new ArrayList<>();
            dataEntities.add(users.get(0));
            dataEntities.add(users.get(1));

            delegateExecution.setVariable("userList", dataEntities);
            logger.info("分配用户范围任务已经结束");

        }
    }
}
