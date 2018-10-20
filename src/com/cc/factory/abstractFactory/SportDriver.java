package com.cc.factory.abstractFactory;

public class SportDriver extends Driver {
    @Override
    public BenChiCar createBenChiCar(String car) {
        return new BenChiSportCar();
    }

    @Override
    public BaoMaCar createBaoMaCar(String car) {
        return new BaoMaSportCar();
    }
}
