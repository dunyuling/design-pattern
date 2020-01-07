package com.rc.dp.pattern.struct.decorator;

/**
 * @ClassName Main
 * @Description TODO
 * @Author liux
 * @Date 19-12-5 上午11:58
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Drink drink1 = new LongBlack();
        System.out.println("单品LongBlack咖啡类 desc: " + drink1.getDesc() + "\t,price: " + drink1.cost());

        drink1 = new Soy(drink1);
        System.out.println("单品LongBlack咖啡类添加一份豆浆 desc: " + drink1.getDesc() + "\t,price: " + drink1.cost());
        drink1 = new Soy(drink1);
        System.out.println("单品LongBlack咖啡类添加2份豆浆 desc: " + drink1.getDesc() + "\t,price: " + drink1.cost());
    }
}
