package com.rc.dp.pattern.struct.bridge;

/**
 * @ClassName UpRightPhone
 * @Description 直板手机
 * @Author liux
 * @Date 19-12-3 下午1:50
 * @Version 1.0
 */
public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        brand.open();
        System.out.println(" 直板手机开机... ");
    }

    @Override
    protected void close() {
        brand.close();
        System.out.println(" 直板手机关机... ");
    }

    @Override
    protected void call() {
        brand.call();
        System.out.println(" 直板手机通话... ");
    }
    
}
