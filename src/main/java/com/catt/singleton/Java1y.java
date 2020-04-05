package com.catt.singleton;

/**
 * 饿汉式
 * <p>
 * 【不足】一上来就创建对象了，如果该实例从始至终都没被使用过，则会造成内存浪费
 *
 * @author zwp
 * @since 2020-04-04 20:47
 */
public class Java1y {

    /**
     * 1.将构造函数私有化，不可以通过new的方式来创建对象
     */
    private Java1y() {
    }

    /**
     * 2.在类的内部创建实例
     */
    private static Java1y java1y = new Java1y();

    /**
     * 3.提供获取实例的唯一方法
     *
     * @return
     */
    public static Java1y getInstance() {
        return java1y;
    }
}
