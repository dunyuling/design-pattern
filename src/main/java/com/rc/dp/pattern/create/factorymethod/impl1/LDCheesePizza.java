package com.rc.dp.pattern.create.factorymethod.impl1;

/**
 * @ClassName CheesePizza
 * @Description 伦敦奶酪披萨类
 * @Author liux
 * @Date 19-11-21 下午3:48
 * @Version 1.0
 */
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 伦敦奶酪披萨准备原材料... ");
    }
}
