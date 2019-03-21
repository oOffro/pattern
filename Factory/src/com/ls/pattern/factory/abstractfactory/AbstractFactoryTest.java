package com.ls.pattern.factory.abstractfactory;

import com.ls.pattern.factory.model.ICar;
import com.ls.pattern.factory.model.ISuv;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        BenzFactory benzFactory = new BenzFactory();
        ICar car = benzFactory.getCar();
        ISuv suv = benzFactory.getSuv();
        car.show();
        suv.show();

    }
}
