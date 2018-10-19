package com.cc.proxy;

/**
 * @author chenchao
 * @date 2018/10/19 下午4:28
 */
public class Proxy implements Subject {
    private RealSubject realSubject = new RealSubject();
    @Override
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest(){
        //todo
    }

    public void postRequest(){
        //todo
    }
}
