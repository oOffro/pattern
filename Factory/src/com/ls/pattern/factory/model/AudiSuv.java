package com.ls.pattern.factory.model;

public class AudiSuv implements ISuv {
    @Override
    public void show() {
        System.out.println("我是一辆奥迪SUV！");
    }
}
