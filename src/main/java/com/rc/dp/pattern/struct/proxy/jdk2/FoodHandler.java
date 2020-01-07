package com.rc.dp.pattern.struct.proxy.jdk2;

import com.rc.dp.pattern.struct.proxy.mock.InvocationHandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName FoodHandler
 * @Description TODO
 * @Author liux
 * @Date 19-12-25 下午3:19
 * @Version 1.0
 */
public class FoodHandler implements InvocationHandler {

    private Food food;

    public FoodHandler(Food food) {
        this.food = food;
    }

    @Override
    public void invoke(Method method, Object obj) {
        System.out.println("food handler start...");
        try {
            method.invoke(food);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("food handler end...");
    }
}
