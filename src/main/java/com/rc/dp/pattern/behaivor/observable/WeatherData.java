package com.rc.dp.pattern.behaivor.observable;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName WeatherData
 * @Description 天气预报服务
 * @Author liux
 * @Date 20-1-5 下午4:47
 * @Version 1.0
 */
public class WeatherData implements Subject {

    private List<Observer> observerList;
    private double temperature;
    private double pressure;
    private double humidity;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void setData(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(temperature, pressure, humidity));
    }
}
