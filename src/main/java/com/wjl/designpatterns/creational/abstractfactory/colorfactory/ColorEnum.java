package com.wjl.designpatterns.creational.abstractfactory.colorfactory;

import com.wjl.designpatterns.creational.abstractfactory.shapefactory.ShapeEnum;

/**
 * 颜色枚举
 *
 * @author wangJiaLun
 * @date 2021-03-23
 **/
public enum ColorEnum {
    RED(1, "红"),
    GREEN(2, "绿"),
    BLUE(3, "蓝");

    private Integer code;

    private String desc;

    ColorEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public static ColorEnum getByCode(Integer code){
        if (null == code) {
            return null;
        }

        for (ColorEnum element : ColorEnum.values()) {
            if (code.longValue() == code.longValue()) {
                return element;
            }
        }

        return null;
    }
}
