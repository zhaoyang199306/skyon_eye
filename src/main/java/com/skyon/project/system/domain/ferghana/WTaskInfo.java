package com.skyon.project.system.domain.ferghana;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skyon.framework.web.domain.BaseEntity;
import com.skyon.project.system.domain.eye.TBondInfo;

import java.util.Date;
import java.util.List;

/**
 * 预警基本信息对象 w_task_info
 */
public class WTaskInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private Long taskInfoNo; // 主键 流转id

    private String custNo; // 客户编号

    private String custName; // 客户名称

    private String queueId; // 客户名称

    private String queueName; // 客户名称

    private String publishDepartment; // 客户名称

    private String testSubType; // 检测主体类型

    private String oneNum; // 一级预警数量

    private String twoNum; // 二级预警数量

    private String threeNum; // 三级预警数量

    private String branch; // 所属支行

    private String nextBranch; // 所属分行

    private String doneDate; // 任务完成时间

    private String status; // 认定状态

    private String limits; // 审批权限

    private String riskLevel; // 风险等级

    private String isManualInput; // 是否人工录入

    private String custManager; // 客户经理名字

    private String isProprietary; // 非自营 0否 1是

    private String channel; // 渠道

    private String riskCustNum; // 风险客户编号


    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date riskTime; // 预警时间

    private String warnRiskLevel; // 预警风险等级
    private String ruleLevel; // 规则等级
    private String scoreLevel; // 评分等级
    private String signalSource; // 信号来源




    private List<TBondInfo> bondInfoList; // 管理 债券信息类

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getRiskCustNum() {
        return riskCustNum;
    }

    public void setRiskCustNum(String riskCustNum) {
        this.riskCustNum = riskCustNum;
    }

    public String getIsProprietary() {
        return isProprietary;
    }

    public void setIsProprietary(String isProprietary) {
        this.isProprietary = isProprietary;
    }

    public Date getRiskTime() {
        return riskTime;
    }

    public void setRiskTime(Date riskTime) {
        this.riskTime = riskTime;
    }

    public String getWarnRiskLevel() {
        return warnRiskLevel;
    }

    public void setWarnRiskLevel(String warnRiskLevel) {
        this.warnRiskLevel = warnRiskLevel;
    }

    public String getRuleLevel() {
        return ruleLevel;
    }

    public void setRuleLevel(String ruleLevel) {
        this.ruleLevel = ruleLevel;
    }

    public String getScoreLevel() {
        return scoreLevel;
    }

    public void setScoreLevel(String scoreLevel) {
        this.scoreLevel = scoreLevel;
    }

    public String getSignalSource() {
        return signalSource;
    }

    public void setSignalSource(String signalSource) {
        this.signalSource = signalSource;
    }

    public List<TBondInfo> getBondInfoList() {
        return bondInfoList;
    }

    public void setBondInfoList(List<TBondInfo> bondInfoList) {
        this.bondInfoList = bondInfoList;
    }

    public String getIsManualInput() {
        return isManualInput;
    }

    public void setIsManualInput(String isManualInput) {
        this.isManualInput = isManualInput;
    }

    public String getCustManager() {
        return custManager;
    }

    public void setCustManager(String custManager) {
        this.custManager = custManager;
    }

    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getPublishDepartment() {
        return publishDepartment;
    }

    public void setPublishDepartment(String publishDepartment) {
        this.publishDepartment = publishDepartment;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }


    public Long getTaskInfoNo() {
        return taskInfoNo;
    }

    public void setTaskInfoNo(Long taskInfoNo) {
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

    public String getTestSubType() {
        return testSubType;
    }

    public void setTestSubType(String testSubType) {
        this.testSubType = testSubType;
    }

    public String getOneNum() {
        return oneNum;
    }

    public void setOneNum(String oneNum) {
        this.oneNum = oneNum;
    }

    public String getTwoNum() {
        return twoNum;
    }

    public void setTwoNum(String twoNum) {
        this.twoNum = twoNum;
    }

    public String getThreeNum() {
        return threeNum;
    }

    public void setThreeNum(String threeNum) {
        this.threeNum = threeNum;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getNextBranch() {
        return nextBranch;
    }

    public void setNextBranch(String nextBranch) {
        this.nextBranch = nextBranch;
    }

    public String getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(String doneDate) {
        this.doneDate = doneDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLimits() {
        return limits;
    }

    public void setLimits(String limits) {
        this.limits = limits;
    }

    @Override
    public String toString() {
        return "WTaskInfo{" +
                "taskInfoNo='" + taskInfoNo + '\'' +
                ", custNo='" + custNo + '\'' +
                ", custName='" + custName + '\'' +
                ", testSubType='" + testSubType + '\'' +
                ", oneNum='" + oneNum + '\'' +
                ", twoNum='" + twoNum + '\'' +
                ", threeNum='" + threeNum + '\'' +
                ", branch='" + branch + '\'' +
                ", nextBranch='" + nextBranch + '\'' +
                ", doneDate='" + doneDate + '\'' +
                ", status='" + status + '\'' +
                ", limits='" + limits + '\'' +
                '}';
    }
}
