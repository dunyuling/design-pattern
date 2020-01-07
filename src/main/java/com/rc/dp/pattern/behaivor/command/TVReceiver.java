package com.rc.dp.pattern.behaivor.command;

/**
 * @ClassName LightReceiver
 * @Description 具体执行命令的类
 * @Author liux
 * @Date 19-12-27 下午2:28
 * @Version 1.0
 */
public class TVReceiver {

    void on() {
        System.out.println("开电视...");
    }

    void off() {
        System.out.println("关电视...");
    }
}
