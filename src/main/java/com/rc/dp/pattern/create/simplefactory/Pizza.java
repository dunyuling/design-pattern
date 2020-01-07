package com.rc.dp.pattern.create.simplefactory;

/**
 * @ClassName Pizza
 * @Description 披萨抽象类
 * @Author liux
 * @Date 19-11-21 下午3:46
 * @Version 1.0
 */
public abstract class Pizza {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println(name + " bake...");
    }

    public void cut() {
        System.out.println(name + " cut...");
    }

    public void box() {
        System.out.println(name + " box...");
    }
}
