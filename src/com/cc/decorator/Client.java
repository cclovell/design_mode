package com.cc.decorator;

/**
 * 装饰模式
 *
 * 比继承方式更加灵活，而且在新添加的功能以及功能组合的时候比继承好，如果在功能组合上，如果使用继承就会出现组合一个功能就要写一个子类，
 * 但是使用装饰模式，只需要每个功能写个具体装饰类，然后不同装饰类进行组合完成不同的功能。
 *
 * 动态的，继承是静态的，去掉功能和添加功能麻烦
 *
 * java IO里有应用   inputStream
 * ●　　抽象构件(Component)角色：由InputStream扮演。这是一个抽象类，为各种子类型提供统一的接口。
 *
 * ●　　具体构件(ConcreteComponent)角色：由ByteArrayInputStream、FileInputStream等类扮演。它们实现了抽象构件角色所规定的接口。
 *
 * ●　　抽象装饰(Decorator)角色：由FilterInputStream扮演。它实现了InputStream所规定的接口。
 *
 * ●　　具体装饰(ConcreteDecorator)角色：由几个类扮演，分别是BufferedInputStream、DataInputStream
 *
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
