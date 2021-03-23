package com.wjl.designpatterns.creational.abstractfactory.colorfactory;

/**
 * 红
 *
 * @author wangJiaLun
 * @date 2021-03-23
 **/
public class Red implements Color{

    /**
     * 填充
     */
    @Override
    public void fill() {
        System.out.println("Inside Red:: fill() method.");
    }
}

