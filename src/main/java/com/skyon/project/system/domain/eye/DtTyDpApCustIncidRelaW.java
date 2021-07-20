package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

/**
 * DT_TY_DP_AP_CUST_INCID_RELA_W
 * 客户关联关系
 */
public class DtTyDpApCustIncidRelaW extends EyeBaseEntity {

    private String incidRela; // 关联关系
    private String relaParty; // 关联方
    private String relaType; // 关系类型
    private String riskFlag; // 风险提示标志

    public String getRiskFlag() {
        return riskFlag;
    }

    public void setRiskFlag(String riskFlag) {
        this.riskFlag = riskFlag;
    }

    public String getIncidRela() {
        return incidRela;
    }

    public void setIncidRela(String incidRela) {
        this.incidRela = incidRela;
    }

    public String getRelaParty() {
        return relaParty;
    }

    public void setRelaParty(String relaParty) {
        this.relaParty = relaParty;
    }

    public String getRelaType() {
        return relaType;
    }

    public void setRelaType(String relaType) {
        this.relaType = relaType;
    }
}
