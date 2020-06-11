package org.flowable.ui.task.application.pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ser_op")
public class ServiceOperation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //    private String serviceID;
    @Column
    private String ServiceID;
    @Column
    private String PlanID;
    @Column
    private String InstanceID;
    @Column
    private Date Plan_start_time;
    @Column
    private Date Plan_end_time;
    @Column
    private int Plan_is_success;
    @Column
    private String ResultInfo;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public String getServiceID() {
//        return serviceID;
//    }
//
//    public void setServiceID(String serviceID) {
//        this.serviceID = serviceID;
//    }

    public String getPlanID() {
        return PlanID;
    }

    public String getServiceID() {
        return ServiceID;
    }

    public void setServiceID(String serviceID) {
        ServiceID = serviceID;
    }

    public void setPlanID(String planID) {
        PlanID = planID;
    }

    public String getInstanceID() {
        return InstanceID;
    }

    public void setInstanceID(String instanceID) {
        InstanceID = instanceID;
    }

    public Date getPlan_start_time() {
        return Plan_start_time;
    }

    public void setPlan_start_time(Date plan_start_time) {
        Plan_start_time = plan_start_time;
    }

    public Date getPlan_end_time() {
        return Plan_end_time;
    }

    public void setPlan_end_time(Date plan_end_time) {
        Plan_end_time = plan_end_time;
    }

    public int getPlan_is_success() {
        return Plan_is_success;
    }

    public void setPlan_is_success(int plan_is_success) {
        Plan_is_success = plan_is_success;
    }

    public String getResultInfo() {
        return ResultInfo;
    }

    public void setResultInfo(String resultInfo) {
        ResultInfo = resultInfo;
    }


}
