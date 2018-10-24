package com.cc.observe;

/**
 * @author chenchao
 * @date 2018/10/23 下午1:55
 */
public class Client {
    public static void main(String args[]) {
        WeixinPublic weixinPublic = new ArticalPublic();
        ConcreteObserver observer = new ConcreteObserver();
        weixinPublic.addObserve(observer);
        weixinPublic.notifyObserve();

        ((ArticalPublic) weixinPublic).submitInfo("a 发表了一个文章");
    }
}
