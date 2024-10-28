package com.recruit.common.observer.user;

import com.recruit.common.observer.Observer;
import com.recruit.common.util.SingleUtil;
import lombok.Data;

@Data
public class user extends Observer {

    /**
     * 观察者名字
     */
    public String name = "user";

    @Override
    public void update() {
        // 根据message和name存一条记录到全局map中：messageMap
        SingleUtil.messageMap.put(name, message);
    }
}
