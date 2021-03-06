package com.wjl.designpatterns.behavioral.chainofresponsibility;

/**
 * 具体处理类3
 *
 * @author wangJiaLun
 * @date 2019-04-15
 **/
public class ConcreteHandler3 extends AbstractHandler {

    /**
     * 获取处理器等级 视情节是否传参
     *
     * @return 处理器等级
     */
    @Override
    Level getHandLevel() {
        return new Level(5);
    }

    /**
     * 当前处理器的响应
     *
     * @param request 请求
     * @return 响应
     */
    @Override
    Response response(Request request) {
        System.out.println("-----------请求经过处理器3进行处理-----------");
        return null;
    }
}
