package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DpApWarningSign;

import java.util.List;

public interface DpApWarningSignMapper {

    public List<DpApWarningSign> selectDpApWarningSign(String taskInfoNo);

    public int updateDpApWarningSign(List<DpApWarningSign> dpApWarningSigns);
}
