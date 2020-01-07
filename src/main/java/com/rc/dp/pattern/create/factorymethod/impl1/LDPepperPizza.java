package com.rc.dp.pattern.create.factorymethod.impl1;

/**
 * @ClassName PepperPizza
 * @Description 伦敦胡椒披萨类
 * @Author liux
 * @Date 19-11-21 下午4:00
 * @Version 1.0
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 伦敦胡椒披萨准备原材料... ");
    }
}
