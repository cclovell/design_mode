package com.cc.model;

/**
 * @author chenchao
 * @date 2018/10/22 下午6:00
 */
public class Tea extends Drink {
    @Override
    public void brew() {
        System.out.println("加入茶叶冲泡");
    }

    @Override
    public void pourInCup() {
        System.out.println("倒入保温杯");
    }

    @Override
    public void addCondiments() {
        System.out.println("加点柠檬");
    }

    @Override
    public boolean hook() {
        return false;
    }
}
