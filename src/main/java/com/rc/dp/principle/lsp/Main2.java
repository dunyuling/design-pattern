package com.rc.dp.principle.lsp;

/**
 * @ClassName Main2
 * @Description
 *  Main程序运行错误的原因是：几维鸟类重写了鸟类的setFlySpeed(double flySpeed)方法，这违背了里氏替换原则。
 * 正确的做法是：取消几维鸟原来的继承关系，定义鸟和几维鸟的更一般的父类，如动物类，它们都有奔跑的能力。
 * 几维鸟的飞行速度虽然为 0，但奔跑速度不为 0，可以计算出其奔跑 300 千米所要花费的时间。
 * 其类图如图'里氏替换原则_正确'所示。
 * @Author liux
 * @Date 19-11-18 下午2:24
 * @Version 1.0
 */
public class Main2 {

    public static void main(String[] args) {
        Bird2 bird21 = new Swallow2();
        Animal bird22 = new BrownKiwi2();
        bird21.setFlySpeed(120);
        bird22.setRunSpeed(20);
        System.out.println("如果飞行300公里");

        try {
            System.out.println("燕子飞行" + bird21.getFlyTime(300) + "小时");
            System.out.println("几维鸟爬行" + bird22.getRunTime(300) + "小时");
        } catch (Exception err) {
            System.out.println("发生错误了!");
        }
    }
}

class Animal {
    double runSpeed;

    public void setRunSpeed(double runSpeed) {
        this.runSpeed = runSpeed;
    }

    public double getRunTime(double distance) {
        return distance / runSpeed;
    }
}

class Bird2 extends Animal {
    double flySpeed;

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public double getFlyTime(double distance) {
        return distance / flySpeed;
    }
}

//燕子类
class Swallow2 extends Bird2 {
}

//几维鸟类
class BrownKiwi2 extends Animal {
}