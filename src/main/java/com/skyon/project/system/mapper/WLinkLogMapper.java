package com.skyon.project.system.mapper;

import com.skyon.project.system.domain.ferghana.WLinkLog;

import java.util.List;

public interface WLinkLogMapper {

    public int insertWLinkLog(WLinkLog wLinkLog);

    // 根据taskInfoNo查询流程信息
    public List<WLinkLog> getListByTaskInfoNo(String taskInfoNo);

    // 根据taskInfoNo查询流程信息
    public int deleteWLinkLog(String taskInfoNo);

}
