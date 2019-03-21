package com.ls.pattern.factory.model;

public class Benz implements ICar {
    @Override
    public void show() {
        System.out.println("我是一辆奔驰！");
    }
}
