package org.flowable.ui.task.application.listener;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.ExecutionListener;
import org.flowable.ui.task.application.vo.BedPresCompareView;

import java.util.List;

public class LessFlow implements ExecutionListener {
    Logger logger = LogManager.getLogger(this.getClass());
    @Override
    public void notify(DelegateExecution delegateExecution) {
        List<BedPresCompareView> dataEntity = (List<BedPresCompareView>) delegateExecution.getVariable("compare");

        logger.info("小于阈值的老人卧床时间对比数据是："+dataEntity);
    }
}
