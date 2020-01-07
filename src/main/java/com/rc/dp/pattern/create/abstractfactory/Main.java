package com.rc.dp.pattern.create.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory f = new MagicFactory();

        Vehicle c = f.createVehicle();
        c.go();
        Weapon w = f.createWeapon();
        w.shoot();
        Food b = f.createFood();
        b.printName();
    }
}
