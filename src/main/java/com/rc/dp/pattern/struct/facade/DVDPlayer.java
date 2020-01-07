package com.rc.dp.pattern.struct.facade;

/**
 * @ClassName DVDPlayer
 * @Description DVD播放器类
 * @Author liux
 * @Date 19-12-14 下午5:04
 * @Version 1.0
 */
public class DVDPlayer {

    private DVDPlayer() {
    }

    private static DVDPlayer dvdPlayer = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return dvdPlayer;
    }

    public void on() {
        System.out.println(" dvd execute ");
    }

    public void off() {
        System.out.println(" dvd undo ");
    }

    public void play() {
        System.out.println(" dvd play ");
    }

    public void pause() {
        System.out.println(" dvd pause ");
    }
}
