package com.cc.command;

/**
 * @author chenchao
 * @date 2018/10/24 下午3:42
 */
public class Invoker {
    private Command command;

    public void call() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
