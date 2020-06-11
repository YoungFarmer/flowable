package org.flowable.ui.task.application.dao;

import org.flowable.ui.task.application.pojo.ProcessInstanceOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessInstanceOperationRepository extends JpaRepository<ProcessInstanceOperation,Integer> {
}
