package com.ls.pattern.factory.simplefactory;

import com.ls.pattern.factory.model.BenzCar;
import com.ls.pattern.factory.model.ICar;

public class CarTest {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        ICar car = carFactory.getCarForName("AudiCar");
        car.show();

        ICar car1 = carFactory.getCarForClass(BenzCar.class);
        car1.show();
    }

}
