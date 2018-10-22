package com.cc.model;

/**
 * @author chenchao
 * @date 2018/10/22 下午6:04
 */
public class Client {
    public static void main(String args[]) {
        Drink drink = new Tea();
        drink.prepareRecipe();
        drink =  new Coffee();
        drink.prepareRecipe();
    }
}
