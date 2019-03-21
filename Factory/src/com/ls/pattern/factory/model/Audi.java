package com.ls.pattern.factory.model;

public class Audi implements ICar {

    @Override
    public void show() {
        System.out.println("我是一辆奥迪！");
    }
}
