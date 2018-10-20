package com.cc.factory.SimpleFactory;

public class Client {
    public static void main(String args[]) {
        try {
            ProductFactory.produce("tv");
            ProductFactory.produceByInflect("com.cc.factory.SimpleFactory.Car");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
