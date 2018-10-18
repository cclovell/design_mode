package com.cc.decorator;

/**
 * @author chenchao
 * @date 2018/10/18 上午10:49
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component compoment) {
        super(compoment);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("我是ConcreteA");
    }
}
