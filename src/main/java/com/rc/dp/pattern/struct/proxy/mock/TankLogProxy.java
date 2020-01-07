package com.rc.dp.pattern.struct.proxy.mock;

/**
 * @ClassName TankTimeProxy
 * @Description 记录tank的日志
 * @Author liux
 * @Date 19-12-23 下午9:47
 * @Version 1.0
 */
public class TankLogProxy implements Movable {

    private Movable movable;

    public TankLogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("日志打印开始...");
        movable.move();
        long end = System.currentTimeMillis();
        System.out.println("日志打印结束...");
    }
}
