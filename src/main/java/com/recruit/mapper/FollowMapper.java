package com.recruit.mapper;

import com.recruit.model.CompanyDO;
import com.recruit.model.FollowDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface FollowMapper extends BaseMapper<FollowDO> {

    List<CompanyDO> getByUserId(Integer userId);

    FollowDO getByUserIdAndCompanyId(Integer userId, Integer companyId);
}
