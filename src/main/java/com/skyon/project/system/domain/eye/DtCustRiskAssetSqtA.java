package com.skyon.project.system.domain.eye;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skyon.framework.web.domain.EyeBaseEntity;

import java.util.Date;

/**
 * 客户风险_资产查封
 * DT_CUST_RISK_ASSET_SQT_A
 */
public class DtCustRiskAssetSqtA extends EyeBaseEntity {

    private String caption; // 标题
    private String sqtStatus; // 查封状态
    private String beSqtSubjMatterEstate; // 被查封标的房产
    private String assetCate; // 资产类别
    private String caseNum; // 案件号
    private String courtName; // 法院名称
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dealDt; // 处理时间
    private String contentOutline; // 内容概要

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getSqtStatus() {
        return sqtStatus;
    }

    public void setSqtStatus(String sqtStatus) {
        this.sqtStatus = sqtStatus;
    }

    public String getBeSqtSubjMatterEstate() {
        return beSqtSubjMatterEstate;
    }

    public void setBeSqtSubjMatterEstate(String beSqtSubjMatterEstate) {
        this.beSqtSubjMatterEstate = beSqtSubjMatterEstate;
    }

    public String getAssetCate() {
        return assetCate;
    }

    public void setAssetCate(String assetCate) {
        this.assetCate = assetCate;
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

    public Date getDealDt() {
        return dealDt;
    }

    public void setDealDt(Date dealDt) {
        this.dealDt = dealDt;
    }

    public String getContentOutline() {
        return contentOutline;
    }

    public void setContentOutline(String contentOutline) {
        this.contentOutline = contentOutline;
    }
}
