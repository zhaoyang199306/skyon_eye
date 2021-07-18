package com.skyon.project.system.service;

import com.skyon.project.system.domain.SysConfig;
import com.skyon.project.system.domain.eye.TWarnSignal;

import java.util.List;

/**
 * 参数配置 服务层
 * 
 *
 */
public interface TWarnSignalService
{
    public List<TWarnSignal> selectTWarnSignal(String taskInfoNo);
}
