package com.rc.dp.pattern.behaivor.command;

/**
 * @ClassName LightOnCommand
 * @Description Command 实现类,  实现开灯功能
 * @Author liux
 * @Date 19-12-27 下午2:27
 * @Version 1.0
 */
public class LightOnCommand implements ICommand {

    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
