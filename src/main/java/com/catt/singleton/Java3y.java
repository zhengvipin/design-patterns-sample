package com.catt.singleton;

/**
 * 双重检测机制DCL（Double Check Lock）
 *
 * @author zwp
 * @since 2020-04-04 20:53
 */
public class Java3y {

    private Java3y() {
    }

    /**
     * volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行
     */
    private static volatile Java3y java3y;

    public static Java3y getInstance() {
        // 这个判空主要是为了提高性能
        if (java3y == null) {
            // 将锁的范围缩小，提高性能
            // 同步代码块(obj){...}中，obj称为同步监视器，也就是锁，在非静态方法中可为this，在静态方法中为当前类本身
            synchronized (Java3y.class) {

                // 再判断一次是否为null，因为只加同步代码块时，判空在其外层，也有可能返回不止一个实例
                if (java3y == null) {
                    // new Java3y()并不是原子操作，初始化Java3y经过三个步骤：内存分配空间，初始化，把java3y指向相应的空间。
                    // 由于JVM可能会重排序，所以可能出现 java3y 已被赋值（此时java3y不为null），但Java3y构造方法还未执行（Java3y中的字段都还是默认值）
                    // 此时若再有另外一个线程来调用getInstance()方法会直接返回java3y（因为此时java3y已不为null）
                    // 导致这个线程得到的java3y实例是未初始化完全的，很可能导致程序的异常
                    // 如果在单线程下就不会有问题，因为不管是先赋值java3y还是先执行Java3y()
                    // 最终在返回java3y时Java3y构造函数都初始化完全了，多线程下则不能保证
                    java3y = new Java3y();
                }

            }
        }
        return java3y;
    }
}
