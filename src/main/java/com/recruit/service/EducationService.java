package com.recruit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.recruit.model.EducationDO;

import java.util.List;

public interface EducationService extends IService<EducationDO> {
    List<EducationDO> getByResumeId(Integer rid);
}
