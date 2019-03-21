package com.ls.pattern.factory.simplefactory;

public class CarTest {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        ICar car = carFactory.getCarForName("Audi");
        car.show();

        ICar car1 = carFactory.getCarForClass(Benz.class);
        car1.show();
    }

}
