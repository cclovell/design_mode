package com.cc.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察者
 *
 * @author chenchao
 * @date 2018/10/23 下午1:49
 */
public class ArticalPublic implements WeixinPublic {
    private List<Observer> observerList = new ArrayList<>();
    private String content;

    @Override
    public void addObserve(Observer observe) {
        observerList.add(observe);
    }

    @Override
    public void deleteObserve(Observer observe) {
        observerList.remove(observe);
    }

    @Override
    public void notifyObserve() {
        for (Observer observer : observerList){
            observer.receiveInfo(content);
        }
    }

    public void submitInfo(String info) {
        this.content = info;
        this.notifyObserve();
    }
}
