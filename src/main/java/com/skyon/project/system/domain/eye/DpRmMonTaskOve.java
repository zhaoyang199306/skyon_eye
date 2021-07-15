package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * DP_RM_MON_TASK_OVE
 * 任务超期情况
 */
public class DpRmMonTaskOve extends EyeBaseEntity {

    private String orgCode;
    private Date analyTime;
    private int taskNum;
    private int taskOveNum;
    private int cogTaskOveNum;
    private BigDecimal cogTaskOveAveDay;
    private int mgtTaskOveNum;
    private BigDecimal mgtTaskOveAveDay;

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Date getAnalyTime() {
        return analyTime;
    }

    public void setAnalyTime(Date analyTime) {
        this.analyTime = analyTime;
    }

    public int getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
    }

    public int getTaskOveNum() {
        return taskOveNum;
    }

    public void setTaskOveNum(int taskOveNum) {
        this.taskOveNum = taskOveNum;
    }

    public int getCogTaskOveNum() {
        return cogTaskOveNum;
    }

    public void setCogTaskOveNum(int cogTaskOveNum) {
        this.cogTaskOveNum = cogTaskOveNum;
    }

    public BigDecimal getCogTaskOveAveDay() {
        return cogTaskOveAveDay;
    }

    public void setCogTaskOveAveDay(BigDecimal cogTaskOveAveDay) {
        this.cogTaskOveAveDay = cogTaskOveAveDay;
    }

    public int getMgtTaskOveNum() {
        return mgtTaskOveNum;
    }

    public void setMgtTaskOveNum(int mgtTaskOveNum) {
        this.mgtTaskOveNum = mgtTaskOveNum;
    }

    public BigDecimal getMgtTaskOveAveDay() {
        return mgtTaskOveAveDay;
    }

    public void setMgtTaskOveAveDay(BigDecimal mgtTaskOveAveDay) {
        this.mgtTaskOveAveDay = mgtTaskOveAveDay;
    }
}
