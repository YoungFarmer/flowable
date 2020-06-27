package org.flowable.ui.task.application.ServiceTask;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.flowable.ui.task.application.vo.BedPresCompareView;
import org.flowable.ui.task.application.vo.NursingServices_Bedprescompare;

import java.util.List;

public class FeedBackDelegate implements JavaDelegate {
    Logger logger = LogManager.getLogger(this.getClass());
    @Override
    public void execute(DelegateExecution delegateExecution) {
        List<NursingServices_Bedprescompare> bedPresCompareView = (List<NursingServices_Bedprescompare>)delegateExecution.getVariable("compare");
        for(int i=0;i<bedPresCompareView.size();i++){
            if(bedPresCompareView.get(i).isAlarm()==true){
                logger.info("老人的姓名："+bedPresCompareView.get(i).getName());
                logger.info("老人的号码："+bedPresCompareView.get(i).getNumber());
                logger.info("是否被提醒："+bedPresCompareView.get(i).isAlarm());
            }
        }
        delegateExecution.setVariable("FeedBackDelegate_Status","Success");
    }
}
