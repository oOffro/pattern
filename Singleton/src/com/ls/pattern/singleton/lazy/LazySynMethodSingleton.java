package com.ls.pattern.singleton.lazy;

/**
 * 同步方法实现线程安全的懒汉单例
 */
public class LazySynMethodSingleton {

    private static LazySynMethodSingleton instance;

    private LazySynMethodSingleton() {}

    public static synchronized LazySynMethodSingleton getInstance() {
        if (instance == null) {
            instance = new LazySynMethodSingleton();
        }
        return instance;
    }
}
