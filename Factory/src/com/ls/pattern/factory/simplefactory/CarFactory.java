package com.ls.pattern.factory.simplefactory;

import com.ls.pattern.factory.model.AudiCar;
import com.ls.pattern.factory.model.BenzCar;
import com.ls.pattern.factory.model.ICar;

/**
 * 汽车工厂
 */
public class CarFactory {

    /**
     * 通过汽车名获取
     */
    public ICar getCarForName(String name) {
        if (name == null || "".equals(name)) {
            return null;
        }

        if ("AudiCar".equals(name)) {
            return new AudiCar();
        } else if ("BenzCar".equals(name)) {
            return new BenzCar();
        }

        return null;
    }

    /**
     * 通过类的Class获取
     */
    public ICar getCarForClass(Class<? extends ICar> clazz) {
        if (clazz == null) {
            return null;
        }

        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
