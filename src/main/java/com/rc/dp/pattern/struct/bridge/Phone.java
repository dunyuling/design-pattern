package com.rc.dp.pattern.struct.bridge;

/**
 * @ClassName Phone
 * @Description 手机抽象类
 * @Author liux
 * @Date 19-12-3 下午1:47
 * @Version 1.0
 */
public abstract class Phone {

    protected Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected abstract void open();

    protected abstract void close();

    protected abstract void call();
}
