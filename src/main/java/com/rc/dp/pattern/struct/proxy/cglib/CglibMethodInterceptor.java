package com.rc.dp.pattern.struct.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName CglibMethodInterceptor
 * @Description cglib动态代理实现类
 * @Author liux
 * @Date 19-12-25 下午3:45
 * @Version 1.0
 */
public class CglibMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println(obj.getClass());
        System.out.println("#### cglib proxy before");
        Object result;
        try {
            result = proxy.invokeSuper(obj, args);
        } catch (Exception e) {
            System.out.println("#### ex: " + e.getMessage());
            throw e;
        } finally {
            System.out.println("#### cglib proxy after");
        }
        return result;
    }
}
