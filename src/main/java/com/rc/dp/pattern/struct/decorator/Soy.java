package com.rc.dp.pattern.struct.decorator;

/**
 * @ClassName Soy
 * @Description 豆浆配料类
 * @Author liux
 * @Date 19-12-5 上午11:51
 * @Version 1.0
 */
public class Soy extends Decorator {

    public Soy(Drink drink) {
        super(drink);
        setDesc(" 豆浆配料 ");
        setPrice(1.5f);
    }

//    @Override
//    public float getPrice() {
//        return drink.getPrice() + super.getPrice();
//    }
}
