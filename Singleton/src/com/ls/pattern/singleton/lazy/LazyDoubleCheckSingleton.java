package com.ls.pattern.singleton.lazy;

/**
 * 双检锁懒汉式
 * 使用两次判断加一个同步代码块，避免使用静态同步方法锁类，提高效率
 */
public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
