package com.rc.dp.pattern.struct.proxy.jdk2;

import com.rc.dp.pattern.struct.proxy.mock.Proxy;

/**
 * @ClassName Main
 * @Description 此处使用的是自己模拟的jdk代理生成类
 * @Author liux
 * @Date 19-12-25 下午3:24
 * @Version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        Food food = (Food) Proxy.newProxyInstance(Food.class, new FoodHandler(new Apple()));
        food.taste();
    }
}
