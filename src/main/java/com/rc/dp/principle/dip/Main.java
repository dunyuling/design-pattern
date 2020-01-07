package com.rc.dp.principle.dip;

/**
 * @ClassName Main
 * @Description 依赖倒置原则（Dependence Inversion Principle，DIP） 实现
 * @Author liux
 * @Date 19-11-15 下午6:32
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.read(new Email());
        person.read(new Sms());
    }
}


interface IReceiver {
    void receive();
}

class Email implements IReceiver {

    @Override
    public void receive() {
        System.out.println("email receive...");
    }
}

class Sms implements IReceiver {

    @Override
    public void receive() {
        System.out.println("短信 receive...");
    }
}

class Person {
    void read(IReceiver receiver) {
        receiver.receive();
    }
}