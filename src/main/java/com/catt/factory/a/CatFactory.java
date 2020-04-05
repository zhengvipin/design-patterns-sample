package com.catt.factory.a;

import com.catt.factory.bean.Animal;
import com.catt.factory.bean.Cat;

/**
 * @author zwp
 * @since 2020-04-04 22:36
 */
public class CatFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
