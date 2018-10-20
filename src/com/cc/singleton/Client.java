package com.cc.singleton;

public class Client {
    public static void main(String args[]) {
        //调用懒汉式
        Singleton.getInstance();
    }


}
