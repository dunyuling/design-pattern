package com.rc.dp.principle.ocp;

/**
 * @ClassName Main2
 * @Description 符合开闭原则的示例
 * @Author liux
 * @Date 19-11-18 下午3:44
 * @Version 1.0
 */
public class Main2 {
    public static void main(String[] args) {
        Shape2 circle2 = new Circle2();
        Shape2 rectangle2 = new Rectangle2();
        Shape2 triangle2 = new Triangle2();

        circle2.draw();
        rectangle2.draw();
        triangle2.draw();
    }
}

//使用方
abstract class Shape2 {
    abstract void draw();
}

//以下为提供方
//如果提供方需要新增图形,只需要修改提供方
//圆形
class Circle2 extends Shape2 {

    @Override
    void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

//长方形
class Rectangle2 extends Shape2 {

    @Override
    void draw() {
        System.out.println(" 绘制长方形 ");
    }
}

//新添三角形
class Triangle2 extends Shape2 {

    @Override
    void draw() {
        System.out.println(" 绘制三角形 ");
    }
}