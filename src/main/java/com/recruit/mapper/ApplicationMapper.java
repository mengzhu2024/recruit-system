package com.recruit.mapper;

import com.recruit.common.mybatis.Page;
import com.recruit.model.ApplicationDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.recruit.model.result.ApplicationResultDO;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface ApplicationMapper extends BaseMapper<ApplicationDO> {

    IPage<ApplicationResultDO> getByHrId(Page<ApplicationResultDO> page, Integer hrID, Integer state);

    boolean updateState(Integer id, Integer state);

    IPage<ApplicationResultDO> sortByGrade(Page<ApplicationResultDO> page, Integer hrID);

    IPage<ApplicationResultDO> getByUserId(Page<ApplicationResultDO> page, Integer userId);

}
