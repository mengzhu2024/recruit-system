package com.recruit.service;

import com.recruit.model.NotifyDO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface NotifyService extends IService<NotifyDO> {

    boolean create(NotifyDO notifyDO);

    List<NotifyDO> get(String userName, String isRead);

    List<NotifyDO> getAll(String userName);

    boolean update(String userName);
}
