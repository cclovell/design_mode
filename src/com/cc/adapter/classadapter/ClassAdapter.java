package com.cc.adapter.classadapter;

/**
 * 适配器（适配源类没有的方法）
 *
 * 类的适配器模式
 * @author chenchao
 * @date 2018/10/18 下午2:45
 */
public class ClassAdapter extends Source implements Target {


    @Override
    public void simpleOperation2() {
        System.out.println("我是适配的方法simpleOperation2");
    }
}
