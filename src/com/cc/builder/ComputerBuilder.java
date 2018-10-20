package com.cc.builder;

public interface ComputerBuilder {
    void buildCpu();
    void buildMainBoard();
    void buildHd();
    Computer getComputer();
}
