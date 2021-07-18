package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.TWarnSignal;

import java.util.List;

public interface TWarnSignalMapper {
    public List<TWarnSignal> selectTWarnSignal(String taskInfoNo);
}
