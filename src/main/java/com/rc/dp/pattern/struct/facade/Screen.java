package com.rc.dp.pattern.struct.facade;

/**
 * @ClassName DVDPlayer
 * @Description 屏幕类
 * @Author liux
 * @Date 19-12-14 下午5:04
 * @Version 1.0
 */
public class Screen {

    private Screen() {
    }

    private static Screen screen = new Screen();

    public static Screen getInstance() {
        return screen;
    }

    public void up() {
        System.out.println(" screen up ");
    }

    public void down() {
        System.out.println(" screen down ");
    }
}
