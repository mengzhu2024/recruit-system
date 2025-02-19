package com.recruit.common.observer.company;

import com.recruit.common.observer.Observer;
import com.recruit.common.observer.Subject;
import lombok.Data;

@Data
public class Alibaba extends Subject {

    /**
    * 公司名
    */
    private String name = "阿里巴巴";

    /**
    * 公司外文名
    */
    private static String foreignName ="Alibaba";

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.setMessage(getName(), getState(), getPositionName());
            o.update();
        }
    }
}
