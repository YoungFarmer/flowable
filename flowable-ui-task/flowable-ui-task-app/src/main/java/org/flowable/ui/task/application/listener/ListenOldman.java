package org.flowable.ui.task.application.listener;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.ExecutionListener;
import org.flowable.ui.task.application.pojo.ResultData;

public class ListenOldman implements ExecutionListener {
    Logger logger = LogManager.getLogger(this.getClass());
    @Override
    public void notify(DelegateExecution delegateExecution) {
        ResultData.DataEntity dataEntities = (ResultData.DataEntity)delegateExecution.getVariable("user");
//        logger.info(dataEntities);

//        logger.info(dataEntities.getNumber());
//        logger.info(delegateExecution.getVariable(nrOfInstances));
        logger.info(dataEntities);
    }
}
