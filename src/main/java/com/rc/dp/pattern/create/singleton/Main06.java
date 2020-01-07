package com.rc.dp.pattern.create.singleton;

/**
 * @ClassName Main06
 * @Description 懒汉式 线程安全
 * @Author liux
 * @Date 19-11-20 下午5:35
 * @Version 1.0
 */
public class Main06 {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton6.getInstance().hashCode());
            }).start();
        }
    }
}

class Singleton6 {

    private Singleton6() {
    }

    private static volatile Singleton6 instance; //JIT

    public static Singleton6 getInstance() {
        if (instance == null) {
            //双重检查
            synchronized (Singleton6.class) {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}