package org.flowable.ui.task.application;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.flowable.ui.task.application.dao.BedPressuresRepository;
import org.flowable.ui.task.application.pojo.BedPressures;
import org.springframework.beans.factory.annotation.Autowired;

public class bedpressures implements JavaDelegate {
    @Autowired
    private BedPressuresRepository bedPressuresRepository;


    @Override
    public void execute(DelegateExecution delegateExecution) {
        BedPressures bedPressures = new BedPressures();
//        bedPressures.getPres();
        double pres;
        delegateExecution.setVariable("pres", 41.12);
    }
}
