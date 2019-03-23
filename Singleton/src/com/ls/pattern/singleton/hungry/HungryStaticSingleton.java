package com.ls.pattern.singleton.hungry;

/**
 * 在静态内部类中初始化实例
 */
public class HungryStaticSingleton {

    private static HungryStaticSingleton instance;

    static {
        instance = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {}

    public static HungryStaticSingleton getInstance() {
        return instance;
    }
}
