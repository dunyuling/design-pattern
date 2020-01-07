package com.rc.dp.pattern.behaivor.command;

/**
 * @ClassName LightOnCommand
 * @Description Command 实现类,  实现开电视功能
 * @Author liux
 * @Date 19-12-27 下午2:27
 * @Version 1.0
 */
public class TVOnCommand implements ICommand {

    private TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
