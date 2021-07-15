package com.skyon.project.system.domain.eye;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skyon.framework.web.domain.EyeBaseEntity;

import java.util.Date;

/**
 * DT_CUST_RISK_REFEREE_DOC_A
 * 客户风险_裁判文书
 */
public class DtCustRiskRefereeDocA extends EyeBaseEntity {

    private String caption; // 标题
    private String caseNum; // 案件号
    private String caseReason; // 案由
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date caseDt; // 案件时间
    private String contentOutline; // 内容概要
    private String judgeResult; // 判决结果
    private String courtName; // 法院名称

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum;
    }

    public String getCaseReason() {
        return caseReason;
    }

    public void setCaseReason(String caseReason) {
        this.caseReason = caseReason;
    }

    public Date getCaseDt() {
        return caseDt;
    }

    public void setCaseDt(Date caseDt) {
        this.caseDt = caseDt;
    }

    public String getContentOutline() {
        return contentOutline;
    }

    public void setContentOutline(String contentOutline) {
        this.contentOutline = contentOutline;
    }

    public String getJudgeResult() {
        return judgeResult;
    }

    public void setJudgeResult(String judgeResult) {
        this.judgeResult = judgeResult;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }
}
