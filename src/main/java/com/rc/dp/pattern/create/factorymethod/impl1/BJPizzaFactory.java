package com.rc.dp.pattern.create.factorymethod.impl1;

/**
 * @ClassName BJPizzaFactory
 * @Description 北京披萨工厂
 * @Author liux
 * @Date 19-11-21 下午4:46
 * @Version 1.0
 */
public class BJPizzaFactory extends PizzaFactory {
    @Override
    public Pizza create(String orderType) {
        Pizza pizza = null;
        switch (orderType) {
            case "cheese":
                pizza = new BJCheesePizza();
                pizza.setName("北京奶酪披萨");
                break;
            case "pepper":
                pizza = new BJPepperPizza();
                pizza.setName("北京胡椒披萨");
                break;
            default:
                System.out.println("北京披萨厂暂时不生产这种类型的披萨...");
                break;
        }
        return pizza;
    }
}
