package com.cc.factory.FactoryMethod;

public class TvFactory implements Factory {
    @Override
    public Product produce() {
        return new Tv();
    }
}
