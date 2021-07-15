package com.skyon.project.system.service;

import com.skyon.project.system.domain.eye.EfficiencyAnalysisData;

public interface EfficiencyAnalysisService {

    // 查询效能分析全数据
    public EfficiencyAnalysisData getEfficiencyAnalysisData(String date);
}
