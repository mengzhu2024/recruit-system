package com.recruit.mapper;

import com.recruit.model.ResumeDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface ResumeMapper extends BaseMapper<ResumeDO> {

    ResumeDO getByUserId(@Param("userId") Integer userId);
}
