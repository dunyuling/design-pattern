package com.rc.dp.pattern.struct.facade;

/**
 * @ClassName DVDPlayer
 * @Description 爆米花机类
 * @Author liux
 * @Date 19-12-14 下午5:04
 * @Version 1.0
 */
public class Popcorn {

    private Popcorn() {
    }

    private static Popcorn popcorn = new Popcorn();

    public static Popcorn getInstance() {
        return popcorn;
    }

    public void on() {
        System.out.println(" popcorn execute ");
    }

    public void off() {
        System.out.println(" popcorn undo ");
    }

    public void pop() {
        System.out.println(" popcorn pop ");
    }
}
