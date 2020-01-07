package com.rc.dp.principle.isp;

/**
 * @ClassName Main2
 * @Description 接口隔离原则（Interface Segregation Principle，ISP）实现 方式2
 * @Author liux
 * @Date 19-11-15 下午5:25
 * @Version 1.0
 */
public class Main2 {
    public static void main(String[] args) {
        A a = new A();
        a.m1(new B());
        a.m2(new B());
        a.m3(new B());

        System.out.println();

        C c = new C();
        c.m1(new D());
        c.m4(new D());
        c.m5(new D());
    }
}

//接口1
interface Interface1 {
    void operation1();
}

//接口2
interface Interface2 {
    void operation2();

    void operation3();
}

//接口3
interface Interface3 {
    void operation4();

    void operation5();
}

//类B实现接口Interface1,Interface2
class B implements Interface1, Interface2 {

    @Override
    public void operation1() {
        System.out.println("类B实现的...接口Interface1的...operation1方法");
    }

    @Override
    public void operation2() {
        System.out.println("类B实现的...接口Interface2的...operation2方法");
    }

    @Override
    public void operation3() {
        System.out.println("类B实现的...接口Interface2的...operation3方法");
    }
}

//类B实现接口Interface1,Interface3
class D implements Interface1, Interface3 {

    @Override
    public void operation1() {
        System.out.println("类D实现的...接口Interface1的...operation1方法");
    }

    @Override
    public void operation4() {
        System.out.println("类D实现的...接口Interface3的...operation4方法");
    }

    @Override
    public void operation5() {
        System.out.println("类D实现的...接口Interface3的...operation5方法");
    }
}

//类A通过接口Interface1,Interface2 调用类B的方法
class A {
    void m1(Interface1 interface1) {
        interface1.operation1();
    }

    void m2(Interface2 interface2) {
        interface2.operation2();
    }

    void m3(Interface2 interface2) {
        interface2.operation3();
    }
}

//类C通过接口Interface1,Interface3 调用类D的方法
class C {
    void m1(Interface1 interface1) {
        interface1.operation1();
    }

    void m4(Interface3 interface3) {
        interface3.operation4();
    }

    void m5(Interface3 interface3) {
        interface3.operation5();
    }
}