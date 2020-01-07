package com.rc.dp.pattern.struct.decorator;

/**
 * @ClassName Coffee
 * @Description 单品咖啡类
 * @Author liux
 * @Date 19-12-5 上午11:42
 * @Version 1.0
 */
public class Coffee extends Drink {

    @Override
    protected float cost() {
        return getPrice();
    }
}
