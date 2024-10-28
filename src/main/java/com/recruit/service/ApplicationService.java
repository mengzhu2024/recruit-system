package com.recruit.service;

import com.recruit.model.ApplicationDO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.recruit.model.result.ApplicationResultDO;
import com.recruit.vo.PageResponseVO;

public interface ApplicationService extends IService<ApplicationDO> {

    boolean create(ApplicationDO applicationDO);

    PageResponseVO<ApplicationResultDO> getByHrId(Integer count, Integer page, Integer hrID, Integer state);

    boolean updateState(Integer id, Integer state);

    PageResponseVO<ApplicationResultDO> sort(Integer count, Integer page, Integer hrID);

    PageResponseVO<ApplicationResultDO> getByUserId(Integer count, Integer page, Integer userId);
}
