package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DtCustRiskAssetSqtA;

import java.util.List;

public interface DtCustRiskAssetSqtAMapper {
    public List<DtCustRiskAssetSqtA> selectDtCustRiskAssetSqtA(String custNo);
}
