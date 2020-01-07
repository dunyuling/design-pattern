package com.rc.dp.pattern.create.singleton;

/**
 * @ClassName Main08
 * @Description 不仅可以解决线程同步，还可以防止反序列化。
 * @Author liux
 * @Date 19-11-20 下午6:11
 * @Version 1.0
 */
public class Main08 {


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Singleton8.INSTANCE.hashCode())).start();
        }
//        Singleton8.INSTANCE.say();
    }
}

enum Singleton8 {
    INSTANCE;

    public void say() {
        System.out.println("abcd");
    }
}
