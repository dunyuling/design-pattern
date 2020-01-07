package com.rc.dp.pattern.behaivor.command;

/**
 * @ClassName Client
 * @Description TODO
 * @Author liux
 * @Date 19-12-27 下午2:42
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();

        //设置遥控器的第一排为开关灯按钮
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        remoteController.setOnCommands(0, lightOnCommand, lightOffCommand);

        System.out.println("----开灯按钮被按下---");
        remoteController.onCommandWasPushed(0);
        System.out.println("----关灯按钮被按下---");
        remoteController.offCommandWasPushed(0);
        System.out.println("----撤销按钮被按下---");
        remoteController.undo();

        System.out.println("==================");

        //设置遥控器的第二排为开关电视机按钮
        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        remoteController.setOnCommands(1, tvOnCommand, tvOffCommand);

        System.out.println("----开电视按钮被按下---");
        remoteController.onCommandWasPushed(1);
        System.out.println("----关电视按钮被按下---");
        remoteController.offCommandWasPushed(1);
        System.out.println("----撤销按钮被按下---");
        remoteController.undo();
    }
}
