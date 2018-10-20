package com.cc.builder;

/**
 * 指挥者面向抽象建造者编程
 *
 */
public class Director {

    public void construct(ComputerBuilder computerBuilder) {
        computerBuilder.buildCpu();
        computerBuilder.buildHd();
        computerBuilder.buildMainBoard();
    }
}
