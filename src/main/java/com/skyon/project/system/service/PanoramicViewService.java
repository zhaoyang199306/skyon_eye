package com.skyon.project.system.service;

import com.skyon.project.system.domain.*;

import java.util.List;

public interface PanoramicViewService {

    // 查询列表
    public List selectDp360CustInfoList();

    public List selectPanoramicViewList();

    // 根据客户号查询客户详细信息
    public Object getCustInfoByNo(String custNo, String custType);

    // 根据custNo查询全景视图的风险视图
    public PanoramicRiskViewTotal getPanoramicRiskViewTotalByNo(String custNo);

    // 根据custNo查询全景视图的人行征信
    public PanoramicRiskViewTotal getPanoramicCreditTotalByNo(String custNo);

    // 根据custNo查询全景视图的关系图谱
    public PanoramicRiskViewTotal getPanoramicRelationMapByNo(String custNo);

    // 根据custNo查询全景视图的全融资图
    public PanoramicRiskViewTotal getPanoramicFinacingByNo(String custNo);
}
