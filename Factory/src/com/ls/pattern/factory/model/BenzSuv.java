package com.ls.pattern.factory.model;

public class BenzSuv implements ISuv {

    @Override
    public void show() {
        System.out.println("我是一辆奔驰SUV！");
    }
}
