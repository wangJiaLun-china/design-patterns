package com.wjl.designpatterns.creational.abstractfactory;

import com.wjl.designpatterns.creational.abstractfactory.colorfactory.Color;
import com.wjl.designpatterns.creational.abstractfactory.shapefactory.Shape;

/**
 * 抽象工厂类
 *
 * @author wangJiaLun
 * @date 2021-03-23
 **/
public abstract class AbstractFactory {

    /**
     *  获取颜色
     */
    public abstract Color getColor(String color);

    /**
     * 获取形状
     */
    public abstract Shape getShape(String shape) ;
}
