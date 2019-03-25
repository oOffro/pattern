package com.ls.pattern.singleton.lazy;

/**
 * 不加锁，使用静态内部类初始化
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        // 禁止反射调用构造方法创建
        if (LazyHandler.instance != null) {
            throw new RuntimeException("不允许创建多个实例！");
        }
    }

    public static LazyInnerClassSingleton getInstance() {
        return LazyHandler.instance;
    }

    /**
     * 静态内部类在外部类被使用时才初始化，避免了外部类没有使用的时候也初始化类浪费空间。
     */
    private static class LazyHandler {
        private static LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
    }

    // 避免反序列话破坏单例，重写readResolve方法，返回已创建的实例
    private Object readResolve() {
        return LazyHandler.instance;
    }

}
