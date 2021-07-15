package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DtTyDpApIndvCustW;

// DtTyDpApIndvCustW  - 个人客户信息表
public interface DtTyDpApIndvCustWMapper {

    // 根据custNo 查询实体
    public DtTyDpApIndvCustW getDtTyDpApIndvCustWByNo(String custNo);


}
