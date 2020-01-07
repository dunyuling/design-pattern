package com.rc.dp.pattern.behaivor.observable;

/**
 * @ClassName Subject
 * @Description 被观察者接口
 * @Author liux
 * @Date 20-1-5 下午4:45
 * @Version 1.0
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
