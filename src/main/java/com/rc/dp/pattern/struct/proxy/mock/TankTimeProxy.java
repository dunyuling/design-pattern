package com.rc.dp.pattern.struct.proxy.mock;
import java.lang.reflect.Method;
public class TankTimeProxy implements com.rc.dp.pattern.struct.proxy.mock.Animal {
    private com.rc.dp.pattern.struct.proxy.mock.InvocationHandler handler;
    public TankTimeProxy(InvocationHandler handler) {
        this.handler = handler;
    }
    @Override
    public void eat() {
        try {
            Method md = com.rc.dp.pattern.struct.proxy.mock.Animal.class.getMethod("eat");
            handler.invoke(md,this);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void walk() {
        try {
            Method md = com.rc.dp.pattern.struct.proxy.mock.Animal.class.getMethod("walk");
            handler.invoke(md,this);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
