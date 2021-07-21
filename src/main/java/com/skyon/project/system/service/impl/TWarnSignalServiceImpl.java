package com.skyon.project.system.service.impl;

import com.skyon.project.system.domain.eye.TWarnSignal;
import com.skyon.project.system.mapper.eye.TWarnSignalMapper;
import com.skyon.project.system.service.TWarnSignalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TWarnSignalServiceImpl implements TWarnSignalService {

    @Autowired
    private TWarnSignalMapper tWarnSignalMapper;

    @Override
    public List<TWarnSignal> selectTWarnSignal(String taskInfoNo) {
        return tWarnSignalMapper.selectTWarnSignal(taskInfoNo);
    }

    @Override
    public int updateTWarnSignal(List<TWarnSignal> tWarnSignals) {
        return tWarnSignalMapper.updateTWarnSignal(tWarnSignals);
    }
}
