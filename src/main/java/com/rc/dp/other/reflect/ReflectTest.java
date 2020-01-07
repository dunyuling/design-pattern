package com.rc.dp.other.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName ReflectTest
 * @Description TODO
 * @Author liux
 * @Date 19-12-20 上午12:36
 * @Version 1.0
 */
public class ReflectTest {
    public static Car initByDefaultConst() throws Throwable {

        //①通过类装载器获取Car类对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.rc.dp.other.reflect.Car");

        //②获取类的默认构造器对象并通过它实例化Car
        Constructor cons = clazz.getDeclaredConstructor((Class[]) null);
        Car car = (Car) cons.newInstance();

        //③通过反射方法设置属性
        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "红旗CA72");
        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "黑色");
        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 200);

        Field brandField = clazz.getDeclaredField("age");
//        brandField.setAccessible(true);
        Object obj = brandField.get(car);
        System.out.println("obj: " + obj);
        System.out.println("super class: " + clazz.getSuperclass());
        return car;
    }

    public static void main(String[] args) throws Throwable {
//        Car car = initByDefaultConst();
//        car.introduce();
//        System.out.println(car.getClass());
        reflectInterface();

    }

    //TODO 没有测通
    static void reflectInterface() throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.rc.dp.other.reflect.IC");

        Constructor cons = clazz.getDeclaredConstructor((Class[]) null);
        IC ic = (IC) cons.newInstance();
        System.out.println(ic.a);
    }
}

interface IC {
    int a = 123;
}
