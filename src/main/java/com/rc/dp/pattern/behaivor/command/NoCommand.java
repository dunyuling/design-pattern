package com.rc.dp.pattern.behaivor.command;

/**
 * @ClassName NoCommand
 * @Description 接口的空实现类, 用来进行初始化,避免判空操作
 * @Author liux
 * @Date 19-12-27 下午2:33
 * @Version 1.0
 */
public class NoCommand implements ICommand {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
