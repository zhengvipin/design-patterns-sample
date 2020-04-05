package com.catt.factory.a;

import com.catt.factory.bean.Animal;

/**
 * @author zwp
 * @since 2020-04-04 22:35
 */
public interface AnimalFactory {

    /**
     * 可以获取任何的宠物
     *
     * @return
     */
    Animal createAnimal();
}
