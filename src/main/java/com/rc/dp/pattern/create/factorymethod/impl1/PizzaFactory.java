package com.rc.dp.pattern.create.factorymethod.impl1;

/**
 * @ClassName PizzaFactory
 * @Description 披萨工厂方法抽象类
 * @Author liux
 * @Date 19-11-21 下午4:35
 * @Version 1.0
 */
public abstract class PizzaFactory {

    //由具体子工厂去完成相应生产
    protected abstract Pizza create(String orderType);

    void createPizza(String orderType) {
        Pizza pizza = create(orderType);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
}
