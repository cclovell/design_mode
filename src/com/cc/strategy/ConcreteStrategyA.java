package com.cc.strategy;

/**
 * @author chenchao
 * @date 2018/10/19 下午5:05
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyInterface() {
        System.out.println("我是策略A");
    }
}
