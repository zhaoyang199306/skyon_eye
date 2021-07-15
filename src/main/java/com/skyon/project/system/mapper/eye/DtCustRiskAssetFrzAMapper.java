package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DtCustRiskAssetFrzA;

import java.util.List;

public interface DtCustRiskAssetFrzAMapper {
    public List<DtCustRiskAssetFrzA> selectDtCustRiskAssetFrzA(String custNo);
}
