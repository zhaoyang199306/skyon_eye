package com.skyon.project.system.domain.eye;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class TaskInfoSubmitPojo {

    public TaskInfoSubmitPojo() {
    }

    private String taskInfoNo;
    private String riskValue;
    private Object radio;
    private String examinValue;
    private String personalRiskLevel;
    private String checkResult;
    private List<TWarnSignal> warnSignalList;

    public String getTaskInfoNo() {
        return taskInfoNo;
    }

    public void setTaskInfoNo(String taskInfoNo) {
        this.taskInfoNo = taskInfoNo;
    }

    public String getRiskValue() {
        return riskValue;
    }

    public void setRiskValue(String riskValue) {
        this.riskValue = riskValue;
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

    public List<TWarnSignal> getWarnSignalList() {
        return warnSignalList;
    }

    public void setWarnSignalList(List<TWarnSignal> warnSignalList) {
        this.warnSignalList = warnSignalList;
    }
}
