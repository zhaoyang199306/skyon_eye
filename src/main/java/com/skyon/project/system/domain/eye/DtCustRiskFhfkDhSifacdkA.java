package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * DT_CUST_RISK_FHFK_DH_SIFACDK_A
 * 客户风险_司法查冻扣
 */
public class DtCustRiskFhfkDhSifacdkA extends EyeBaseEntity {

    private String caption; // 标题
    private String assetCate; // 资产类别
    private String subjMatterName; // 标的名称
    private String eventName; // 事件名称
    private String courtName; // 法院名称
    private String contentOutline; // 内容概要

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getAssetCate() {
        return assetCate;
    }

    public void setAssetCate(String assetCate) {
        this.assetCate = assetCate;
    }

    public String getSubjMatterName() {
        return subjMatterName;
    }

    public void setSubjMatterName(String subjMatterName) {
        this.subjMatterName = subjMatterName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public String getContentOutline() {
        return contentOutline;
    }

    public void setContentOutline(String contentOutline) {
        this.contentOutline = contentOutline;
    }
}
