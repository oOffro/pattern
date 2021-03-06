package com.ls.pattern.factory.factorymethod;

import com.ls.pattern.factory.model.BenzCar;
import com.ls.pattern.factory.model.ICar;

public class BenzFactory implements ICarFactory {
    @Override
    public ICar getCar() {
        return new BenzCar();
    }
}
