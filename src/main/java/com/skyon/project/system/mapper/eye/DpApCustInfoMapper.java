package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DpApCustInfo;

// DpApCustInfo  - 个人客户信息表
public interface DpApCustInfoMapper {

    // 根据custNo 查询实体
    public DpApCustInfo getDpApCustInfoByNo(String custNo);


}
