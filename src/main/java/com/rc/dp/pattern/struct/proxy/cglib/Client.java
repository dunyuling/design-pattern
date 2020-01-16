package com.rc.dp.pattern.struct.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @ClassName Main
 * @Description TODO
 * @Author liux
 * @Date 19-12-25 下午3:48
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        //生成代理类
        CglibSubject cglibSubject = (CglibSubject) Enhancer.create(CglibRealSubject.class,
                new CglibMethodInterceptor());

        cglibSubject.request();
        System.out.println();
        cglibSubject.response();
    }
}