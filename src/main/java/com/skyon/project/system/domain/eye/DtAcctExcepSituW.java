package com.skyon.project.system.domain.eye;

import com.skyon.framework.web.domain.EyeBaseEntity;

import java.math.BigDecimal;

/**
 * DT_ACCT_EXCEP_SITU_W
 * 征信_当前账户异常情况
 */
public class DtAcctExcepSituW extends EyeBaseEntity {

    private BigDecimal currRenewAcctCnt; // 当前展期账户数
    private BigDecimal currBrwNewReturnOld; // 当前借新还旧账户数
    private BigDecimal currOweIntAcctCnt; // 当前欠息账户数
    private BigDecimal addConceCnt; // 环比_新增关注类笔数
    private BigDecimal addConceAmt; // 环比_新增关注类金额
    private BigDecimal addNonCnt; // 环比_新增不良类笔数
    private BigDecimal addNonAmt; // 环比_新增不良类金额

    public BigDecimal getCurrRenewAcctCnt() {
        return currRenewAcctCnt;
    }

    public void setCurrRenewAcctCnt(BigDecimal currRenewAcctCnt) {
        this.currRenewAcctCnt = currRenewAcctCnt;
    }

    public BigDecimal getCurrBrwNewReturnOld() {
        return currBrwNewReturnOld;
    }

    public void setCurrBrwNewReturnOld(BigDecimal currBrwNewReturnOld) {
        this.currBrwNewReturnOld = currBrwNewReturnOld;
    }

    public BigDecimal getCurrOweIntAcctCnt() {
        return currOweIntAcctCnt;
    }

    public void setCurrOweIntAcctCnt(BigDecimal currOweIntAcctCnt) {
        this.currOweIntAcctCnt = currOweIntAcctCnt;
    }

    public BigDecimal getAddConceCnt() {
        return addConceCnt;
    }

    public void setAddConceCnt(BigDecimal addConceCnt) {
        this.addConceCnt = addConceCnt;
    }

    public BigDecimal getAddConceAmt() {
        return addConceAmt;
    }

    public void setAddConceAmt(BigDecimal addConceAmt) {
        this.addConceAmt = addConceAmt;
    }

    public BigDecimal getAddNonCnt() {
        return addNonCnt;
    }

    public void setAddNonCnt(BigDecimal addNonCnt) {
        this.addNonCnt = addNonCnt;
    }

    public BigDecimal getAddNonAmt() {
        return addNonAmt;
    }

    public void setAddNonAmt(BigDecimal addNonAmt) {
        this.addNonAmt = addNonAmt;
    }
}
