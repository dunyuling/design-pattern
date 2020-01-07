package com.rc.dp.pattern.create.factorymethod.impl2;

import java.util.Scanner;

/**
 * @ClassName OrderPizza
 * @Description 订购披萨
 * @Author liux
 * @Date 19-11-21 下午4:41
 * @Version 1.0
 */
public class OrderPizza {

    private PizzaFactory pizzaFactory;

    public void setPizzaFactory(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public void order() {
        String location = getLocation();
        switch (location) {
            case "BJ":
                setPizzaFactory(new BJPizzaFactory());
                break;
            case "LD":
                setPizzaFactory(new LDPizzaFactory());
                break;
            default:
                System.out.println("相应地区没有工厂,请输入正确地址...");
                break;
        }

        if (pizzaFactory != null) {
            String orderType = getOrderType();
            Pizza pizza = pizzaFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }

    }

    private String getOrderType() {
        System.out.println("输入披萨类型(目前支持类型'cheese','pepper'):");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private String getLocation() {
        System.out.println("输入披萨产地(目前支持地址'BJ'(北京),'LD'(伦敦)):");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
