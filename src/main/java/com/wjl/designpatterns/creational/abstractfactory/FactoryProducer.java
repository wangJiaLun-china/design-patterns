package com.wjl.designpatterns.creational.abstractfactory;

import com.wjl.designpatterns.creational.abstractfactory.colorfactory.ColorFactory;
import com.wjl.designpatterns.creational.abstractfactory.shapefactory.ShapeFactory;

/**
 * 工程创造器
 *
 * @author wangJiaLun
 * @date 2021-03-23
 **/
public class FactoryProducer {

    /**
     *  通过传递形状或颜色信息来获取工厂
     */
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }else if (choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
