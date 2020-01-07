package com.rc.dp.pattern.struct.bridge;

/**
 * @ClassName Xiaomi
 * @Description TODO
 * @Author liux
 * @Date 19-12-3 下午2:12
 * @Version 1.0
 */
public class Xiaomi implements Brand {

    @Override
    public void open() {
        System.out.println(" 小米手机开机... ");
    }

    @Override
    public void close() {
        System.out.println(" 小米手机关机... ");
    }

    @Override
    public void call() {
        System.out.println(" 小米手机通话... ");
    }
}
