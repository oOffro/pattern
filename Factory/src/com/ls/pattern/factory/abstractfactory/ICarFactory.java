package com.ls.pattern.factory.abstractfactory;

import com.ls.pattern.factory.model.ICar;
import com.ls.pattern.factory.model.ISuv;

/**
 * 解决工厂方法中一个工厂只能创建一种产品的问题，加入了产品族的概念。
 * 一种品牌的工厂可以创建这个品牌下不同的产品。
 * 优点：易于扩展，减少Java类的个数
 * 缺点：在产品族中新增一种产品，需要修改所有的实现类
 */
public interface ICarFactory {
    ICar getCar();

    ISuv getSuv();
}
