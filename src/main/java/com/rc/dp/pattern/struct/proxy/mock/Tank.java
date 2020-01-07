package com.rc.dp.pattern.struct.proxy.mock;

import java.util.Random;

/**
 * @ClassName Tank
 * @Description TODO
 * @Author liux
 * @Date 19-12-23 下午9:40
 * @Version 1.0
 */
public class Tank implements Movable {
    @Override
    public void move() {
//        long start = System.currentTimeMillis();
        System.out.println("tank is moving...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        long end = System.currentTimeMillis();
//        System.out.println("time: " + (end - start));
    }
}
