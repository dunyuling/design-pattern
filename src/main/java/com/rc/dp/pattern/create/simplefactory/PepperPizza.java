package com.rc.dp.pattern.create.simplefactory;

/**
 * @ClassName PepperPizza
 * @Description 胡椒披萨类
 * @Author liux
 * @Date 19-11-21 下午4:00
 * @Version 1.0
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 胡椒披萨准备原材料... ");
    }
}
