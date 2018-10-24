package com.cc.observe;

public interface WeixinPublic {
    void addObserve(Observer observe); //关注公众号
    void deleteObserve(Observer observe); //取关
    void notifyObserve(); //推送
}
