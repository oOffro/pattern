package com.ls.pattern.singleton.hungry;

/**
 * 饿汉模式：在加载类的时候，初始化实例对象
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }

}
