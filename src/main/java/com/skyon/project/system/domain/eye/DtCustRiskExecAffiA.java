package com.skyon.project.system.domain.eye;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * DT_CUST_RISK__EXEC_AFFI_A
 * 客户风险_执行公告
 */
public class DtCustRiskExecAffiA extends EyeBaseEntity {

    private  String caseNum; // 案件号
    private  String execSubjMatter; // 执行标的
    private  String caseStatus; // 案件状态
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date closingDt; // 案结时间
    private BigDecimal notExecAmt; // 未执行金额
    private  String contentOutline; // 内容概要
    private  String courtName; // 法院名称

    public String getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum;
    }

    public String getExecSubjMatter() {
        return execSubjMatter;
    }

    public void setExecSubjMatter(String execSubjMatter) {
        this.execSubjMatter = execSubjMatter;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public Date getClosingDt() {
        return closingDt;
    }

    public void setClosingDt(Date closingDt) {
        this.closingDt = closingDt;
    }

    public BigDecimal getNotExecAmt() {
        return notExecAmt;
    }

    public void setNotExecAmt(BigDecimal notExecAmt) {
        this.notExecAmt = notExecAmt;
    }

    public String getContentOutline() {
        return contentOutline;
    }

    public void setContentOutline(String contentOutline) {
        this.contentOutline = contentOutline;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }
}
