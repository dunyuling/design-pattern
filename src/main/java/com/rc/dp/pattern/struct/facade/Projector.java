package com.rc.dp.pattern.struct.facade;

/**
 * @ClassName DVDPlayer
 * @Description 投影仪类
 * @Author liux
 * @Date 19-12-14 下午5:04
 * @Version 1.0
 */
public class Projector {

    private Projector() {
    }

    private static Projector projector = new Projector();

    public static Projector getInstance() {
        return projector;
    }

    public void on() {
        System.out.println(" projector execute ");
    }

    public void off() {
        System.out.println(" projector undo ");
    }

    public void focus() {
        System.out.println(" projector focus ");
    }
}
