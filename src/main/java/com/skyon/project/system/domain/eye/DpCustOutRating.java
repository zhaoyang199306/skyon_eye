package com.skyon.project.system.domain.eye;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skyon.framework.web.domain.EyeBaseEntity;

import java.util.Date;

/**
 * DP_CUST_OUT_RATING
 * 客户外部评级表
 */
public class DpCustOutRating extends EyeBaseEntity {

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date annDt; // 评级日期
    private String bInfoCreditrating; // 信用评级
    private String custOutRating; // 客户外部评级编号
    private String bInfoCreditratingagency; // 评级机构代码
    private String rateAgency; // 评级机构名称

    public Date getAnnDt() {
        return annDt;
    }

    public void setAnnDt(Date annDt) {
        this.annDt = annDt;
    }

    public String getbInfoCreditrating() {
        return bInfoCreditrating;
    }

    public void setbInfoCreditrating(String bInfoCreditrating) {
        this.bInfoCreditrating = bInfoCreditrating;
    }

    public String getCustOutRating() {
        return custOutRating;
    }

    public void setCustOutRating(String custOutRating) {
        this.custOutRating = custOutRating;
    }

    public String getbInfoCreditratingagency() {
        return bInfoCreditratingagency;
    }

    public void setbInfoCreditratingagency(String bInfoCreditratingagency) {
        this.bInfoCreditratingagency = bInfoCreditratingagency;
    }

    public String getRateAgency() {
        return rateAgency;
    }

    public void setRateAgency(String rateAgency) {
        this.rateAgency = rateAgency;
    }
}
