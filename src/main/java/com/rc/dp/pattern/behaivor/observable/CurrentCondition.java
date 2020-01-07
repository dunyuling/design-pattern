package com.rc.dp.pattern.behaivor.observable;

/**
 * @ClassName CurrentCondition
 * @Description 气象台气象显示
 * @Author liux
 * @Date 20-1-5 下午4:47
 * @Version 1.0
 */
public class CurrentCondition implements Observer {

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
        System.out.println("==========current conditions...=========");
        System.out.println("temperature: " + temperature);
        System.out.println("pressure: " + pressure);
        System.out.println("humidity: " + humidity);
    }
}
