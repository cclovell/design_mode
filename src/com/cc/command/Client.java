package com.cc.command;

/**
 * @author chenchao
 * @date 2018/10/24 下午3:56
 */
public class Client {
    public static void main(String args[]) {
        Invoker invoker = new Invoker();
        Receiver receiver =  new Receiver();
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);
        invoker.setCommand(concreteCommand);
        invoker.call();
    }
}
