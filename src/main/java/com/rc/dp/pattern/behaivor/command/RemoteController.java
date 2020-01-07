package com.rc.dp.pattern.behaivor.command;

/**
 * @ClassName RemoteController
 * @Description 遥控器类, 触发命令的执行
 * @Author liux
 * @Date 19-12-27 下午2:35
 * @Version 1.0
 */
public class RemoteController {

    private final ICommand[] onCommands = new ICommand[5];
    private final ICommand[] offCommands = new ICommand[5];

    //撤销命令
    private ICommand undoCommand;

    public RemoteController() {
        //初始化时,所有的命令尚不知道如何具体执行,因此设为空命令
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //设置具体的一组命令
    void setOnCommands(int num, ICommand onCommand, ICommand offCommand) {
        onCommands[num] = onCommand;
        offCommands[num] = offCommand;
    }

    //on 按钮被触发
    void onCommandWasPushed(int num) {
        onCommands[num].execute();
        undoCommand = onCommands[num];
    }

    //off 按钮被触发
    void offCommandWasPushed(int num) {
        offCommands[num].execute();
        undoCommand = offCommands[num];
    }

    void undo() {
        undoCommand.undo();
    }

}
