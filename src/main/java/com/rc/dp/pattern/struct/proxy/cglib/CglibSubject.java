package com.rc.dp.pattern.struct.proxy.cglib;

/**
 * @ClassName CglibSubject
 * @Description cglib 动态代理接口类
 * @Author liux
 * @Date 19-12-25 下午3:43
 * @Version 1.0
 */
public abstract class CglibSubject {
    abstract void request();

    abstract void response();
}

/*public interface CglibSubject {
    void request();

    void response();
}*/
