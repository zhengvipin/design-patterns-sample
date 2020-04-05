package com.catt.factory.a;

import com.catt.factory.bean.Animal;
import com.catt.factory.bean.Dog;

/**
 * @author zwp
 * @since 2020-04-04 22:40
 */
public class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
