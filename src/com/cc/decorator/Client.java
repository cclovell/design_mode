package com.cc.decorator;

/**
 * @author chenchao
 * @date 2018/10/18 上午10:55
 */
public class Client {
    public static void main(String args[]) {
        Component component = new ConcreteComponent();
        Decorator decorator = new Decorator(component);

        Decorator decorator2 = new ConcreteDecoratorA(component);
        Decorator decorator3 = new ConcreteDecoratorB(decorator2);
        decorator.operation();
        decorator2.operation();
        decorator3.operation();
    }
}
