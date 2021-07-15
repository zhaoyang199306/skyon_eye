package com.skyon.project.system.domain.eye;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skyon.framework.web.domain.EyeBaseEntity;

import java.util.Date;

/**
 * DT_CUST_RISK_COUR_AFFI_A
 * 客户风险_开庭公告
 */
public class DtCustRiskCourAffiA extends EyeBaseEntity {

    private String caseReason; // 案由
    private String plaintiff; // 原告
    private String defendant; // 被告
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date courDt; // 开庭日期
    private String caseNum; // 案件号
    private String courtName; // 法院名称

    public String getCaseReason() {
        return caseReason;
    }

    public void setCaseReason(String caseReason) {
        this.caseReason = caseReason;
    }

    public String getPlaintiff() {
        return plaintiff;
    }

    public void setPlaintiff(String plaintiff) {
        this.plaintiff = plaintiff;
    }

    public String getDefendant() {
        return defendant;
    }

    public void setDefendant(String defendant) {
        this.defendant = defendant;
    }

    public Date getCourDt() {
        return courDt;
    }

    public void setCourDt(Date courDt) {
        this.courDt = courDt;
    }

    public String getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }
}
