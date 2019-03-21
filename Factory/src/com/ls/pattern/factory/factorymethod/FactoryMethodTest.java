package com.ls.pattern.factory.factorymethod;

import com.ls.pattern.factory.model.ICar;

public class FactoryMethodTest {

    public static void main(String[] args) {
        ICar car = new AudiFactory().getCar();
        car.show();
    }
}
