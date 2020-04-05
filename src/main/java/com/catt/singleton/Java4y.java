package com.catt.singleton;

/**
 * 静态内部类懒汉式
 * <p>
 * 非常推荐使用
 *
 * @author zwp
 * @since 2020-04-04 20:47
 */
public class Java4y {

    private Java4y() {
    }

    /**
     * 使用内部类的方式来实现懒加载
     */
    private static class LazyHolder {
        // 创建单例对象
        private static final Java4y INSTANCE = new Java4y();
    }

    /**
     * 获取对象
     *
     * @return
     */
    public static Java4y getInstance() {
        return LazyHolder.INSTANCE;
    }
}
