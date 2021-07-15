package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DtCustRiskCourAffiA;

import java.util.List;

public interface DtCustRiskCourAffiAMapper {
    public List<DtCustRiskCourAffiA> selectDtCustRiskCourAffiA(String custNo);
}
