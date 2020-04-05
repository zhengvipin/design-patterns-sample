package com.catt.factory.a;

import com.catt.factory.bean.Animal;

/**
 * @author zwp
 * @since 2020-04-04 22:41
 */
public class Client {
    public static void main(String[] args) {
        // 买一只猫
        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.eat();

        // 买一只狗
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.eat();
    }
}
