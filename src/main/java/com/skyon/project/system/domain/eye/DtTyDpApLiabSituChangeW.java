package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;

/**
 * DT_TY_DP_AP_LIAB_SITU_CHANGE_W
 * 征信_负债情况明显变化
 */
public class DtTyDpApLiabSituChangeW extends EyeBaseEntity {

    private BigDecimal debitCrdtBalChangeCnt; // '环比_借贷余额变动数目'
    private BigDecimal debitCrdtBalChangeRatio; // '环比_借贷余额变动变动比例'
    private BigDecimal finInstCntChange; // '环比_办理信贷业务的金融机构家数变动数'
    private BigDecimal finInstCntChangeRatio; // '环比_办理信贷业务的金融机构家数变动变动比例'

    public BigDecimal getDebitCrdtBalChangeCnt() {
        return debitCrdtBalChangeCnt;
    }

    public void setDebitCrdtBalChangeCnt(BigDecimal debitCrdtBalChangeCnt) {
        this.debitCrdtBalChangeCnt = debitCrdtBalChangeCnt;
    }

    public BigDecimal getDebitCrdtBalChangeRatio() {
        return debitCrdtBalChangeRatio;
    }

    public void setDebitCrdtBalChangeRatio(BigDecimal debitCrdtBalChangeRatio) {
        this.debitCrdtBalChangeRatio = debitCrdtBalChangeRatio;
    }

    public BigDecimal getFinInstCntChange() {
        return finInstCntChange;
    }

    public void setFinInstCntChange(BigDecimal finInstCntChange) {
        this.finInstCntChange = finInstCntChange;
    }

    public BigDecimal getFinInstCntChangeRatio() {
        return finInstCntChangeRatio;
    }

    public void setFinInstCntChangeRatio(BigDecimal finInstCntChangeRatio) {
        this.finInstCntChangeRatio = finInstCntChangeRatio;
    }
}
