package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;


/**
 * dt_cust_risk_tag_w
 * 客户风险_标签
 */
public class DtCustRiskTagW extends EyeBaseEntity {


    // 风险标签名称
    private String riskTagName;
    // 风险标签分类
    private String riskTagClass;


    public String getRiskTagName() {
        return riskTagName;
    }

    public void setRiskTagName(String riskTagName) {
        this.riskTagName = riskTagName;
    }

    public String getRiskTagClass() {
        return riskTagClass;
    }

    public void setRiskTagClass(String riskTagClass) {
        this.riskTagClass = riskTagClass;
    }
}
