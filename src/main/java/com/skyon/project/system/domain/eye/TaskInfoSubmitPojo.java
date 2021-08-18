package com.skyon.project.system.domain.eye;

import java.util.List;

public class TaskInfoSubmitPojo {

    public TaskInfoSubmitPojo() {
    }

    private String taskInfoNo;
    private Object riskControlMeasures; // 风险管控措施
    private Object radio;
    private String examinValue;
    private String personalRiskLevel;
    private String checkResult;
    private List<DpApWarningSign> warnSignalList;

    public String getTaskInfoNo() {
        return taskInfoNo;
    }

    public void setTaskInfoNo(String taskInfoNo) {
        this.taskInfoNo = taskInfoNo;
    }

    public Object getRiskControlMeasures() {
        return riskControlMeasures;
    }

    public void setRiskControlMeasures(Object riskControlMeasures) {
        this.riskControlMeasures = riskControlMeasures;
    }

    public Object getRadio() {
        return radio;
    }

    public void setRadio(Object radio) {
        this.radio = radio;
    }

    public String getExaminValue() {
        return examinValue;
    }

    public void setExaminValue(String examinValue) {
        this.examinValue = examinValue;
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

    public List<DpApWarningSign> getWarnSignalList() {
        return warnSignalList;
    }

    public void setWarnSignalList(List<DpApWarningSign> warnSignalList) {
        this.warnSignalList = warnSignalList;
    }
}
