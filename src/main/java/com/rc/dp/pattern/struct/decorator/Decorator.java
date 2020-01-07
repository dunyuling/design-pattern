package com.rc.dp.pattern.struct.decorator;

/**
 * @ClassName Decorator
 * @Description TODO
 * @Author liux
 * @Date 19-12-5 上午11:52
 * @Version 1.0
 */
public class Decorator extends Drink {

    protected Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    protected float cost() {
        return getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        return drink.getDesc() + " : " + drink.cost() + " && " + super.getDesc() + ":" + super.getPrice();
    }

//    @Override
//    public String getDesc() {
//        return drink.getDesc() + " && " + super.getDesc();
//    }
}
