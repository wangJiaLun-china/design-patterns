package com.wjl.designpatterns.creational.abstractfactory.colorfactory;

import com.wjl.designpatterns.creational.abstractfactory.AbstractFactory;
import com.wjl.designpatterns.creational.abstractfactory.shapefactory.*;
import org.springframework.util.StringUtils;

/**
 * 颜色工厂
 *
 * @author wangJiaLun
 * @date 2021-03-23
 **/
public class ColorFactory extends AbstractFactory {


    /**
     * 获取颜色
     *
     * @param colorType
     */
    @Override
    public Color getColor(String colorType) {
        if (StringUtils.isEmpty(colorType)) {
            return null;
        }
        if(colorType.equalsIgnoreCase(ColorEnum.RED.getDesc())){
            return new Red();
        } else if(colorType.equalsIgnoreCase(ColorEnum.GREEN.getDesc())){
            return new Green();
        } else if(colorType.equalsIgnoreCase(ColorEnum.BLUE.getDesc())){
            return new Blue();
        }
        return null;
    }

    /**
     *  根据 颜色类型 返回实体类对象
     * @param shapeType 颜色类型
     * @return 具体颜色对象
     */
    public Shape getShape(String shapeType){
        return null;
    }
}
