package com.rc.dp.pattern.create.simplefactory;

/**
 * @ClassName GreekPizza
 * @Description 希腊披萨类
 * @Author liux
 * @Date 19-11-21 下午3:49
 * @Version 1.0
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 希腊披萨准备原材料... ");
    }
}
