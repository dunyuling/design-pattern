package com.rc.dp.pattern.struct.proxy.mock;

/**
 * @ClassName Pig
 * @Description TODO
 * @Author liux
 * @Date 19-12-24 下午1:31
 * @Version 1.0
 */
public class Pig implements Animal {
    @Override
    public void walk() {
        System.out.println("pig walk...");
    }

    @Override
    public void eat() {
        System.out.println("pig eat...");
    }
}
