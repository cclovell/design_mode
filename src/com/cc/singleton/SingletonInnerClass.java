package com.cc.singleton;

/**
 * 静态内部类模式
 *
 * 在静态内部类里创建单例，在装载该内部类时才会去创建单例
 *
 * 线程安全：类是由 JVM加载，而JVM只会加载1遍，保证只有1个单例
 *
 */
public class SingletonInnerClass {
    //在静态内部类里创建
    private static class SingletonInner {
        private static SingletonInner singletonInner = new SingletonInner();
    }

    //私有构造方法，防止被实例化
    private SingletonInnerClass() {

    }

    //延时加载
    public static SingletonInner getInstance() {
        return SingletonInner.singletonInner;
    }
}
