package com.recruit.service;

import com.recruit.dto.resume.CreateOrUpdateResumeDTO;
import com.recruit.model.ResumeDO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.recruit.vo.ResumeVO;

public interface ResumeService extends IService<ResumeDO> {

    ResumeVO getByUserId(Integer userId);

    boolean createResume(CreateOrUpdateResumeDTO validator);

    boolean updateResume(ResumeDO resumeDO, CreateOrUpdateResumeDTO validator);

    ResumeDO getSimpleByUserId(Integer userId);
}
