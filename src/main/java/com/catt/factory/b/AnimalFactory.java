package com.catt.factory.b;

import com.catt.factory.bean.Animal;
import com.catt.factory.bean.Cat;
import com.catt.factory.bean.Dog;

/**
 * 简单/静态工厂类，实际开发中用的多
 * 【优点】就一个具体的工厂来创建对象，代码量少
 * 【缺点】当需求改变了，就要改代码
 *
 * @author zwp
 * @since 2020-04-04 22:53
 */
public class AnimalFactory {

    public static Animal createAnimal(String type) {

        if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        }

        if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        }

        return null;
    }
}
