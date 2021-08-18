package com.skyon.project.system.service.impl;

import com.skyon.project.system.domain.ferghana.DpApTaskInfo;
import com.skyon.project.system.mapper.SignalManualMapper;
import com.skyon.project.system.mapper.DpApTaskInfoMapper;
import com.skyon.project.system.service.SignalManualSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignalManualSeviceImpl implements SignalManualSevice {

    @Autowired
    private SignalManualMapper signalManualMapper;

    @Autowired
    private DpApTaskInfoMapper taskInfoMapper;

    @Override
    public List getSignalManualList() {
        return taskInfoMapper.getWTaskInfoListByManual();
    }

    @Override
    public DpApTaskInfo getWTaskInfoListManualByCustNo(String custNo) {
        return taskInfoMapper.getWTaskInfoListManualByCustNo(custNo);
    }
}
