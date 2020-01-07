package com.rc.dp.pattern.struct.proxy.jingtai;

/**
 * @ClassName RealSubject
 * @Description 目标对象类
 * @Author liux
 * @Date 19-12-25 下午2:46
 * @Version 1.0
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real subject reqeust...");
    }
}
