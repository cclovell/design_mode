package com.cc.decorator;

/**
 * @author chenchao
 * @date 2018/10/18 上午10:35
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("我是ConcreteComponent");
    }
}
