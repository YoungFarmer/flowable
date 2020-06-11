package org.flowable.ui.task.application.EventListener;

import org.flowable.common.engine.api.delegate.event.FlowableEvent;
import org.flowable.common.engine.api.delegate.event.FlowableEventListener;
import org.flowable.common.engine.impl.event.FlowableEntityEventImpl;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.flowable.job.service.impl.persistence.entity.JobEntity;

//import org.flowable.engine.delegate.event.impl.FlowableEntityEventImpl;

public class Job_Success implements FlowableEventListener, JavaDelegate {
    private static final long serialVersionUID = 1L;



    @Override
    public void onEvent(FlowableEvent flowableEvent) {
//        FlowableEngineEventImpl engineEvent=(FlowableEngineEventImpl)flowableEvent;

//        TaskEntity taskEntity = (TaskEntity) ((FlowableEntityEventImpl) flowableEvent).getEntity();
        JobEntity jobEntity = (JobEntity) ((FlowableEntityEventImpl) flowableEvent).getEntity();
//        System.out.println("taskEntity是"+taskEntity);
//        String taskId = taskEntity.getId();
//        System.out.println("taskId"+taskId);
//        System.out.println("jobEntity.getElementName()"+jobEntity.getElementName());
//        System.out.println("jobEntity.getExecutionId()"+jobEntity.getExecutionId());
//        String EventName = flowableEvent.getType().name();

        System.out.println(jobEntity.getElementName()+"成功执行");


    }

    @Override
    public boolean isFailOnException() {
        return false;
    }

    @Override
    public boolean isFireOnTransactionLifecycleEvent() {
        return false;
    }

    @Override
    public String getOnTransaction() {
        return null;
    }

    @Override
    public void execute(DelegateExecution execution) {

    }
}
