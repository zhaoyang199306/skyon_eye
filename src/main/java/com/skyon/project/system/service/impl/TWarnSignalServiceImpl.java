package com.skyon.project.system.service.impl;

import com.skyon.project.system.domain.eye.DpApWarningSign;
import com.skyon.project.system.mapper.eye.DpApWarningSignMapper;
import com.skyon.project.system.service.TWarnSignalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TWarnSignalServiceImpl implements TWarnSignalService {

    @Autowired
    private DpApWarningSignMapper dpApWarningSignMapper;

    @Override
    public List<DpApWarningSign> selectTWarnSignal(String taskInfoNo) {
        return dpApWarningSignMapper.selectDpApWarningSign(taskInfoNo);
    }

    @Override
    public int updateDpApWarningSign(List<DpApWarningSign> dpApWarningSigns) {
        return dpApWarningSignMapper.updateDpApWarningSign(dpApWarningSigns);
    }
}
