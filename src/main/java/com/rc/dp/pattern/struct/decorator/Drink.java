package com.rc.dp.pattern.struct.decorator;

/**
 * @ClassName Drink
 * @Description TODO
 * @Author liux
 * @Date 19-12-5 上午11:40
 * @Version 1.0
 */
public abstract class Drink {

    private String desc;

    private float price;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    protected abstract float cost();
}
