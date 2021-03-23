package com.wjl.designpatterns.creational.abstractfactory.shapefactory;

import com.wjl.designpatterns.creational.abstractfactory.AbstractFactory;
import com.wjl.designpatterns.creational.abstractfactory.colorfactory.Color;
import org.springframework.util.StringUtils;

/**
 * 形状工厂
 *
 * @author wangJiaLun
 * @date 2019-04-08
 **/
public class ShapeFactory extends AbstractFactory {

    /**
     * 获取颜色
     *
     * @param color
     */
    @Override
    public Color getColor(String color) {
        return null;
    }

    /**
     *  根据 形状类型 返回实体类对象
     * @param shapeType 形状类型
     * @return 具体形状对象
     */
    public Shape getShape(String shapeType){
        if (StringUtils.isEmpty(shapeType)) {
            return null;
        }
        if(shapeType.equalsIgnoreCase(ShapeEnum.CIRCLE.getDesc())){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase(ShapeEnum.RECTANGLE.getDesc())){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase(ShapeEnum.SQUARE.getDesc())){
            return new Square();
        }
        return null;
    }
}
