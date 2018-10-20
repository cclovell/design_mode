package com.cc.factory.abstractFactory;

public abstract class Driver {
    public abstract BenChiCar createBenChiCar(String car);
    public abstract BaoMaCar createBaoMaCar(String car);
}
