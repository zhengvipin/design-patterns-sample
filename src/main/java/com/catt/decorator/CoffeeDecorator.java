package com.catt.decorator;

/**
 * 装饰器
 *
 * @author zwp
 * @since 2020-04-04 20:07
 */
public abstract class CoffeeDecorator implements Coffee {

    private Coffee coffee;

    /**
     * 以组合的方式接收我们的默认实现类
     *
     * @param coffee
     */
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
