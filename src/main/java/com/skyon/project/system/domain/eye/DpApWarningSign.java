package com.skyon.project.system.domain.eye;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 预警信号列表
 * DP_AP_WARNING_SIGN
 */
public class DpApWarningSign {

    public DpApWarningSign() {
    }

    private String taskInfoNo;
    private String taskNum;
    private String nowDealRole; // 当前处理岗
    private String singleName; // 信号名称
    private String singleLevel; // 信号等级
    private String warmResson; // 预警原因
    private String touchDate; // 触发日期
    private String devolutionDate; // 下放时间
    private String comfStatus; // 认定状态

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
