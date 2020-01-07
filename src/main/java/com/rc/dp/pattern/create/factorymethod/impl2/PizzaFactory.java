package com.rc.dp.pattern.create.factorymethod.impl2;

/**
 * @ClassName PizzaFactory
 * @Description 披萨工厂方法抽象类
 * @Author liux
 * @Date 19-11-21 下午4:35
 * @Version 1.0
 */
public interface PizzaFactory {

    //由具体子工厂去完成相应生产
    Pizza createPizza(String orderType);
}
