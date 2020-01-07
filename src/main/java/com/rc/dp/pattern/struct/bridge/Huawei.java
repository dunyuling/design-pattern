package com.rc.dp.pattern.struct.bridge;

/**
 * @ClassName Huawei
 * @Description TODO
 * @Author liux
 * @Date 19-12-3 下午1:46
 * @Version 1.0
 */
public class Huawei implements Brand {

    @Override
    public void open() {
        System.out.println(" 华为手机开机... ");
    }

    @Override
    public void close() {
        System.out.println(" 华为手机关机... ");
    }

    @Override
    public void call() {
        System.out.println(" 华为手机通话... ");
    }
}
