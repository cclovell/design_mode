package com.cc.model;

/**
 * @author chenchao
 * @date 2018/10/22 下午6:00
 */
public class Coffee extends Drink {
    @Override
    public void brew() {
        System.out.println("加入一块钱一包的咖啡粉冲泡");
    }

    @Override
    public void pourInCup() {
        System.out.println("倒入我在家保温杯");
    }

    @Override
    public void addCondiments() {
        System.out.println("加点牛奶和糖");
    }

    @Override
    public boolean hook() {
        return true;
    }
}
