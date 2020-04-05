package com.catt.factory.bean;

/**
 * @author zwp
 * @since 2020-04-04 22:38
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
