package com.rc.dp.pattern.struct.bridge;

/**
 * @ClassName FoldedPhone
 * @Description 翻盖手机
 * @Author liux
 * @Date 19-12-3 下午1:49
 * @Version 1.0
 */
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        brand.open();
        System.out.println(" 翻盖手机开机... ");
    }

    @Override
    protected void close() {
        brand.open();
        System.out.println(" 翻盖手机关机... ");
    }

    @Override
    protected void call() {
        brand.open();
        System.out.println(" 翻盖手机通话... ");
    }
}
