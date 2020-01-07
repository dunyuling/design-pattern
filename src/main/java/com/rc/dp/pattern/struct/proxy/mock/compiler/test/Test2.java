package com.rc.dp.pattern.struct.proxy.mock.compiler.test;

import com.rc.dp.pattern.struct.proxy.mock.Animal;
import com.rc.dp.pattern.struct.proxy.mock.Movable;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

/**
 * @ClassName Test2
 * @Description 获取接口所有方法
 * @Author liux
 * @Date 19-12-24 下午12:59
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) throws NoSuchMethodException {
        /*Method[] methods = Movable.class.getMethods();
        for (Method method : methods) {
            System.out.println(Modifier.toString(method.getModifiers()) + "\t" + method.getReturnType() + "\t" + method.getName());
        }*/
//        System.out.println(Movable.class.getName());
        Class cl = Movable.class;
//        System.out.println(cl.getClass().getMethod("move"));
//        System.out.println(cl.getMethod("move"));
        System.out.println(cl.getName());
    }
}
