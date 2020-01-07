package com.rc.dp.pattern.behaivor.observable;

/**
 * @ClassName Client
 * @Description TODO
 * @Author liux
 * @Date 20-1-5 下午4:57
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentCondition = new CurrentCondition();
        weatherData.registerObserver(currentCondition);
        Observer sinaCondition = new SinaCondition();
        weatherData.registerObserver(sinaCondition);

        weatherData.setData(1.0, 2.0, 3.0f);

        weatherData.notifyObservers();
    }
}
