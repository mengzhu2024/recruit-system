package com.recruit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.recruit.model.ExperienceDO;

import java.util.List;

public interface ExperienceService extends IService<ExperienceDO> {
    List<ExperienceDO> getByResumeId(Integer rid);
}
