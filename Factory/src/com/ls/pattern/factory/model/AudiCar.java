package com.ls.pattern.factory.model;

public class AudiCar implements ICar {

    @Override
    public void show() {
        System.out.println("我是一辆奥迪汽车！");
    }
}
