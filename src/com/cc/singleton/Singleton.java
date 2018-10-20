package com.cc.singleton;

/**
 * 懒汉式
 *
 * 优点：延时加载，需要的时候才去加载，适合单线程操作
 *
 * 缺点：线程不安全
 *
 */
public class Singleton {
    //持有私有静态实例，防止被引用，此处赋值为null，目的实现延时加载
    private static Singleton instance = null;

    //这种写法不是懒加载但是线程安全，依靠jvm类加载机制
    private static Singleton instance2 = new Singleton();
    //私有构造方法，防止被实例化
    private Singleton() {

    }

    public static Singleton getInstance2() {
        return instance;
    }

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
