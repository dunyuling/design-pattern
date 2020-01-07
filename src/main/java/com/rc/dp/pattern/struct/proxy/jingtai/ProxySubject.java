package com.rc.dp.pattern.struct.proxy.jingtai;

/**
 * @ClassName ProxySubject
 * @Description 代理对象类
 * @Author liux
 * @Date 19-12-25 下午2:47
 * @Version 1.0
 */
public class ProxySubject implements Subject {

    private Subject realSubject;

    public ProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("proxy subject start...");
        realSubject.request();
        System.out.println("proxy subject end...");
    }
}
