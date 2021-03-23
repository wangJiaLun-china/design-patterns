package com.wjl.designpatterns.creational.abstractfactory.colorfactory;

/**
 * @author wangJiaLun
 * @date 2021-03-23
 **/
public class Green implements Color{

    /**
     * 填充
     */
    @Override
    public void fill() {
        System.out.println("Inside Green:: fill() method.");
    }
}
