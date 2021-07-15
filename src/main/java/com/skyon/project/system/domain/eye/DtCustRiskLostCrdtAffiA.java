package com.skyon.project.system.domain.eye;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skyon.framework.web.domain.EyeBaseEntity;

import java.util.Date;

/**
 * DT_CUST_RISK_LOST_CRDT_AFFI_A
 * 客户风险_失信公告
 */
public class DtCustRiskLostCrdtAffiA extends EyeBaseEntity {

    private String lostCrdtBeExecBehav; // 失信被执行人行为具体情形
    private String caseNum; // 案件号
    private String party; // 当事人
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date issueDt; // 发布时间
    private String effectLawDocCfm; // 生效法律文书确定的义务
    private String execGistNum; // 执行依据文号
    private String beExecFulfilSitu; // 被执行人的履行情况
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date etlDt; // 数据日期

    public String getLostCrdtBeExecBehav() {
        return lostCrdtBeExecBehav;
    }

    public void setLostCrdtBeExecBehav(String lostCrdtBeExecBehav) {
        this.lostCrdtBeExecBehav = lostCrdtBeExecBehav;
    }

    public String getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public Date getIssueDt() {
        return issueDt;
    }

    public void setIssueDt(Date issueDt) {
        this.issueDt = issueDt;
    }

    public String getEffectLawDocCfm() {
        return effectLawDocCfm;
    }

    public void setEffectLawDocCfm(String effectLawDocCfm) {
        this.effectLawDocCfm = effectLawDocCfm;
    }

    public String getExecGistNum() {
        return execGistNum;
    }

    public void setExecGistNum(String execGistNum) {
        this.execGistNum = execGistNum;
    }

    public String getBeExecFulfilSitu() {
        return beExecFulfilSitu;
    }

    public void setBeExecFulfilSitu(String beExecFulfilSitu) {
        this.beExecFulfilSitu = beExecFulfilSitu;
    }

    @Override
    public Date getEtlDt() {
        return etlDt;
    }

    @Override
    public void setEtlDt(Date etlDt) {
        this.etlDt = etlDt;
    }
}
