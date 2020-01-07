package com.rc.dp.pattern.create.singleton;

/**
 * @ClassName Main01
 * @Description 饿汉式 静态代码块
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
public class Main02 {
    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton2 {
    private Singleton2() {
    }

    private final static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}