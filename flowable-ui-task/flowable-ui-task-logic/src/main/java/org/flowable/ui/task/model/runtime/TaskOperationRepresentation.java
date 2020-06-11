package org.flowable.ui.task.model.runtime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.flowable.cmmn.api.repository.CaseDefinition;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.task.api.Task;
import org.flowable.task.api.TaskInfo;
import org.flowable.task.api.history.HistoricTaskInstance;
import org.flowable.ui.common.model.AbstractRepresentation;
import org.flowable.ui.common.model.UserRepresentation;

import java.util.Date;
import java.util.List;

public class TaskOperationRepresentation extends AbstractRepresentation {

    protected String ServiceID;
//    protected String name;
//    protected String description;
//    protected String category;
//    protected UserRepresentation assignee;
    protected Date Service_start_time;
//    protected Date dueDate;
    protected Date endDate;
    protected Long Service_execute_time;
//    protected Integer priority;
    protected String InstanceID;
//    protected String processInstanceName;
    protected int Service_is_success;
    protected String ResultInfo;
    protected String PlanID;
//    protected String processDefinitionName;
//    protected String processDefinitionDescription;
//    protected String processDefinitionKey;
//    protected String processDefinitionCategory;
//    protected int processDefinitionVersion;
//    protected String processDefinitionDeploymentId;

//    protected String scopeId;
//    protected String scopeType;
//    protected String caseInstanceName;

//    protected String scopeDefinitionId;
//    protected String caseDefinitionName;
//    protected String caseDefinitionDescription;
//    protected String caseDefinitionKey;
//    protected String caseDefinitionCategory;
//    protected int caseDefinitionVersion;
//    protected String caseDefinitionDeploymentId;

//    protected String parentTaskId;
//    protected String parentTaskName;
//
//    protected String formKey;
//    protected String processInstanceStartUserId;
//    protected boolean initiatorCanCompleteTask;
//    protected boolean isMemberOfCandidateGroup;
//    protected boolean isMemberOfCandidateUsers;

    @JsonDeserialize(contentAs = UserRepresentation.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected List<UserRepresentation> involvedPeople;

    // Needed for serialization!
    public TaskOperationRepresentation() {
    }

    public TaskOperationRepresentation(Task task) {
        initializeTaskDetails(task);
    }

    public TaskOperationRepresentation(HistoricTaskInstance task) {
        initializeTaskDetails(task);
    }

    public TaskOperationRepresentation(TaskInfo taskInfo, ProcessDefinition processDefinition) {
        initializeTaskDetails(taskInfo);

        if (processDefinition != null) {
//            this.processDefinitionName = processDefinition.getName();
//            this.processDefinitionDescription = processDefinition.getDescription();
//            this.processDefinitionKey = processDefinition.getKey();
//            this.processDefinitionCategory = processDefinition.getCategory();
//            this.processDefinitionVersion = processDefinition.getVersion();
//            this.processDefinitionDeploymentId = processDefinition.getDeploymentId();
        }
    }

    public TaskOperationRepresentation(TaskInfo taskInfo, CaseDefinition caseDefinition) {
        initializeTaskDetails(taskInfo);

        if (caseDefinition != null) {
//            this.caseDefinitionName = caseDefinition.getName();
//            this.caseDefinitionDescription = caseDefinition.getDescription();
//            this.caseDefinitionKey = caseDefinition.getKey();
//            this.caseDefinitionCategory = caseDefinition.getCategory();
//            this.caseDefinitionVersion = caseDefinition.getVersion();
//            this.caseDefinitionDeploymentId = caseDefinition.getDeploymentId();
        }
    }

    public TaskOperationRepresentation(TaskInfo taskInfo, TaskInfo parentTaskInfo) {
        initializeTaskDetails(taskInfo);

        if (parentTaskInfo != null) {
//            this.parentTaskId = parentTaskInfo.getId();
//            this.parentTaskName = parentTaskInfo.getName();
        }
    }

    public TaskOperationRepresentation(TaskInfo taskInfo, ProcessDefinition processDefinition, String processInstanceName) {
        this(taskInfo, processDefinition);
//        this.processInstanceName = processInstanceName;
    }

    public TaskOperationRepresentation(TaskInfo taskInfo, CaseDefinition caseDefinition, String caseInstanceName) {
        this(taskInfo, caseDefinition);
//        this.caseInstanceName = caseInstanceName;
    }

    public void initializeTaskDetails(TaskInfo taskInfo) {
        this.ServiceID = taskInfo.getId();
//        this.name = taskInfo.getName();
//        this.description = taskInfo.getDescription();
//        this.category = taskInfo.getCategory();
        this.Service_start_time = taskInfo.getCreateTime();
//        this.dueDate = taskInfo.getDueDate();
//        this.priority = taskInfo.getPriority();
        this.InstanceID = taskInfo.getProcessInstanceId();
        this.PlanID = taskInfo.getProcessDefinitionId();
//        this.scopeId = taskInfo.getScopeId();
//        this.scopeType = taskInfo.getScopeType();
//        this.scopeDefinitionId = taskInfo.getScopeDefinitionId();

        if (taskInfo instanceof HistoricTaskInstance) {
            this.endDate = ((HistoricTaskInstance) taskInfo).getEndTime();
            if(endDate!=null){
                this.Service_is_success=1;
                this.ResultInfo="服务执行成功";
            }else{
                this.Service_is_success=0;
                this.ResultInfo="服务执行失败";
            }
//            this.formKey = taskInfo.getFormKey();
            this.Service_execute_time = ((HistoricTaskInstance) taskInfo).getDurationInMillis();
        } else {
            // Rendering of forms for historic tasks not supported currently
//            this.formKey = taskInfo.getFormKey();
        }


    }
//
//    public void fillTask(Task task) {
//        task.setName(name);
//        task.setDescription(description);
//        if (assignee != null && assignee.getId() != null) {
//            task.setAssignee(String.valueOf(assignee.getId()));
//        }
//        task.setDueDate(dueDate);
//        if (priority != null) {
//            task.setPriority(priority);
//        }
//        task.setCategory(category);
//    }


    public int getService_is_success() {
        return Service_is_success;
    }

    public void setService_is_success(int service_is_success) {
        Service_is_success = service_is_success;
    }

    public String getResultInfo() {
        return ResultInfo;
    }

    public void setResultInfo(String resultInfo) {
        ResultInfo = resultInfo;
    }

    public String getServiceID() {
        return ServiceID;
    }

    public void setServiceID(String serviceID) {
        ServiceID = serviceID;
    }

    public Date getService_start_time() {
        return Service_start_time;
    }

    public void setService_start_time(Date service_start_time) {
        Service_start_time = service_start_time;
    }

    public Long getService_execute_time() {
        return Service_execute_time;
    }

    public void setService_execute_time(Long service_execute_time) {
        Service_execute_time = service_execute_time;
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

    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public UserRepresentation getAssignee() {
//        return assignee;
//    }
//
//    public void setAssignee(UserRepresentation assignee) {
//        this.assignee = assignee;
//    }



//    public Date getDueDate() {
//        return dueDate;
//    }
//
//    public void setDueDate(Date dueDate) {
//        this.dueDate = dueDate;
//    }

//    public Integer getPriority() {
//        return priority;
//    }
//
//    public void setPriority(Integer priority) {
//        this.priority = priority;
//    }



//    public String getProcessInstanceName() {
//        return processInstanceName;
//    }
//
//    public void setProcessInstanceName(String processInstanceName) {
//        this.processInstanceName = processInstanceName;
//    }



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
//
//    public void setProcessDefinitionDeploymentId(String processDefinitionDeploymentId) {
//        this.processDefinitionDeploymentId = processDefinitionDeploymentId;
//    }
//
//    public String getScopeId() {
//        return scopeId;
//    }
//
//    public void setScopeId(String scopeId) {
//        this.scopeId = scopeId;
//    }
//
//    public String getScopeType() {
//        return scopeType;
//    }
//
//    public void setScopeType(String scopeType) {
//        this.scopeType = scopeType;
//    }
//
//    public String getCaseInstanceName() {
//        return caseInstanceName;
//    }
//
//    public void setCaseInstanceName(String caseInstanceName) {
//        this.caseInstanceName = caseInstanceName;
//    }
//
//    public String getScopeDefinitionId() {
//        return scopeDefinitionId;
//    }
//
//    public void setScopeDefinitionId(String scopeDefinitionId) {
//        this.scopeDefinitionId = scopeDefinitionId;
//    }
//
//    public String getCaseDefinitionName() {
//        return caseDefinitionName;
//    }
//
//    public void setCaseDefinitionName(String caseDefinitionName) {
//        this.caseDefinitionName = caseDefinitionName;
//    }
//
//    public String getCaseDefinitionDescription() {
//        return caseDefinitionDescription;
//    }
//
//    public void setCaseDefinitionDescription(String caseDefinitionDescription) {
//        this.caseDefinitionDescription = caseDefinitionDescription;
//    }
//
//    public String getCaseDefinitionKey() {
//        return caseDefinitionKey;
//    }
//
//    public void setCaseDefinitionKey(String caseDefinitionKey) {
//        this.caseDefinitionKey = caseDefinitionKey;
//    }
//
//    public String getCaseDefinitionCategory() {
//        return caseDefinitionCategory;
//    }
//
//    public void setCaseDefinitionCategory(String caseDefinitionCategory) {
//        this.caseDefinitionCategory = caseDefinitionCategory;
//    }
//
//    public int getCaseDefinitionVersion() {
//        return caseDefinitionVersion;
//    }
//
//    public void setCaseDefinitionVersion(int caseDefinitionVersion) {
//        this.caseDefinitionVersion = caseDefinitionVersion;
//    }
//
//    public String getCaseDefinitionDeploymentId() {
//        return caseDefinitionDeploymentId;
//    }
//
//    public void setCaseDefinitionDeploymentId(String caseDefinitionDeploymentId) {
//        this.caseDefinitionDeploymentId = caseDefinitionDeploymentId;
//    }
//
//    public String getParentTaskId() {
//        return parentTaskId;
//    }
//
//    public void setParentTaskId(String parentTaskId) {
//        this.parentTaskId = parentTaskId;
//    }
//
//    public String getParentTaskName() {
//        return parentTaskName;
//    }
//
//    public void setParentTaskName(String parentTaskName) {
//        this.parentTaskName = parentTaskName;
//    }
//
//    public String getFormKey() {
//        return formKey;
//    }
//
//    public void setFormKey(String formKey) {
//        this.formKey = formKey;
//    }
//
//    public String getProcessInstanceStartUserId() {
//        return processInstanceStartUserId;
//    }
//
//    public void setProcessInstanceStartUserId(String processInstanceStartUserId) {
//        this.processInstanceStartUserId = processInstanceStartUserId;
//    }
//
//    public boolean isInitiatorCanCompleteTask() {
//        return initiatorCanCompleteTask;
//    }
//
//    public void setInitiatorCanCompleteTask(boolean initiatorCanCompleteTask) {
//        this.initiatorCanCompleteTask = initiatorCanCompleteTask;
//    }
//
//    public boolean isMemberOfCandidateGroup() {
//        return isMemberOfCandidateGroup;
//    }
//
//    public void setMemberOfCandidateGroup(boolean isMemberOfCandidateGroup) {
//        this.isMemberOfCandidateGroup = isMemberOfCandidateGroup;
//    }
//
//    public boolean isMemberOfCandidateUsers() {
//        return isMemberOfCandidateUsers;
//    }
//
//    public void setMemberOfCandidateUsers(boolean isMemberOfCandidateUsers) {
//        this.isMemberOfCandidateUsers = isMemberOfCandidateUsers;
//    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    public List<UserRepresentation> getInvolvedPeople() {
        return involvedPeople;
    }

    public void setInvolvedPeople(List<UserRepresentation> involvedPeople) {
        this.involvedPeople = involvedPeople;
    }

}
