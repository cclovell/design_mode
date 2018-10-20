package com.cc.factory.FactoryMethod;

public class CarFactory implements Factory {
    @Override
    public Product produce() {
        return new Car();
    }
}
