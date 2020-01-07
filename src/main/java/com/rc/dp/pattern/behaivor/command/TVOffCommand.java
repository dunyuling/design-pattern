package com.rc.dp.pattern.behaivor.command;

/**
 * @ClassName LightOnCommand
 * @Description Command 实现类,  实现关电视功能
 * @Author liux
 * @Date 19-12-27 下午2:27
 * @Version 1.0
 */
public class TVOffCommand implements ICommand {

    private TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}
