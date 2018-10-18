package com.cc.decorator;

/**
 * @author chenchao
 * @date 2018/10/18 上午10:49
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("我是ConcreteB");
    }
}
