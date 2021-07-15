package com.skyon.project.system.domain.eye;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * DT_CUST_RISK_ASSET_FRZ_A
 * 客户风险_资产冻结
 */
public class DtCustRiskAssetFrzA extends EyeBaseEntity {

    private String eventName; // 事件名称
    private BigDecimal beFrzAmt; // 被冻结金额
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date beginDt; // 开始时间
    private String caseNum; // 案件号
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date frzStopDt; // 冻结截止日期
    private String execAdviseDocNum; // 执行通知文书号
    private String contentOutline; // 内容概要

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public BigDecimal getBeFrzAmt() {
        return beFrzAmt;
    }

    public void setBeFrzAmt(BigDecimal beFrzAmt) {
        this.beFrzAmt = beFrzAmt;
    }

    public Date getBeginDt() {
        return beginDt;
    }

    public void setBeginDt(Date beginDt) {
        this.beginDt = beginDt;
    }

    public String getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum;
    }

    public Date getFrzStopDt() {
        return frzStopDt;
    }

    public void setFrzStopDt(Date frzStopDt) {
        this.frzStopDt = frzStopDt;
    }

    public String getExecAdviseDocNum() {
        return execAdviseDocNum;
    }

    public void setExecAdviseDocNum(String execAdviseDocNum) {
        this.execAdviseDocNum = execAdviseDocNum;
    }

    public String getContentOutline() {
        return contentOutline;
    }

    public void setContentOutline(String contentOutline) {
        this.contentOutline = contentOutline;
    }
}
