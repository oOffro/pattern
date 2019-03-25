package com.ls.pattern.singleton.enumsingleton;

/**
 * 属于注册式单例的一种，Effective Java推荐写法
 * 从JDK层面屏蔽了反射破坏单例即序列化破坏单例的问题
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
