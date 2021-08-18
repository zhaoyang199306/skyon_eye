package com.skyon.project.system.domain.ferghana;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skyon.framework.web.domain.BaseEntity;
import com.skyon.project.system.domain.eye.DpApCustInfo;
import com.skyon.project.system.domain.eye.TBondInfo;
import com.skyon.project.system.domain.eye.DpApWarningSign;

import java.util.Date;
import java.util.List;

/**
 *  DP_AP_task_info
 *  任务信息表
 */
public class DpApTaskInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private String taskInfoNo; // 任务编号 流转id

    private String custNo; // 客户编号

    private String publishDepartment; // 产品发行部门

    private String testSubType; // 检测主体类型

    private String doneDate; // 任务完成时间

    private String status; // 认定状态

    private String limits; // 审批权限

    private String sysRiskLevel; // 系统认定风险等级

    private String isManualInput; // 是否人工录入

    private String custManager; // 客户经理名字

    private String isProprietary; // 非自营 0都不是 1非自营  2自营

    private String channel; // 渠道

    private String riskCustNum; // 风险客户编号


    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date riskTime; // 预警时间

    private String warnRiskLevel; // 预警风险等级
    private String ruleLevel; // 规则等级
    private String scoreLevel; // 评分等级
    private String signalSource; // 信号来源
    private String riskComfType; // 风险认定方式
    private String riskControlMeasures; // 风险管控措施
    private String trackTime; // 跟踪完成时间
    private String personalRiskLevel; // 个人认定风险等级
    private String checkResult; // 检查结论




  //  ----------------------------  关联 对象---------------------------- ----------------------------

    private DpApCustInfo dpApCustInfo; // 个人信息

    private List<TBondInfo> bondInfoList; // 管理 债券信息类

    private List<DpApWarningSign> warnSignals; // 预警信号列表

    //  ----------------------------get / set ---------------------------- ----------------------------


    public String getTrackTime() {
        return trackTime;
    }

    public void setTrackTime(String trackTime) {
        this.trackTime = trackTime;
    }

    public String getCustNo() {
        return custNo;
    }


    public DpApCustInfo getDpApCustInfo() {
        return dpApCustInfo;
    }

    public void setDpApCustInfo(DpApCustInfo dpApCustInfo) {
        this.dpApCustInfo = dpApCustInfo;
    }

    public String getPersonalRiskLevel() {
        return personalRiskLevel;
    }

    public void setPersonalRiskLevel(String personalRiskLevel) {
        this.personalRiskLevel = personalRiskLevel;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public String getRiskControlMeasures() {
        return riskControlMeasures;
    }

    public void setRiskControlMeasures(String riskControlMeasures) {
        this.riskControlMeasures = riskControlMeasures;
    }

    public List<DpApWarningSign> getWarnSignals() {
        return warnSignals;
    }

    public void setWarnSignals(List<DpApWarningSign> warnSignals) {
        this.warnSignals = warnSignals;
    }

    public String getRiskComfType() {
        return riskComfType;
    }

    public void setRiskComfType(String riskComfType) {
        this.riskComfType = riskComfType;
    }

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

    public String getPublishDepartment() {
        return publishDepartment;
    }

    public void setPublishDepartment(String publishDepartment) {
        this.publishDepartment = publishDepartment;
    }

    public String getSysRiskLevel() {
        return sysRiskLevel;
    }

    public void setSysRiskLevel(String sysRiskLevel) {
        this.sysRiskLevel = sysRiskLevel;
    }

    public String getTaskInfoNo() {
        return taskInfoNo;
    }

    public void setTaskInfoNo(String taskInfoNo) {
        this.taskInfoNo = taskInfoNo;
    }

    public String getTestSubType() {
        return testSubType;
    }

    public void setTestSubType(String testSubType) {
        this.testSubType = testSubType;
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
        return "DpApTaskInfo{" +
                "taskInfoNo='" + taskInfoNo + '\'' +
                ", testSubType='" + testSubType + '\'' +
                ", doneDate='" + doneDate + '\'' +
                ", status='" + status + '\'' +
                ", limits='" + limits + '\'' +
                '}';
    }
}
