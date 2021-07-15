package com.skyon.project.system.domain;

import com.skyon.project.system.domain.eye.*;
import com.skyon.project.system.domain.ferghana.WTaskInfo;

import java.util.List;

/**
 * 全景视图里用于风险视图传导类
 */
public class PanoramicRiskViewTotal {

    private DtCustRiskTagW dtCustRiskTagW; // 客户风险_标签

    private DtCustFinanceInfoW dtCustFinanceInfoW; // 我行融资情况

    private List<DpCustOutRating> dpCustOutRating; // 评级情况

    private List<WTaskInfo> wTaskInfos;//

//    ----------------------------司法诉讼--------------------------------------

    private List<DtCustRiskRefereeDocA> dtCustRiskRefereeDocAList; // 客户风险_裁判文书

    private List<DtCustRiskLostCrdtAffiA> dtCustRiskLostCrdtAffiAList; // 客户风险_失信公告

    private List<DtCustRiskFhfkDhSifacdkA> dtCustRiskFhfkDhSifacdkA; // 客户风险_司法查冻扣

    private List<DtCustRiskAssetFrzA> dtCustRiskAssetFrzAList; // 客户风险_资产冻结  DT_CUST_RISK_ASSET_FRZ_A

    private List<DtCustRiskAssetSqtA> dtCustRiskAssetSqtAList; // 客户风险_资产查封  DT_CUST_RISK_ASSET_SQT_A

    private List<DtCustRiskExecAffiA> dtCustRiskExecAffiAList; // 客户风险_执行公告  DT_CUST_RISK__EXEC_AFFI_A

    private List<DtCustRiskCourtAffiA> dtCustRiskCourtAffiAList; // 客户风险_法院公告  DT_CUST_RISK_COURT_AFFI_A

    private List<DtCustRiskCourAffiA> dtCustRiskCourAffiAList; // 客户风险_开庭公告  DT_CUST_RISK_COUR_AFFI_A

//    ---------------------------------人行征信--------------------------------------

    private DtTyDpApLiabMatureSituW dtTyDpApLiabMatureSituW; // 征信_负债到期情况  DT_TY_DP_AP_LIAB_MATURE_SITU_W

    private DtAcctExcepSituW dtAcctExcepSituW; // 征信_当前账户异常情况  DT_ACCT_EXCEP_SITU_W

    private DtTyDpApLiabSituChangeW dtTyDpApLiabSituChangeW; // 征信_负债情况明显变化  DT_TY_DP_AP_LIAB_SITU_CHANGE_W

    private DtCrdtcScoreAndChangeW dtCrdtcScoreAndChangeW; // 征信_征信评分及变化  DT_CRDTC_SCORE_AND_CHANGE_W

    private DtTyDpApPublicRecA dtTyDpApPublicRecA; // 征信_公共记录  DT_TY_DP_AP_PUBLIC_REC_A

    private List<DtTyDpApLiabFinW> dtTyDpApLiabFinWList; // 征信历史_负债融资  DT_TY_DP_AP_LIAB_FIN_W

//    ---------------------------------关系图谱--------------------------------------

    private List<DtTyDpApCustIncidRelaW> dtTyDpApCustIncidRelaW; // 客户关联关系  DT_TY_DP_AP_CUST_INCID_RELA_W

//        ---------------------------------全融资图--------------------------------------

    private DtCustGraphicsOverviewW dtCustGraphicsOverviewW; // 融资明细  DT_CUST_GRAPHICS_OVERVIEW_W

    private List<Dp360LoanInfo> dp360LoanInfo; // 授信贷款信息    DP_360_LOAN_INFO

    private List<Dp360CreditCardInfo> dp360CreditCardInfo; // 信用卡信息    DP_360_CREDIT_CARD_INFO

    private List<Dp360GuaranteeInfo> dp360GuaranteeInfo; // 担保信息    DP_360_GUARANTEE_INFO







//            ---------------------------------get/set--------------------------------------


    public List<Dp360LoanInfo> getDp360LoanInfo() {
        return dp360LoanInfo;
    }

    public void setDp360LoanInfo(List<Dp360LoanInfo> dp360LoanInfo) {
        this.dp360LoanInfo = dp360LoanInfo;
    }

    public List<Dp360CreditCardInfo> getDp360CreditCardInfo() {
        return dp360CreditCardInfo;
    }

    public void setDp360CreditCardInfo(List<Dp360CreditCardInfo> dp360CreditCardInfo) {
        this.dp360CreditCardInfo = dp360CreditCardInfo;
    }

    public List<Dp360GuaranteeInfo> getDp360GuaranteeInfo() {
        return dp360GuaranteeInfo;
    }

    public void setDp360GuaranteeInfo(List<Dp360GuaranteeInfo> dp360GuaranteeInfo) {
        this.dp360GuaranteeInfo = dp360GuaranteeInfo;
    }

    public DtCustGraphicsOverviewW getDtCustGraphicsOverviewW() {
        return dtCustGraphicsOverviewW;
    }

    public void setDtCustGraphicsOverviewW(DtCustGraphicsOverviewW dtCustGraphicsOverviewW) {
        this.dtCustGraphicsOverviewW = dtCustGraphicsOverviewW;
    }

    public List<DtTyDpApCustIncidRelaW> getDtTyDpApCustIncidRelaW() {
        return dtTyDpApCustIncidRelaW;
    }

    public void setDtTyDpApCustIncidRelaW(List<DtTyDpApCustIncidRelaW> dtTyDpApCustIncidRelaW) {
        this.dtTyDpApCustIncidRelaW = dtTyDpApCustIncidRelaW;
    }

    public List<DtTyDpApLiabFinW> getDtTyDpApLiabFinWList() {
        return dtTyDpApLiabFinWList;
    }

    public void setDtTyDpApLiabFinWList(List<DtTyDpApLiabFinW> dtTyDpApLiabFinWList) {
        this.dtTyDpApLiabFinWList = dtTyDpApLiabFinWList;
    }

    public List<WTaskInfo> getwTaskInfos() {
        return wTaskInfos;
    }

    public void setwTaskInfos(List<WTaskInfo> wTaskInfos) {
        this.wTaskInfos = wTaskInfos;
    }

    public DtTyDpApPublicRecA getDtTyDpApPublicRecA() {
        return dtTyDpApPublicRecA;
    }

    public void setDtTyDpApPublicRecA(DtTyDpApPublicRecA dtTyDpApPublicRecA) {
        this.dtTyDpApPublicRecA = dtTyDpApPublicRecA;
    }

    public DtCrdtcScoreAndChangeW getDtCrdtcScoreAndChangeW() {
        return dtCrdtcScoreAndChangeW;
    }

    public void setDtCrdtcScoreAndChangeW(DtCrdtcScoreAndChangeW dtCrdtcScoreAndChangeW) {
        this.dtCrdtcScoreAndChangeW = dtCrdtcScoreAndChangeW;
    }

    public DtTyDpApLiabSituChangeW getDtTyDpApLiabSituChangeW() {
        return dtTyDpApLiabSituChangeW;
    }

    public void setDtTyDpApLiabSituChangeW(DtTyDpApLiabSituChangeW dtTyDpApLiabSituChangeW) {
        this.dtTyDpApLiabSituChangeW = dtTyDpApLiabSituChangeW;
    }

    public DtAcctExcepSituW getDtAcctExcepSituW() {
        return dtAcctExcepSituW;
    }

    public void setDtAcctExcepSituW(DtAcctExcepSituW dtAcctExcepSituW) {
        this.dtAcctExcepSituW = dtAcctExcepSituW;
    }

    public DtTyDpApLiabMatureSituW getDtTyDpApLiabMatureSituW() {
        return dtTyDpApLiabMatureSituW;
    }

    public void setDtTyDpApLiabMatureSituW(DtTyDpApLiabMatureSituW dtTyDpApLiabMatureSituW) {
        this.dtTyDpApLiabMatureSituW = dtTyDpApLiabMatureSituW;
    }

    public List<DtCustRiskCourAffiA> getDtCustRiskCourAffiAList() {
        return dtCustRiskCourAffiAList;
    }

    public void setDtCustRiskCourAffiAList(List<DtCustRiskCourAffiA> dtCustRiskCourAffiAList) {
        this.dtCustRiskCourAffiAList = dtCustRiskCourAffiAList;
    }

    public List<DtCustRiskCourtAffiA> getDtCustRiskCourtAffiAList() {
        return dtCustRiskCourtAffiAList;
    }

    public void setDtCustRiskCourtAffiAList(List<DtCustRiskCourtAffiA> dtCustRiskCourtAffiAList) {
        this.dtCustRiskCourtAffiAList = dtCustRiskCourtAffiAList;
    }

    public List<DtCustRiskExecAffiA> getDtCustRiskExecAffiAList() {
        return dtCustRiskExecAffiAList;
    }

    public void setDtCustRiskExecAffiAList(List<DtCustRiskExecAffiA> dtCustRiskExecAffiAList) {
        this.dtCustRiskExecAffiAList = dtCustRiskExecAffiAList;
    }

    public List<DtCustRiskAssetSqtA> getDtCustRiskAssetSqtAList() {
        return dtCustRiskAssetSqtAList;
    }

    public void setDtCustRiskAssetSqtAList(List<DtCustRiskAssetSqtA> dtCustRiskAssetSqtAList) {
        this.dtCustRiskAssetSqtAList = dtCustRiskAssetSqtAList;
    }

    public List<DtCustRiskAssetFrzA> getDtCustRiskAssetFrzAList() {
        return dtCustRiskAssetFrzAList;
    }

    public void setDtCustRiskAssetFrzAList(List<DtCustRiskAssetFrzA> dtCustRiskAssetFrzAList) {
        this.dtCustRiskAssetFrzAList = dtCustRiskAssetFrzAList;
    }

    public List<DtCustRiskFhfkDhSifacdkA> getDtCustRiskFhfkDhSifacdkA() {
        return dtCustRiskFhfkDhSifacdkA;
    }

    public void setDtCustRiskFhfkDhSifacdkA(List<DtCustRiskFhfkDhSifacdkA> dtCustRiskFhfkDhSifacdkA) {
        this.dtCustRiskFhfkDhSifacdkA = dtCustRiskFhfkDhSifacdkA;
    }

    public List<DtCustRiskLostCrdtAffiA> getDtCustRiskLostCrdtAffiAList() {
        return dtCustRiskLostCrdtAffiAList;
    }

    public void setDtCustRiskLostCrdtAffiAList(List<DtCustRiskLostCrdtAffiA> dtCustRiskLostCrdtAffiAList) {
        this.dtCustRiskLostCrdtAffiAList = dtCustRiskLostCrdtAffiAList;
    }

    public List<DtCustRiskRefereeDocA> getDtCustRiskRefereeDocAList() {
        return dtCustRiskRefereeDocAList;
    }

    public void setDtCustRiskRefereeDocAList(List<DtCustRiskRefereeDocA> dtCustRiskRefereeDocAList) {
        this.dtCustRiskRefereeDocAList = dtCustRiskRefereeDocAList;
    }

    public DtCustRiskTagW getDtCustRiskTagW() {
        return dtCustRiskTagW;
    }

    public void setDtCustRiskTagW(DtCustRiskTagW dtCustRiskTagW) {
        this.dtCustRiskTagW = dtCustRiskTagW;
    }

    public DtCustFinanceInfoW getDtCustFinanceInfoW() {
        return dtCustFinanceInfoW;
    }

    public void setDtCustFinanceInfoW(DtCustFinanceInfoW dtCustFinanceInfoW) {
        this.dtCustFinanceInfoW = dtCustFinanceInfoW;
    }

    public List<DpCustOutRating> getDpCustOutRating() {
        return dpCustOutRating;
    }

    public void setDpCustOutRating(List<DpCustOutRating> dpCustOutRating) {
        this.dpCustOutRating = dpCustOutRating;
    }
}
