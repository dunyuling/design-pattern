package com.rc.dp.pattern.struct.proxy.jdk2;

/**
 * @ClassName Apple
 * @Description TODO
 * @Author liux
 * @Date 19-12-25 下午3:18
 * @Version 1.0
 */
public class Apple implements Food {

    @Override
    public void taste() {
        System.out.println("this is a apple");
    }
}
