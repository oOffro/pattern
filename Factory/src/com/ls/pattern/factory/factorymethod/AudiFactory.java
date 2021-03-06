package com.ls.pattern.factory.factorymethod;

import com.ls.pattern.factory.model.AudiCar;
import com.ls.pattern.factory.model.ICar;

public class AudiFactory implements ICarFactory {
    @Override
    public ICar getCar() {
        return new AudiCar();
    }
}
