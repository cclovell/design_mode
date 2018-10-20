package com.cc.factory.abstractFactory;

public class BusinessDriver extends Driver {
    @Override
    public BenChiCar createBenChiCar(String car) {
        return new BenChiBusinessCar();
    }

    @Override
    public BaoMaCar createBaoMaCar(String car) {
        return new BaoMaBusinessCar();
    }
}
