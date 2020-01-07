package com.rc.dp.pattern.struct.decorator;

/**
 * @ClassName Chocolate
 * @Description 巧克力配料类
 * @Author liux
 * @Date 19-12-5 上午11:57
 * @Version 1.0
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDesc(" 巧克力配料 ");
        setPrice(2.5f);
    }
}
