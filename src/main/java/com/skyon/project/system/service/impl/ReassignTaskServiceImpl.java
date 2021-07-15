package com.skyon.project.system.service.impl;

import com.skyon.common.utils.DateUtils;
import com.skyon.project.system.domain.ferghana.TReassignTaskDetail;
import com.skyon.project.system.domain.eye.TReassignTaskInfo;
import com.skyon.project.system.mapper.ReassignTaskMapper;
import com.skyon.project.system.mapper.SysUserMapper;
import com.skyon.project.system.mapper.TReassignTaskDetailMapper;
import com.skyon.project.system.service.ReassignTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class ReassignTaskServiceImpl implements ReassignTaskService {

    @Autowired
    private ReassignTaskMapper reassignTaskMapper;
    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    private TReassignTaskDetailMapper tReassignTaskDetailMapper;

    @Override
    public List getReassignTaskList() {
        return reassignTaskMapper.getReassignTaskList();
    }

    @Override
    public List<Map> getUnReassignTaskList() {
        return reassignTaskMapper.getUnReassignTaskList();
    }

    @Override
    public List<Map> selectReassignUserByRole(String role) {
        return userMapper.selectUserByRole(role);
    }

    @Override
    public int insertRessignTaskByArtificial(TReassignTaskInfo reassignTaskInfo) {
        reassignTaskInfo.setReassignTaskNo(joinReassignTaskNo());
        reassignTaskInfo.setTaskTotal(reassignTaskInfo.getReassignTaskDetails().size());
        int i = reassignTaskMapper.insertRessignTaskByArtificial(reassignTaskInfo);

        // 保存改派任务详细清单
        List<TReassignTaskDetail> reassignTaskDetails = reassignTaskInfo.getReassignTaskDetails();
        for (TReassignTaskDetail reassignTaskDetail : reassignTaskDetails) {
            reassignTaskDetail.setUuid(UUID.randomUUID().toString().replaceAll("-",""));
            reassignTaskDetail.setReassignTaskNo(reassignTaskInfo.getReassignTaskNo());
        }
        tReassignTaskDetailMapper.insertReassignTaskDetails(reassignTaskDetails);
        return i;
    }

    @Override
    public TReassignTaskInfo getReassignTaskByReassignTaskNo(String reassignTaskNo) {
        return reassignTaskMapper.getReassignTaskByReassignTaskNo(reassignTaskNo);
    }


    /**
     * 生成改派任务编号
     * @return
     */
    private String joinReassignTaskNo(){
        String startString = "GP";
        String dateString = DateUtils.dateTimeDetail();
        return startString + dateString;
    }

}
