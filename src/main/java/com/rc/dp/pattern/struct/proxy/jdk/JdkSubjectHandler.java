package com.rc.dp.pattern.struct.proxy.jdk;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName JdkSubjectHandler
 * @Description 代理业务处理类
 * @Author liux
 * @Date 19-12-25 下午2:52
 * @Version 1.0
 */
public class JdkSubjectHandler implements InvocationHandler {

    private JdkSubject jdkSubject;

    public JdkSubjectHandler(JdkSubject jdkSubject) {
        this.jdkSubject = jdkSubject;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("jdk subject handler start...");
        Object o = null;
        try {
            o = method.invoke(jdkSubject);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("jdk subject handler end...");
        return o;
    }
}
