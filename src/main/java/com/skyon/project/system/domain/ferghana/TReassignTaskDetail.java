package com.skyon.project.system.domain.ferghana;

public class TReassignTaskDetail {

    private String uuid; // 主键

    private String reassignTaskNo; // 改派编号

    private String taskInfoNo; // 任务编号

    private String custNo; // 客户编号

    private String custName; // 客户名称

    private String taskType; // 任务类型

    private String beforeUser; // 前处理人

    private String newUser; // 当前处理人

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getReassignTaskNo() {
        return reassignTaskNo;
    }

    public void setReassignTaskNo(String reassignTaskNo) {
        this.reassignTaskNo = reassignTaskNo;
    }

    public String getTaskInfoNo() {
        return taskInfoNo;
    }

    public void setTaskInfoNo(String taskInfoNo) {
        this.taskInfoNo = taskInfoNo;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getBeforeUser() {
        return beforeUser;
    }

    public void setBeforeUser(String beforeUser) {
        this.beforeUser = beforeUser;
    }

    public String getNewUser() {
        return newUser;
    }

    public void setNewUser(String newUser) {
        this.newUser = newUser;
    }
}
