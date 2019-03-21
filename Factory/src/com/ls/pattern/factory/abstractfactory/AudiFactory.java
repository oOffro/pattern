package com.ls.pattern.factory.abstractfactory;

import com.ls.pattern.factory.model.AudiCar;
import com.ls.pattern.factory.model.AudiSuv;
import com.ls.pattern.factory.model.ICar;
import com.ls.pattern.factory.model.ISuv;

public class AudiFactory implements ICarFactory {
    @Override
    public ICar getCar() {
        return new AudiCar();
    }

    @Override
    public ISuv getSuv() {
        return new AudiSuv();
    }
}
