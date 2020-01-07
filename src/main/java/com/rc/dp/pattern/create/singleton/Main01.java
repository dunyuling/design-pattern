package com.rc.dp.pattern.create.singleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * @ClassName Main01
 * @Description 饿汉式 静态变量
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用！
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 * Class.forName("")
 * （话说你不用的，你装载它干啥）
 * @Author liux
 * @Date 19-11-20 下午5:23
 * @Version 1.0
 */
public class Main01 {
    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1 == instance2);
    }
}


class Singleton1 {
    private Singleton1() {
    }

    private final static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }
}