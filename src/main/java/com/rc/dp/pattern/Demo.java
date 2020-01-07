package com.rc.dp.pattern;

import java.io.IOException;
import java.util.HashSet;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author liux
 * @Date 19-11-27 上午12:57
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        /*HashSet<RectObject> set = new HashSet<RectObject>();
        RectObject r1 = new RectObject(3, 3);
        RectObject r2 = new RectObject(5, 5);
        RectObject r3 = new RectObject(3, 3);
        set.add(r1);
        set.add(r2);
        set.add(r3);
        r3.y = 7;
        System.out.println("删除前的大小size:" + set.size());//3
        set.remove(r3);
        System.out.println("删除后的大小size:" + set.size());//3*/

//        System.out.println(IC.a);

        IC ic = () -> System.out.println("--------");
        ic.a();
    }

    public interface ID {
        int id = 4;
    }
}

abstract class AB {

    private int a;

    protected int a(int a) throws IOException {
        double d = Double.valueOf("12.3");
        return 1;
    }

    abstract void ab();
}

class C extends AB {
    protected int a(int a) throws IOException {
        return 1;
    }

    int b(int b) {
        return 1;
    }

    int b(int a, int b) {
        return 2;
    }

    @Override
    void ab() {

    }
}

interface IC {
    int a = 3;

    void a();
}

class D extends AB implements IC {

    @Override
    public void a() {

    }

    @Override
    void ab() {

    }
}