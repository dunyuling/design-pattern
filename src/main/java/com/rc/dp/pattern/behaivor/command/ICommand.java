package com.rc.dp.pattern.behaivor.command;

/**
 * @ClassName ICommand
 * @Description Command 接口类
 * @Author liux
 * @Date 19-12-27 下午2:26
 * @Version 1.0
 */
public interface ICommand {

    //执行命令
    void execute();

    //撤销命令
    void undo();
}
