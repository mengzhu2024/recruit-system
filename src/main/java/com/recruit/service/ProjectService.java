package com.recruit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.recruit.model.ProjectDO;

import java.util.List;

public interface ProjectService extends IService<ProjectDO> {

     List<ProjectDO> getByResumeId(Integer rid);
}
