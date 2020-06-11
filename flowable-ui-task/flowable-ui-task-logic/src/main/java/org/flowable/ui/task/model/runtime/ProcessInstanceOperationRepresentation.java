package org.flowable.ui.task.model.runtime;

import org.flowable.engine.history.HistoricProcessInstance;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.idm.api.User;
import org.flowable.ui.common.model.AbstractRepresentation;

import java.util.Date;

public class ProcessInstanceOperationRepresentation extends AbstractRepresentation {

    protected String id;
    protected String InstanceID;
    protected Long Plan_execute_time;
    protected int Plan_is_success;
    protected String ResultInfo;
//    protected String name;
//    protected String businessKey;
    protected String PlanID;
//    protected String tenantId;
    protected Date Plan_start_time;
    protected Date ended;
//    protected UserRepresentation startedBy;
//    protected String processDefinitionName;
//    protected String processDefinitionDescription;
//    protected String processDefinitionKey;
//    protected String processDefinitionCategory;
//    protected int processDefinitionVersion;
//    protected String processDefinitionDeploymentId;
//    protected boolean graphicalNotationDefined;
    protected boolean startFormDefined;

//    protected List<RestVariable> variables = new ArrayList<>();

    public ProcessInstanceOperationRepresentation(ProcessInstance processInstance, ProcessDefinition processDefinition, boolean graphicalNotation, User startedBy) {
        this(processInstance, graphicalNotation, startedBy);
        mapProcessDefinition(processDefinition);
    }

    public ProcessInstanceOperationRepresentation(ProcessInstance processInstance, boolean graphicalNotation, User startedBy) {
        this.id = processInstance.getId();
//        this.name = processInstance.getName();
//        this.businessKey = processInstance.getBusinessKey();
        this.PlanID = processInstance.getProcessDefinitionId();
//        this.tenantId = processInstance.getTenantId();
//        this.graphicalNotationDefined = graphicalNotation;
//        this.startedBy = startedBy != null ? new UserRepresentation(startedBy) : null;
    }

    public ProcessInstanceOperationRepresentation(HistoricProcessInstance processInstance, ProcessDefinition processDefinition, boolean graphicalNotation, User startedBy, String processInstanceId) {
        this(processInstance, graphicalNotation, startedBy,processInstanceId);
        mapProcessDefinition(processDefinition);
    }

    public ProcessInstanceOperationRepresentation(HistoricProcessInstance processInstance, boolean graphicalNotation, User startedBy, String processInstanceId) {
        this.id = processInstance.getId();
        this.Plan_execute_time=processInstance.getDurationInMillis();
        this.InstanceID=processInstanceId;
        if(processInstance.getEndTime()!=null){
            this.Plan_is_success=1;
            this.ResultInfo="执行成功";
        }else{
            this.Plan_is_success=0;
            this.ResultInfo="执行失败";
        }


//        this.name = processInstance.getName();
//        this.businessKey = processInstance.getBusinessKey();
        this.PlanID = processInstance.getProcessDefinitionId();
//        this.tenantId = processInstance.getTenantId();
//        this.graphicalNotationDefined = graphicalNotation;
        this.Plan_start_time = processInstance.getStartTime();
        this.ended = processInstance.getEndTime();
//        this.startedBy = startedBy != null ? new UserRepresentation(startedBy) : null;


    }

    protected void mapProcessDefinition(ProcessDefinition processDefinition) {
        if (processDefinition != null) {
//            this.processDefinitionName = processDefinition.getName();
//            this.processDefinitionDescription = processDefinition.getDescription();
//            this.processDefinitionKey = processDefinition.getKey();
//            this.processDefinitionCategory = processDefinition.getCategory();
//            this.processDefinitionVersion = processDefinition.getVersion();
//            this.processDefinitionDeploymentId = processDefinition.getDeploymentId();
        }
    }

    public ProcessInstanceOperationRepresentation() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstanceID() {
        return InstanceID;
    }

    public void setInstanceID(String instanceID) {
        InstanceID = instanceID;
    }

    public String getPlanID() {
        return PlanID;
    }

    public void setPlanID(String planID) {
        PlanID = planID;
    }

    public Date getPlan_start_time() {
        return Plan_start_time;
    }

    public void setPlan_start_time(Date plan_start_time) {
        Plan_start_time = plan_start_time;
    }

    public Long getPlan_execute_time() {
        return Plan_execute_time;
    }

    public void setPlan_execute_time(Long plan_execute_time) {
        Plan_execute_time = plan_execute_time;
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

    //    public String getName() {
//        return name;
//    }
//
//    public UserRepresentation getStartedBy() {
//        return startedBy;
//    }
//
//    public void setStartedBy(UserRepresentation startedBy) {
//        this.startedBy = startedBy;
//    }
//
//    public String getBusinessKey() {
//        return businessKey;
//    }
//
//    public void setBusinessKey(String businessKey) {
//        this.businessKey = businessKey;
//    }
//

//    public String getTenantId() {
//        return tenantId;
//    }
//
//    public void setTenantId(String tenantId) {
//        this.tenantId = tenantId;
//    }



    public Date getEnded() {
        return ended;
    }

    public void setEnded(Date ended) {
        this.ended = ended;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getProcessDefinitionName() {
//        return processDefinitionName;
//    }
//
//    public void setProcessDefinitionName(String processDefinitionName) {
//        this.processDefinitionName = processDefinitionName;
//    }
//
//    public String getProcessDefinitionDescription() {
//        return processDefinitionDescription;
//    }
//
//    public void setProcessDefinitionDescription(String processDefinitionDescription) {
//        this.processDefinitionDescription = processDefinitionDescription;
//    }
//
//    public String getProcessDefinitionKey() {
//        return processDefinitionKey;
//    }
//
//    public void setProcessDefinitionKey(String processDefinitionKey) {
//        this.processDefinitionKey = processDefinitionKey;
//    }
//
//    public String getProcessDefinitionCategory() {
//        return processDefinitionCategory;
//    }
//
//    public void setProcessDefinitionCategory(String processDefinitionCategory) {
//        this.processDefinitionCategory = processDefinitionCategory;
//    }
//
//    public int getProcessDefinitionVersion() {
//        return processDefinitionVersion;
//    }
//
//    public void setProcessDefinitionVersion(int processDefinitionVersion) {
//        this.processDefinitionVersion = processDefinitionVersion;
//    }
//
//    public String getProcessDefinitionDeploymentId() {
//        return processDefinitionDeploymentId;
//    }
////
//    public void setProcessDefinitionDeploymentId(String processDefinitionDeploymentId) {
//        this.processDefinitionDeploymentId = processDefinitionDeploymentId;
//    }

//    public List<RestVariable> getVariables() {
//        return variables;
//    }
//
//    public void setVariables(List<RestVariable> variables) {
//        this.variables = variables;
//    }
//
//    public void addVariable(RestVariable variable) {
//        variables.add(variable);
//    }

//    public boolean isGraphicalNotationDefined() {
//        return graphicalNotationDefined;
//    }
//
//    public void setGraphicalNotationDefined(boolean graphicalNotationDefined) {
//        this.graphicalNotationDefined = graphicalNotationDefined;
//    }
//
//    public boolean isStartFormDefined() {
//        return startFormDefined;
//    }
//
    public void setStartFormDefined(boolean startFormDefined) {
        this.startFormDefined = startFormDefined;
    }
}
