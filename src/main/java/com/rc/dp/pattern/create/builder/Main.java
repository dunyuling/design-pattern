package com.rc.dp.pattern.create.builder;

import java.util.concurrent.locks.LockSupport;

/**
 * @ClassName Main
 * @Description TODO
 * @Author liux
 * @Date 19-11-24 下午11:15
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
//        StringBuilder stringBuilder = new StringBuilder("abcd");
//        stringBuilder.append('e');
//        System.out.println(stringBuilder);

//        Thread t = new Thread(()->{
//            System.out.println("start");
//            LockSupport.park(); //一直wait
//            System.out.println("continue");
//        });
//        t.start();
//
//        Thread.sleep(1000);
//        LockSupport.unpark(t); //t线程解除wait态

        //一般用法
        TerrainBuilder terrainBuilder = new ComplexTerrainBuilder();
        Terrain terrain = terrainBuilder.buildWall().buildFort().buildMine().build();
        //new Terrain(Wall w, Fort f, Mine m)

        //典型用法
        new Person.PersonBuilder()
                .basicInfo(1, "zhangsan", 11)
                .weight(90)
                .score(100)
                .loc(new Location("changanjie", "11"))
                .build();

    }
}
