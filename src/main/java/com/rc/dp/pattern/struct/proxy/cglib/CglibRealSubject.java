package com.rc.dp.pattern.struct.proxy.cglib;

import com.rc.dp.pattern.struct.proxy.jdk.JdkSubject;

/**
 * @ClassName JdkRealSubject
 * @Description cglib目标对象类
 * @Author liux
 * @Date 19-12-25 下午2:51
 * @Version 1.0
 */
public class CglibRealSubject extends CglibSubject {
    @Override
    public void request() {
        System.out.println("cglib real subject request...");
    }

    @Override
    public void response() {
        System.out.println("cglib real subject response...");
    }
}
