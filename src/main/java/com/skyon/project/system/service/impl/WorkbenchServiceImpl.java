package com.skyon.project.system.service.impl;

import com.skyon.project.system.mapper.WorkbenchMapper;
import com.skyon.project.system.service.WorkbenchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WorkbenchServiceImpl implements WorkbenchService {
    @Autowired
    private WorkbenchMapper workbenchMapper;

    @Override
    public Map queryWorkbenchTaskcount() {
        Map map = new HashMap();
        map.put("taskInfoCount",workbenchMapper.queryTaskInfoCount());
        map.put("disposalTrackCount",workbenchMapper.queryDisposalTrackCount());
        map.put("removeRiskCount",workbenchMapper.queryRemoveRiskCount());
        map.put("signalManualCount",workbenchMapper.querySignalManualCount());
        map.put("manageFlowCount",workbenchMapper.queryBlackManageFlowCount());
        map.put("reassignTaskCount",workbenchMapper.queryReassignTaskCount());
        return map;
    }
}
