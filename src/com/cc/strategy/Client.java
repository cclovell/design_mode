package com.cc.strategy;

/**
 * 典型例子：报价
 * @author chenchao
 * @date 2018/10/19 下午5:08
 */
public class Client {
    public static void main(String args[]) {
        Strategy strategy =  new ConcreteStrategyA();
        Context context = new Context(strategy);
        context.contextInterface();
        context.setStrategy(new ConcreteStrategyB());
        context.contextInterface();
    }
}
