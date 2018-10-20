package com.cc.builder;

public class ConcreteComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.add("组装cpu");
    }

    @Override
    public void buildMainBoard() {
        computer.add("组装主板");
    }

    @Override
    public void buildHd() {
        computer.add("组装硬盘");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
