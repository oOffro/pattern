package com.ls.pattern.factory.abstractfactory;

import com.ls.pattern.factory.model.BenzCar;
import com.ls.pattern.factory.model.BenzSuv;
import com.ls.pattern.factory.model.ICar;
import com.ls.pattern.factory.model.ISuv;

public class BenzFactory implements ICarFactory {
    @Override
    public ICar getCar() {
        return new BenzCar();
    }

    @Override
    public ISuv getSuv() {
        return new BenzSuv();
    }
}
