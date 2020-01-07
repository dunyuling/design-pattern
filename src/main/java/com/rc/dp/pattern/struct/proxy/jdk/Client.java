package com.rc.dp.pattern.struct.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author liux
 * @Date 19-12-25 下午2:56
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {

        JdkRealSubject jdkRealSubject = new JdkRealSubject();
        //生成代理对象,其内部含有具体的代理业务处理逻辑
        JdkSubject proxyInstance = (JdkSubject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                jdkRealSubject.getClass().getInterfaces(), new JdkSubjectHandler(jdkRealSubject));

        proxyInstance.request();
        System.out.println("----");
        proxyInstance.response();
    }
}
