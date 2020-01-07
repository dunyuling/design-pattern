package com.rc.dp.pattern.create.singleton;

/**
 * @ClassName Main04
 * @Description 懒加载 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 * @Author liux
 * @Date 19-11-20 下午5:35
 * @Version 1.0
 */
public class Main07 {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton7.getInstance().hashCode());
            }).start();
        }
    }
}

class Singleton7 {

    private Singleton7() {
    }

    //加载外部类时不会加载内部类
    private static class Singleton7Holder {
        private final static Singleton7 instance = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return Singleton7Holder.instance; //类装载时,线程安全
    }
}