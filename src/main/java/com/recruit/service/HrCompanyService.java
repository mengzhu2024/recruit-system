package com.recruit.service;

import com.recruit.model.CompanyDO;
import com.recruit.model.HrCompanyDO;
import com.baomidou.mybatisplus.extension.service.IService;

public interface HrCompanyService extends IService<HrCompanyDO> {

    CompanyDO getCompany(Integer hrID);

    boolean create(Integer hrID, Integer companyID);

    HrCompanyDO getByHrId(Integer hrID);
}
