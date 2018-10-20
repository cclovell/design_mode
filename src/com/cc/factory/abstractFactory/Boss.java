package com.cc.factory.abstractFactory;

public class Boss {
    public static void main(String[] args) throws Exception {

        Driver d = new BusinessDriver();
        BaoMaCar car = d.createBaoMaCar("");
        car.drive();
    }
}
