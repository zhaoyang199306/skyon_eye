package com.skyon.project.system.domain.eye;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skyon.framework.web.domain.EyeBaseEntity;

import java.util.Date;

/**
 * DT_CUST_RISK_COURT_AFFI_A
 * 客户风险_法院公告
 */
public class DtCustRiskCourtAffiA extends EyeBaseEntity {
    private String party; // 当事人
    private String affiType; // 公告类型
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date affiDt; // 公告日期
    private String contentOutline; // 内容概要
    private String courtName; // 法院名称

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getAffiType() {
        return affiType;
    }

    public void setAffiType(String affiType) {
        this.affiType = affiType;
    }

    public Date getAffiDt() {
        return affiDt;
    }

    public void setAffiDt(Date affiDt) {
        this.affiDt = affiDt;
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
