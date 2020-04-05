package com.catt.decorator;

/**
 * 默认实现
 *
 * @author zwp
 * @since 2020-04-04 20:12
 */
public class SimpleCoffee implements Coffee {
    @Override
    public String getName() {
        return "Simple Coffee";
    }
}
