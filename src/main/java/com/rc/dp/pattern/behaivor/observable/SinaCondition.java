package com.rc.dp.pattern.behaivor.observable;

/**
 * @ClassName SinaCondition
 * @Description 新浪天气服务
 * @Author liux
 * @Date 20-1-5 下午5:00
 * @Version 1.0
 */
public class SinaCondition implements Observer {

    private double temperature;
    private double pressure;
    private double humidity;

    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("==========sina conditions...=========");
        System.out.println("temperature: " + temperature);
        System.out.println("pressure: " + pressure);
        System.out.println("humidity: " + humidity);
    }
}
