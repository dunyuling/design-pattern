package com.rc.dp.pattern.struct.facade;

/**
 * @ClassName DVDPlayer
 * @Description 立体声类
 * @Author liux
 * @Date 19-12-14 下午5:04
 * @Version 1.0
 */
public class Stereo {

    private Stereo() {
    }

    private static Stereo stereo = new Stereo();

    public static Stereo getInstance() {
        return stereo;
    }

    public void on() {
        System.out.println(" stereo execute ");
    }

    public void off() {
        System.out.println(" stereo undo ");
    }

    public void up() {
        System.out.println(" stereo up ");
    }
}
