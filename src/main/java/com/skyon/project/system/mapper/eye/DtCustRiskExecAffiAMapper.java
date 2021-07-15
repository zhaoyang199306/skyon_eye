package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DtCustRiskExecAffiA;

import java.util.List;

public interface DtCustRiskExecAffiAMapper {
    public List<DtCustRiskExecAffiA> selectDtCustRiskExecAffiA(String custNo);
}
