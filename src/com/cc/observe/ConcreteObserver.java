package com.cc.observe;

/**
 * @author chenchao
 * @date 2018/10/23 下午1:52
 */
public class ConcreteObserver implements Observer {
    @Override
    public void receiveInfo(String info) {
        System.out.println("用户收到了：" + info);
    }
}
