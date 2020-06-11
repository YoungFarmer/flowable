package org.flowable.ui.task.application.listener;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.ExecutionListener;

/**
 * @auther liuji
 * @date 2020/6/2 - 10:10
 */
public class TimeOut implements ExecutionListener {
    Logger logger = LogManager.getLogger(this.getClass());
    @Override
    public void notify(DelegateExecution execution) {
        logger.info("一天的监控时间的到了,结束流程");
    }
}
