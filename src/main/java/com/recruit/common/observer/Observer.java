package com.recruit.common.observer;

public abstract class Observer {

    /**
     * 通知的内容
     */
    public String message;

    public void setMessage(String name, Integer state, String positionName) {
        if (state == 1) {
            message = name + "发布了新职位——" + positionName + "，快去看看吧！";
        } else {
            message = name + "下架了职位——" + positionName + "，快去看看吧！";
        }
    }

    public abstract void update();
}
