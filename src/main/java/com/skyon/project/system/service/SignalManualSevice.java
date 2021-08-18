package com.skyon.project.system.service;

import com.skyon.project.system.domain.ferghana.DpApTaskInfo;

import java.util.List;

public interface SignalManualSevice {

    public List getSignalManualList();

    public DpApTaskInfo getWTaskInfoListManualByCustNo(String custNo);
}
