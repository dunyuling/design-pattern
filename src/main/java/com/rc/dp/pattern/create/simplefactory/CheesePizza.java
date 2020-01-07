package com.rc.dp.pattern.create.simplefactory;

/**
 * @ClassName CheesePizza
 * @Description 奶酪披萨类
 * @Author liux
 * @Date 19-11-21 下午3:48
 * @Version 1.0
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 奶酪披萨准备原材料... ");
    }
}
