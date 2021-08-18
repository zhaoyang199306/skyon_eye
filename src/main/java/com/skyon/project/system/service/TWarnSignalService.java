package com.skyon.project.system.service;

import com.skyon.project.system.domain.eye.DpApWarningSign;

import java.util.List;

/**
 * 参数配置 服务层
 * 
 *
 */
public interface TWarnSignalService
{
    public List<DpApWarningSign> selectTWarnSignal(String taskInfoNo);

    public int updateDpApWarningSign(List<DpApWarningSign> dpApWarningSigns);
}
