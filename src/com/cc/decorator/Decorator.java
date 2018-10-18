package com.cc.decorator;

/**
 * @author chenchao
 * @date 2018/10/18 上午10:40
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}
