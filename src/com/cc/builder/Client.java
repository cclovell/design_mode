package com.cc.builder;

public class Client {
    public static void main(String args[]) {
        Director director = new Director(); //指挥者
        ComputerBuilder computerBuilder = new ConcreteComputerBuilder(); //建造者

        director.construct(computerBuilder);  //指挥者只会建造者去组装产品

        Computer computer = computerBuilder.getComputer(); //获得产品

        computer.show();
    }
}
