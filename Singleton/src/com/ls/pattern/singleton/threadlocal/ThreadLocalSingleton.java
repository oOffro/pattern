package com.ls.pattern.singleton.threadlocal;

/**
 * threadLocal单例模式
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton = ThreadLocal.withInitial(() -> new ThreadLocalSingleton());

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){return threadLocalSingleton.get();}

}
