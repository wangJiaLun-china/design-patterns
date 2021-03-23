package com.wjl.designpatterns.creational.abstractfactory;

import com.wjl.designpatterns.creational.abstractfactory.colorfactory.Color;
import com.wjl.designpatterns.creational.abstractfactory.colorfactory.ColorEnum;
import com.wjl.designpatterns.creational.abstractfactory.shapefactory.Shape;
import com.wjl.designpatterns.creational.abstractfactory.shapefactory.ShapeEnum;

/**
 * 抽象工程demo
 *
 * @author wangJiaLun
 * @date 2021-03-23
 **/
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        // 获取形状为 Circle 的对象
        Shape circle = shapeFactory.getShape(ShapeEnum.CIRCLE.getDesc());
        circle.draw();

        // 获取形状为 Rectangle 的对象
        Shape rectangle = shapeFactory.getShape(ShapeEnum.RECTANGLE.getDesc());
        rectangle.draw();

        // 获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // 获取颜色为 red 的对象
        Color red = colorFactory.getColor(ColorEnum.RED.getDesc());
        red.fill();

        Color green = colorFactory.getColor(ColorEnum.GREEN.getDesc());
        green.fill();
    }
}
