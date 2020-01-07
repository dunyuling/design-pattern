package com.rc.dp.pattern.struct.facade;

/**
 * @ClassName TheaterLight
 * @Description 影院灯光类
 * @Author liux
 * @Date 19-12-14 下午5:10
 * @Version 1.0
 */
public class TheaterLight {
    private TheaterLight() {
    }

    private static TheaterLight theaterLight = new TheaterLight();

    public static TheaterLight getInstance() {
        return theaterLight;
    }

    public void on() {
        System.out.println(" theaterLight execute ");
    }

    public void off() {
        System.out.println(" theaterLight undo ");
    }

    public void bright() {
        System.out.println(" theaterLight bright ");
    }

    public void dim() {
        System.out.println(" theaterLight dim ");
    }
}
