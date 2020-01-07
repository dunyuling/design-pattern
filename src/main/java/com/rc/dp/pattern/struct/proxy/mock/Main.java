package com.rc.dp.pattern.struct.proxy.mock;

/**
 * @ClassName Main
 * @Description TODO
 * @Author liux
 * @Date 19-12-23 下午9:51
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
//        new TankTimeProxy(new TimeHandler()).eat();

        Animal movable = (Animal) Proxy.newProxyInstance(Animal.class,new TimeHandler(new Pig()));
        movable.eat();

//        movable.walk();
//        movable.move();

    }

    static void staticProxyTest() {
        Tank tank = new Tank();
        //单个代理
//        TankTimeProxy tankTimeProxy = new TankTimeProxy(tank);
//        tankTimeProxy.move();

        //多个代理1
//        TankLogProxy tankLogProxy = new TankLogProxy(tank);
//        TankTimeProxy tankTimeProxy = new TankTimeProxy(tankLogProxy);
//        tankTimeProxy.move();

        ////多个代理2
//        TankTimeProxy tankTimeProxy = new TankTimeProxy(tank);
//        TankLogProxy tankLogProxy = new TankLogProxy(tankTimeProxy);
//        tankLogProxy.move();
    }
}
