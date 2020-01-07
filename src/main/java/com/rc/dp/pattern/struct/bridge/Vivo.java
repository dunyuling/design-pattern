package com.rc.dp.pattern.struct.bridge;

/**
 * @ClassName Vivo
 * @Description TODO
 * @Author liux
 * @Date 19-12-3 下午1:47
 * @Version 1.0
 */
public class Vivo implements Brand {

    @Override
    public void open() {
        System.out.println(" Vivo手机开机... ");
    }

    @Override
    public void close() {
        System.out.println(" Vivo手机关机... ");
    }

    @Override
    public void call() {
        System.out.println(" Vivo手机通话... ");
    }
}
