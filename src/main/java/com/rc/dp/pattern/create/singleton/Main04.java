package com.rc.dp.pattern.create.singleton;

/**
 * @ClassName Main04
 * @Description 懒汉式 线程安全
 *  通过synchronized解决，但也带来效率下降
 * @Author liux
 * @Date 19-11-20 下午5:35
 * @Version 1.0
 */
public class Main04 {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton4.getInstance().hashCode());
            }).start();
        }
    }
}

class Singleton4 {

    private Singleton4() {
    }

    private static Singleton4 instance;

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            instance = new Singleton4();
        }
        return instance;
    }
}
