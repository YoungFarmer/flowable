package org.flowable.ui.task.application.EventListener;

import org.flowable.common.engine.api.delegate.event.FlowableEvent;
import org.flowable.common.engine.api.delegate.event.FlowableEventListener;

public class Entity_Create implements FlowableEventListener {
    private static final long serialVersionUID = 1L;

    @Override
    public void onEvent(FlowableEvent flowableEvent) {
        String EventName = flowableEvent.getType().name();
        System.out.println(EventName+"新的实体已经创建");

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
}
