package com.cc.factory.SimpleFactory;

public class ProductFactory {
    public static Product produce(String productName) throws Exception {
        switch (productName) {
            case "tv":
                return new TV();
            case "car":
                return new Car();
            default:
                throw new Exception("没有该产品");
        }
    }

    public static Product produceByInflect(String className) throws Exception {
        try {
            Product product = (Product) Class.forName(className).newInstance();
            return product;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new Exception("没有该产品");
    }

}
