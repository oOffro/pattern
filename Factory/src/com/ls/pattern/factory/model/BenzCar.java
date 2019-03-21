package com.ls.pattern.factory.model;

public class BenzCar implements ICar {
    @Override
    public void show() {
        System.out.println("我是一辆奔驰汽车！");
    }
}
