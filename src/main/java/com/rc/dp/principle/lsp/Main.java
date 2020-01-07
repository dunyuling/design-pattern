package com.rc.dp.principle.lsp;

/**
 * @ClassName Main
 * @Description 分析：鸟一般都会飞行，如燕子的飞行速度大概是每小时 120 千米。 但是新西兰的几维鸟由于翅膀退化无法飞行。
 * 假如要设计一个实例，计算这两种鸟飞行 300 千米要花费的时间。 显然，拿燕子来测试这段代码，结果正确，能计算出所需要的时间；
 * 但拿几维鸟来测试，结果会发生“除零异常”或是“无穷大”，明显不符合预期，其类图如图'里氏替换原则_错误'所示。
 * @Author liux
 * @Date 19-11-18 下午2:24
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Bird bird1 = new Swallow();
        Bird bird2 = new BrownKiwi();
        bird1.setFlySpeed(120);
        bird2.setFlySpeed(120);
        System.out.println("如果飞行300公里");

        try {
            System.out.println("燕子飞行" + bird1.getFlyTime(300) + "小时");
            System.out.println("几维鸟飞行" + bird2.getFlyTime(300) + "小时");
        } catch (Exception err) {
            System.out.println("发生错误了!");
        }
    }
}

class Bird {
    double flySpeed;

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public double getFlyTime(double distance) {
        return distance / flySpeed;
    }
}

//燕子类
class Swallow extends Bird {
}

//几维鸟类
class BrownKiwi extends Bird {
    public void setFlySpeed(double flySpeed) {
        this.flySpeed = 0;
    }
}