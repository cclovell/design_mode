package com.cc.strategy;

/**
 * @author chenchao
 * @date 2018/10/19 下午5:04
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(){

        strategy.strategyInterface();
    }
}
