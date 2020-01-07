package com.rc.dp.pattern.create.singleton;

/**
 * @ClassName Main05
 * @Description 懒汉式 线程不安全
 * @Author liux
 * @Date 19-11-20 下午5:35
 * @Version 1.0
 */
public class Main05 {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton5.getInstance().hashCode());
            }).start();
        }
    }
}

class Singleton5 {

    private Singleton5() {
    }

    private static Singleton5 instance;

    public static Singleton5 getInstance() {
        if (instance == null) {
            //妄图通过减小同步代码块的方式提高效率，然后不可行
            synchronized (Singleton5.class) {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                instance = new Singleton5();
            }
        }
        return instance;
    }
}