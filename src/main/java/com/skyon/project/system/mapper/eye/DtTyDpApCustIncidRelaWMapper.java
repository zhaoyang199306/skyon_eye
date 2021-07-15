package com.skyon.project.system.mapper.eye;

import com.skyon.project.system.domain.eye.DpCustOutRating;
import com.skyon.project.system.domain.eye.DtTyDpApCustIncidRelaW;

import java.util.List;

public interface DtTyDpApCustIncidRelaWMapper {
    public List<DtTyDpApCustIncidRelaW> selectDtTyDpApCustIncidRelaW(String custNo);
}
