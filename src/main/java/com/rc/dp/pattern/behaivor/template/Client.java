package com.rc.dp.pattern.behaivor.template;

/**
 * @ClassName Main
 * @Description TODO
 * @Author liux
 * @Date 19-12-26 上午9:51
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("---制作花生豆浆---");
        SoyMilk peanut = new PeanutSoyMilk();
        peanut.make();

        System.out.println();

        System.out.println("---制作红豆豆浆---");
        SoyMilk redBean = new RedBeanSoyMilk();
        redBean.make();

        System.out.println();
        System.out.println("---制作纯豆浆---");
        PureSoyMilk pureSoyMilk = new PureSoyMilk();
        pureSoyMilk.make();

    }
}
