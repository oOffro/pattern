package com.ls.pattern.factory.simplefactory;

import com.ls.pattern.factory.model.Audi;
import com.ls.pattern.factory.model.Benz;
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

        if ("Audi".equals(name)) {
            return new Audi();
        } else if ("Benz".equals(name)) {
            return new Benz();
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
