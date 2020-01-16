package com.rc.dp.pattern.struct.proxy.jingtai;

/**
 * @ClassName Main
 * @Description TODO
 * @Author liux
 * @Date 19-12-25 下午2:48
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.request();
    }
}
