package com.rc.dp.pattern.struct.proxy.jdk;

/**
 * @ClassName JdkRealSubject
 * @Description jdk目标对象类
 * @Author liux
 * @Date 19-12-25 下午2:51
 * @Version 1.0
 */
public class JdkRealSubject implements JdkSubject {
    @Override
    public void request() {
        System.out.println("jdk real subject request...");
    }

    @Override
    public void response() {
        System.out.println("jdk real subject response...");
    }
}
