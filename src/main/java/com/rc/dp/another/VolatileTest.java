package com.rc.dp.another;

/**
 * @ClassName VolatileTest
 * @Description TODO
 * @Author liux
 * @Date 20-1-9 下午4:23
 * @Version 1.0
 */
public class VolatileTest {
    public static volatile int count = 0;

    public static void increase() {
        count++;
    }

    private static final int THREAD_COUNT = 10;

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }

        while (Thread.activeCount() > 1) {
            Thread.yield();
        }

        System.out.println(count);
    }
}
