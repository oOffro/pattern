package com.ls.pattern.singleton.lazy;

/**
 * 不加锁，使用静态内部类初始化
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {}

    public static LazyInnerClassSingleton getInstance() {
        return LazyHandler.instance;
    }

    /**
     * 静态内部类在外部类被使用时才初始化，避免了外部类没有使用的时候也初始化类浪费空间。
     */
    private static class LazyHandler {
        private static LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
    }
}
