package org.flowable.ui.task.application.listener;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * @auther liuji
 * @date 2020/6/19 - 14:56
 */
public class Http implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        Object users = execution.getVariable("users");
        System.out.println("users:"+users);
    }
}
