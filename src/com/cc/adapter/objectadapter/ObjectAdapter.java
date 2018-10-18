package com.cc.adapter.objectadapter;

import com.cc.adapter.classadapter.Source;
import com.cc.adapter.classadapter.Target;

/**
 * 适配器（适配源类没有的方法）
 *
 * 对象的适配器模式
 *
 * @author chenchao
 * @date 2018/10/18 下午2:45
 */
public class ObjectAdapter implements Target {
    private Source source;

    public ObjectAdapter(Source source) {
        this.source = source;
    }

    @Override
    public void simpleOperation1() {
        source.simpleOperation1();
    }

    @Override
    public void simpleOperation2() {
        System.out.println("我是适配的方法simpleOperation2");
    }
}
