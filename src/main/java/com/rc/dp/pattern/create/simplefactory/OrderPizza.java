package com.rc.dp.pattern.create.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description 订购披萨
 * @Author liux
 * @Date 19-11-21 下午3:50
 * @Version 1.0
 */
public class OrderPizza {

    //不通过SimplePizzaFactory,自己实现订购
    //如果有多处订购,修改时将要多处修改,违背OCP原则
    /*public void order() {

        do {
            String orderType = getOrderType();
            Pizza pizza;
            if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            } else {
                System.out.println("没有这款产品...");
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }*/

    //通过SimplePizzaFactory实现订购
    //如果有多处订购,只需要修改SimplePepperFactory,符合OCP原则
    public void orderByFactory() {
        Pizza pizza;
        do {
            pizza = SimplePizzaFactory.createPizza(getOrderType());
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                break;
            }
        } while (true);

    }

    private String getOrderType() {
        try {
            System.out.println("输入披萨类型:");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String str = bufferedReader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
