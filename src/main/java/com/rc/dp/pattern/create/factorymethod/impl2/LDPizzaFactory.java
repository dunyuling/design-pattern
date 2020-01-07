package com.rc.dp.pattern.create.factorymethod.impl2;

/**
 * @ClassName BJPizzaFactory
 * @Description 伦敦披萨工厂
 * @Author liux
 * @Date 19-11-21 下午4:46
 * @Version 1.0
 */
public class LDPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType) {
            case "cheese":
                pizza = new LDCheesePizza();
                pizza.setName("伦敦奶酪披萨");
                break;
            case "pepper":
                pizza = new LDPepperPizza();
                pizza.setName("伦敦胡椒披萨");
                break;
            default:
                System.out.println("伦敦披萨厂暂时不生产这种类型的披萨...");
                break;
        }
        return pizza;
    }
}
