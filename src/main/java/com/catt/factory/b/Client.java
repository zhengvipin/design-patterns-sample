package com.catt.factory.b;

import com.catt.factory.bean.Animal;

/**
 * @author zwp
 * @since 2020-04-04 22:56
 */
public class Client {
    public static void main(String[] args) {
        // 买猫
        Animal cat = AnimalFactory.createAnimal("cat");
        cat.eat();

        // 买狗
        Animal dog = AnimalFactory.createAnimal("dog");
        dog.eat();
    }
}
