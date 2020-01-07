package com.rc.dp.pattern;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @ClassName HashCodeTest
 * @Description TODO
 * @Author liux
 * @Date 19-11-27 上午12:32
 * @Version 1.0
 */
public class HashCodeTest {

    public static void main(String[] args) {
        Collection set = new HashSet();
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 1);

        System.out.println(p1.equals(p2));
        set.add(p1);   //(1)
        set.add(p2);   //(2)
        set.add(p1);   //(3)
        System.out.println("p1.hashCode: " + p1.hashCode()
                + "\tp2.hashCode: " + p2.hashCode());

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }
    }
}

//重写equals
/*class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "x:" + x + ",y:" + y;
    }
}*/

//重写hashCode()
/*
class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "x:" + x + ",y:" + y;
    }

}*/

//重写hashCode()和equals()
class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "x:" + x + ",y:" + y;
    }

}


