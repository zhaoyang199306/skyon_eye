package com.skyon.project.system.service.impl;

import com.skyon.project.system.domain.*;
import com.skyon.project.system.mapper.*;
import com.skyon.project.system.mapper.eye.*;
import com.skyon.project.system.service.PanoramicViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanoramicViewServiceImpl implements PanoramicViewService {

    private final static String ALONG_PERSONAL = "个人";
    private final static String SMALL_COMPANY = "小微企业";

    @Autowired
    private PanoramicViewMapper panoramicViewMapper;
    @Autowired
    private DpApCustInfoMapper dpApCustInfoMapper; // 个人客户信息表
    @Autowired
    private DpApCompanyInfoMapper dpApCompanyInfoMapper;// 小微企业客户
    @Autowired
    private DtCustRiskTagWMapper dtCustRiskTagWMapper; // 客户风险_标签
    @Autowired
    private DtCustFinanceInfoWMapper dtCustFinanceInfoWMapper; // 客户风险_标签
    @Autowired
    private DpCustOutRatingMapper dpCustOutRatingMapper; //
    @Autowired
    private DtCustRiskRefereeDocAMapper dtCustRiskRefereeDocAMapper; // 客户风险_裁判文书
    @Autowired
    private DtCustRiskLostCrdtAffiAMapper dtCustRiskLostCrdtAffiAMapper;// 客户风险_失信公告
    @Autowired
    private DtCustRiskFhfkDhSifacdkAMapper dtCustRiskFhfkDhSifacdkAMapper;// 客户风险_司法查冻扣
    @Autowired
    private DtCustRiskAssetFrzAMapper dtCustRiskAssetFrzAMapper; // 客户风险_资产冻结
    @Autowired
    private DtCustRiskAssetSqtAMapper dtCustRiskAssetSqtAMapper; // 客户风险_资产查封
    @Autowired
    private DtCustRiskExecAffiAMapper dtCustRiskExecAffiAMapper; // 客户风险_执行公告
    @Autowired
    private DtCustRiskCourtAffiAMapper dtCustRiskCourtAffiAMapper; // 客户风险_法院公告
    @Autowired
    private DtCustRiskCourAffiAMapper dtCustRiskCourAffiAMapper; // 客户风险_开庭公告
    @Autowired
    private DtTyDpApLiabMatureSituWMapper dtTyDpApLiabMatureSituWMapper; // 征信_负债到期情况
    @Autowired
    private DtAcctExcepSituWMapper dtAcctExcepSituWMapper; // 征信_当前账户异常情况
    @Autowired
    private DtTyDpApLiabSituChangeWMapper dtTyDpApLiabSituChangeWMapper; // 征信_负债情况明显变化
    @Autowired
    private DtCrdtcScoreAndChangeWMapper dtCrdtcScoreAndChangeWMapper; // 征信_征信评分及变化
    @Autowired
    private DtTyDpApPublicRecAMapper dtTyDpApPublicRecAMapper; // 征信_公共记录
    @Autowired
    private DtTyDpApLiabFinWMapper dtTyDpApLiabFinWMapper;// 征信历史_负债融资
    @Autowired
    private DtTyDpApCustIncidRelaWMapper dtTyDpApCustIncidRelaWMapper; // 客户关联关系
    @Autowired
    private DtCustGraphicsOverviewWMapper dtCustGraphicsOverviewWMapper;// 融资明细
    @Autowired
    private Dp360LoanInfoMapper dp360LoanInfoMapper; // 授信贷款信息
    @Autowired
    private Dp360CreditCardInfoMapper dp360CreditCardInfoMapper; // 信用卡信息
    @Autowired
    private Dp360GuaranteeInfoMapper dp360GuaranteeInfoMapper;// 担保信息
    @Autowired
    private DpApTaskInfoMapper dpApTaskInfoMapper; //


    /**
     * 查询列表
     *
     * @return List
     */
    @Override
    public List selectDp360CustInfoList() {
        return panoramicViewMapper.selectDp360CustInfoList();
    }

    @Override
    public List selectPanoramicViewList() {
        return panoramicViewMapper.selectPanoramicViewList();
    }

    /**
     * 根据客户号查询客户详细信息
     *
     * @param custNo   客户号
     * @param custType 客户类型
     * @return T DpApCompanyInfo  - 小微企业客户   or  DpApCustInfo  - 个人客户信息表
     */
    @Override
    public Object getCustInfoByNo(String custNo, String custType) {
        if (ALONG_PERSONAL.equals(custType)) { // 个人
            return dpApCustInfoMapper.getDpApCustInfoByNo(custNo);
        } else if (SMALL_COMPANY.equals(custType)) { //小微
            return dpApCompanyInfoMapper.getDtSmMiniCorpCustWByNo(custNo);
        }
        return null;
    }

    @Override
    public PanoramicRiskViewTotal getPanoramicRiskViewTotalByNo(String custNo) {
        PanoramicRiskViewTotal total = new PanoramicRiskViewTotal();

        // 客户风险_标签
        total.setDtCustRiskTagW(dtCustRiskTagWMapper.selectDtCustRiskTagW(custNo));
        // 我行融资情况
        total.setDtCustFinanceInfoW(dtCustFinanceInfoWMapper.selectDtCustFinanceInfoW(custNo));
        // 客户外部评级表
        total.setDpCustOutRating(dpCustOutRatingMapper.selectDpCustOutRating(custNo).size() == 0 ?
                null : dpCustOutRatingMapper.selectDpCustOutRating(custNo));
        //
        total.setDpApTaskInfos(dpApTaskInfoMapper.selectWTaskInfoByCustNo(custNo).size() == 0?
                null : dpApTaskInfoMapper.selectWTaskInfoByCustNo(custNo));

        // 客户风险_裁判文书
        total.setDtCustRiskRefereeDocAList(dtCustRiskRefereeDocAMapper.selectDtCustRiskRefereeDocA(custNo).size() == 0 ?
                null : dtCustRiskRefereeDocAMapper.selectDtCustRiskRefereeDocA(custNo));
        // 客户风险_失信公告
        total.setDtCustRiskLostCrdtAffiAList(dtCustRiskLostCrdtAffiAMapper.selectDtCustRiskLostCrdtAffiA(custNo).size() == 0 ?
                null : dtCustRiskLostCrdtAffiAMapper.selectDtCustRiskLostCrdtAffiA(custNo));
        // 客户风险_司法查冻扣
        total.setDtCustRiskFhfkDhSifacdkA(dtCustRiskFhfkDhSifacdkAMapper.selectDtCustRiskFhfkDhSifacdkA(custNo).size() == 0 ?
                null : dtCustRiskFhfkDhSifacdkAMapper.selectDtCustRiskFhfkDhSifacdkA(custNo));
        // 客户风险_资产冻结
        total.setDtCustRiskAssetFrzAList(dtCustRiskAssetFrzAMapper.selectDtCustRiskAssetFrzA(custNo).size() == 0 ?
                null : dtCustRiskAssetFrzAMapper.selectDtCustRiskAssetFrzA(custNo));
        //客户风险_资产查封
        total.setDtCustRiskAssetSqtAList(dtCustRiskAssetSqtAMapper.selectDtCustRiskAssetSqtA(custNo).size() == 0 ?
                null : dtCustRiskAssetSqtAMapper.selectDtCustRiskAssetSqtA(custNo));
        // 客户风险_执行公告
        total.setDtCustRiskExecAffiAList(dtCustRiskExecAffiAMapper.selectDtCustRiskExecAffiA(custNo).size() == 0 ?
                null : dtCustRiskExecAffiAMapper.selectDtCustRiskExecAffiA(custNo));
        // 客户风险_法院公告
        total.setDtCustRiskCourtAffiAList(dtCustRiskCourtAffiAMapper.selectDtCustRiskCourtAffiA(custNo).size() == 0 ?
                null : dtCustRiskCourtAffiAMapper.selectDtCustRiskCourtAffiA(custNo));
        //客户风险_开庭公告
        total.setDtCustRiskCourAffiAList(dtCustRiskCourAffiAMapper.selectDtCustRiskCourAffiA(custNo).size() == 0 ?
                null : dtCustRiskCourAffiAMapper.selectDtCustRiskCourAffiA(custNo));
        return total;
    }

    @Override
    public PanoramicRiskViewTotal getPanoramicCreditTotalByNo(String custNo) {
        PanoramicRiskViewTotal total = new PanoramicRiskViewTotal();

        // 征信_负债到期情况
        total.setDtTyDpApLiabMatureSituW(dtTyDpApLiabMatureSituWMapper.selectDtTyDpApLiabMatureSituW(custNo));
        // 征信_当前账户异常情况
        total.setDtAcctExcepSituW(dtAcctExcepSituWMapper.selectDtAcctExcepSituW(custNo));
        // 征信_负债情况明显变化
        total.setDtTyDpApLiabSituChangeW(dtTyDpApLiabSituChangeWMapper.selectDtTyDpApLiabSituChangeW(custNo));
        // 征信_征信评分及变化
        total.setDtCrdtcScoreAndChangeW(dtCrdtcScoreAndChangeWMapper.selectDtCrdtcScoreAndChangeW(custNo));
        // 征信_公共记录
        total.setDtTyDpApPublicRecA(dtTyDpApPublicRecAMapper.selectDtTyDpApPublicRecA(custNo));

        // 征信历史_负债融资
        total.setDtTyDpApLiabFinWList(dtTyDpApLiabFinWMapper.selectDtTyDpApLiabFinW(custNo).size() == 0 ?
                null : dtTyDpApLiabFinWMapper.selectDtTyDpApLiabFinW(custNo));


        return total;
    }

    @Override
    public PanoramicRiskViewTotal getPanoramicRelationMapByNo(String custNo) {
        PanoramicRiskViewTotal total = new PanoramicRiskViewTotal();
        total.setDtTyDpApCustIncidRelaW(dtTyDpApCustIncidRelaWMapper.selectDtTyDpApCustIncidRelaW(custNo).size() == 0 ?
                null : dtTyDpApCustIncidRelaWMapper.selectDtTyDpApCustIncidRelaW(custNo));
        return total;
    }

    @Override
    public PanoramicRiskViewTotal getPanoramicFinacingByNo(String custNo) {
        PanoramicRiskViewTotal total = new PanoramicRiskViewTotal();
        // 融资明细
        total.setDtCustGraphicsOverviewW(dtCustGraphicsOverviewWMapper.selectDtCustGraphicsOverviewW(custNo));
        // 授信贷款信息
        total.setDp360LoanInfo(dp360LoanInfoMapper.selectDp360LoanInfo(custNo).size() == 0 ?
                null : dp360LoanInfoMapper.selectDp360LoanInfo(custNo));
        // 信用卡信息
        total.setDp360CreditCardInfo(dp360CreditCardInfoMapper.selectDp360CreditCardInfo(custNo).size() == 0 ?
                null : dp360CreditCardInfoMapper.selectDp360CreditCardInfo(custNo));
        // 担保信息
        total.setDp360GuaranteeInfo(dp360GuaranteeInfoMapper.selectDp360GuaranteeInfo(custNo).size() == 0 ?
                null : dp360GuaranteeInfoMapper.selectDp360GuaranteeInfo(custNo));
        return total;
    }
}
