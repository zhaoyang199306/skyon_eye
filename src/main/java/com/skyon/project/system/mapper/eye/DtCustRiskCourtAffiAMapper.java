package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DtCustRiskCourtAffiA;

import java.util.List;

public interface DtCustRiskCourtAffiAMapper {
    public List<DtCustRiskCourtAffiA> selectDtCustRiskCourtAffiA(String custNo);
}
