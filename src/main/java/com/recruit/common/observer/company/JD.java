package com.recruit.common.observer.company;

import com.recruit.common.observer.Observer;
import com.recruit.common.observer.Subject;
import lombok.Data;

@Data
public class JD extends Subject {

    /**
    * 公司名
    */
    private String name = "京东";

    /**
    * 公司外文名
    */
    private static String foreignName ="JD";

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.setMessage(getName(), getState(), getPositionName());
            o.update();
        }
    }
}
