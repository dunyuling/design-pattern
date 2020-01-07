package com.rc.dp.pattern.behaivor.observable;

/**
 * @ClassName Observer
 * @Description 观察者接口
 * @Author liux
 * @Date 20-1-5 下午4:46
 * @Version 1.0
 */
public interface Observer {

    void update(double temperature, double pressure, double humidity);

}
