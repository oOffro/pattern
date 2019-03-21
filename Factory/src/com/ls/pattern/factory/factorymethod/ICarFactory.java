package com.ls.pattern.factory.factorymethod;

import com.ls.pattern.factory.model.ICar;

/**
 * 开闭原则的典型实现，每种产品由自己对应的工厂去创建。
 * 加入新的产品时，只需要去拓展工厂，而不用去修改工厂。
 */
public interface ICarFactory {
    ICar getCar();
}
