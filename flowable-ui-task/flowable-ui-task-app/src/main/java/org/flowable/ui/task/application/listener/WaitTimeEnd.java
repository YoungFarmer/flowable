package org.flowable.ui.task.application.listener;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.ExecutionListener;

public class WaitTimeEnd implements ExecutionListener {
    Logger logger = LogManager.getLogger(this.getClass());
    @Override
    public void notify(DelegateExecution delegateExecution) {
        logger.info("1分钟等待完成");
    }
}
