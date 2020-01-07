package com.rc.dp.pattern.create.simplefactory;

/**
 * @ClassName SimplePizzaFactory
 * @Description 披萨创建工厂
 * @Author liux
 * @Date 19-11-21 下午4:02
 * @Version 1.0
 */
public class SimplePizzaFactory {

    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType) {
            case "cheese":
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
                break;
            case "greek":
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            case "pepper":
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            default:
                System.out.println("没有这款产品...");
                break;
        }
        return pizza;
    }
}