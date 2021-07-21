package com.skyon.project.system.domain.eye;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 预警信号列表
 * warn_signal
 */
public class TWarnSignal {
    public TWarnSignal() {
    }

    private String taskInfoNo;
    private String taskNum;
    private String nowDealRole;
    private String singleName;
    private String singleLevel;
    private String warmResson;
    private String touchDate;
    private String devolutionDate;
    private String comfStatus;

    public String getComfStatus() {
        return comfStatus;
    }

    public void setComfStatus(String comfStatus) {
        this.comfStatus = comfStatus;
    }

    public String getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(String taskNum) {
        this.taskNum = taskNum;
    }

    public String getNowDealRole() {
        return nowDealRole;
    }

    public void setNowDealRole(String nowDealRole) {
        this.nowDealRole = nowDealRole;
    }

    public String getSingleName() {
        return singleName;
    }

    public void setSingleName(String singleName) {
        this.singleName = singleName;
    }

    public String getSingleLevel() {
        return singleLevel;
    }

    public void setSingleLevel(String singleLevel) {
        this.singleLevel = singleLevel;
    }

    public String getWarmResson() {
        return warmResson;
    }

    public void setWarmResson(String warmResson) {
        this.warmResson = warmResson;
    }

    public String getTouchDate() {
        return touchDate;
    }

    public void setTouchDate(String touchDate) {
        this.touchDate = touchDate;
    }

    public String getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(String devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getTaskInfoNo() {
        return taskInfoNo;
    }

    public void setTaskInfoNo(String taskInfoNo) {
        this.taskInfoNo = taskInfoNo;
    }
}
