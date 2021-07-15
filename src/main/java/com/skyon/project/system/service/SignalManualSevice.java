package com.skyon.project.system.service;

import com.skyon.project.system.domain.ferghana.WTaskInfo;

import java.util.List;

public interface SignalManualSevice {

    public List getSignalManualList();

    public WTaskInfo getWTaskInfoListManualByCustNo(String custNo);
}
