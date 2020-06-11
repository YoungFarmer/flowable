package org.flowable.ui.task.application.dao;

import org.flowable.ui.task.application.pojo.ServiceOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceOpRepository extends JpaRepository<ServiceOperation,Integer> {
}
