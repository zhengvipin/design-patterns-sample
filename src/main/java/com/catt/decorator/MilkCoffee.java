package com.catt.decorator;

/**
 * 继承着装饰器来拓展
 *
 * @author zwp
 * @since 2020-04-04 20:09
 */
public class MilkCoffee extends CoffeeDecorator {

    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    /**
     * 定义想要拓展的功能
     */
    public void cost() {
        System.out.println("加了牛奶，额外给 3 元");
    }

    @Override
    public String getName() {
        return "Milk Coffee";
    }
}
