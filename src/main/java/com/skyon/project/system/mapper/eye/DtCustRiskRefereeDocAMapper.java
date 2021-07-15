package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DtCustRiskRefereeDocA;

import java.util.List;

public interface DtCustRiskRefereeDocAMapper {
    public List<DtCustRiskRefereeDocA> selectDtCustRiskRefereeDocA(String custNo);
}
