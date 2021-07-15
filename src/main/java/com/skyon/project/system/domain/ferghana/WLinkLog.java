package com.skyon.project.system.domain.ferghana;

import com.skyon.framework.web.domain.BaseEntity;

/**
 * 流程日志
 */
public class WLinkLog extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private String id; // 主键 流转id

    private String taskInfoNo;

    private String taskNum; //任务编号

    private String dealRole; //处理岗

    private String dealUser; //处理人

    private String operation; // 操作

    private String examinValue; // 审核意见

    private String custLevel; // 风险等级

    private String riskValue; // 风险措施

    public String getTaskInfoNo() {
        return taskInfoNo;
    }

    public void setTaskInfoNo(String taskInfoNo) {
        this.taskInfoNo = taskInfoNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(String taskNum) {
        this.taskNum = taskNum;
    }

    public String getDealRole() {
        return dealRole;
    }

    public void setDealRole(String dealRole) {
        this.dealRole = dealRole;
    }

    public String getDealUser() {
        return dealUser;
    }

    public void setDealUser(String dealUser) {
        this.dealUser = dealUser;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getExaminValue() {
        return examinValue;
    }

    public void setExaminValue(String examinValue) {
        this.examinValue = examinValue;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getRiskValue() {
        return riskValue;
    }

    public void setRiskValue(String riskValue) {
        this.riskValue = riskValue;
    }

    @Override
    public String toString() {
        return "WLinkLog{" +
                "id='" + id + '\'' +
                ", taskNum='" + taskNum + '\'' +
                ", dealRole='" + dealRole + '\'' +
                ", dealUser='" + dealUser + '\'' +
                ", operation='" + operation + '\'' +
                ", examinValue='" + examinValue + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", riskValue='" + riskValue + '\'' +
                '}';
    }
}
