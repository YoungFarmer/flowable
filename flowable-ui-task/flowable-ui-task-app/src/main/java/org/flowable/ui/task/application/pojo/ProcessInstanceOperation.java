package org.flowable.ui.task.application.pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="proinstance_op")
public class ProcessInstanceOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @Column
    private String PlanID;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

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




    public String getPlanID() {
        return PlanID;
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
