package com.rc.dp.principle.ocp;

/**
 * @ClassName Main
 * @Description 违反开闭原则的示例
 * @Author liux
 * @Date 19-11-18 下午3:44
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}

//使用方
class Shape {

    int shape;

    void draw() {
        if (shape == 1) {
            drawCircle();
        } else if (shape == 2) {
            drawRectangle();
        } else if (shape == 3) {
            drawTriangle();
        }
    }

    private void drawCircle() {
        System.out.println(" 绘制圆形 ");
    }

    private void drawRectangle() {
        System.out.println(" 绘制长方形 ");
    }

    private void drawTriangle() {
        System.out.println(" 绘制三角形 ");
    }
}

//以下为提供方
//如果提供方需要新增图形,那么需要同时修改提供方和使用方
//圆形
class Circle extends Shape {

    Circle() {
        this.shape = 1;
    }
}

//长方形
class Rectangle extends Shape {

    Rectangle() {
        this.shape = 2;
    }
}

//新添三角形
class Triangle extends Shape {
    Triangle() {
        this.shape = 3;
    }
}
