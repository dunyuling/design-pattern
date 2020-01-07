package com.rc.dp.pattern.struct.proxy.mock;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName TimeHandler
 * @Description TODO
 * @Author liux
 * @Date 19-12-24 下午2:33
 * @Version 1.0
 */
public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    @Override
    public void invoke(Method method, Object obj) {
        long start = System.currentTimeMillis();
        System.out.println("start time: " + start);
        try {
            method.invoke(target);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("use time: " + (end - start));
    }
}