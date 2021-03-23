package com.wjl.designpatterns.creational.abstractfactory.shapefactory;

/**
 * 圆
 *
 * @author wangJiaLun
 * @date 2019-04-08
 **/
public class Circle implements Shape {

    /**
     * 绘画
     */
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
