package com.rc.dp.pattern.create.singleton;

/**
 * @ClassName Main03
 * @Description 懒汉式 线程不安全
 * @Author liux
 * @Date 19-11-20 下午5:35
 * @Version 1.0
 */
public class Main03 {

    public static void main(String[] args) {
        //多线程不安全
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton3.getInstance().hashCode());
            }).start();
        }

        //单线程安全
        /*System.out.println(Singleton3.getInstance().hashCode());
        System.out.println(Singleton3.getInstance().hashCode());*/
    }
}

class Singleton3 {

    private Singleton3() {
    }

    private static Singleton3 instance;

    public static Singleton3 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            instance = new Singleton3();
        }
        return instance;
    }
}
