package com.cc.builder;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    ///电脑组件集合
    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        parts.forEach(item -> System.out.println(item));
    }
}
