package com.catt.singleton;

/**
 * 简单懒汉式
 * 【不足】在方法上加了内置锁在多线程的环境下性能会比较低
 *
 * @author zwp
 * @since 2020-04-04 20:53
 */
public class Java2y {

    /**
     * 1.将构造函数私有化，不可以通过new的方式来创建对象
     */
    private Java2y() {
    }

    /**
     * 2.先不创建实例，等用到的时候再创建
     */
    private static Java2y java2y;

    /**
     * 3.调用到这个方法了，证明要被用到的了，加锁保证多线程环境下也没问题
     *
     * @return
     */
    public static synchronized Java2y getInstance() {
        // 3.如果这个对象的引用为null，我们就创建并返回出去
        if (java2y == null) {
            java2y = new Java2y();
        }
        return java2y;
    }
}
