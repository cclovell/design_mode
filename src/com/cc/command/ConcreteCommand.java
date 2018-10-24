package com.cc.command;

/**
 * 每个具体的命令都有一个对应的接受者，如果想加别的命令实现Command接口即可，易扩展
 *
 * @author chenchao
 * @date 2018/10/24 下午3:50
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
