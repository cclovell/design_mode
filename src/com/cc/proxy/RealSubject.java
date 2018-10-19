package com.cc.proxy;

/**
 * @author chenchao
 * @date 2018/10/19 下午4:29
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("我是RealSubject");
    }
}
