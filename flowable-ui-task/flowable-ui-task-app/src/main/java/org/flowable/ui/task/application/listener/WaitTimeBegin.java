package org.flowable.ui.task.application.listener;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.ExecutionListener;

public class WaitTimeBegin implements ExecutionListener {
    Logger logger = LogManager.getLogger(this.getClass());
    @Override
    public void notify(DelegateExecution delegateExecution) {
        logger.info("正在等待中,1分钟");
    }
}
