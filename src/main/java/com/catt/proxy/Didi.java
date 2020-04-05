package com.catt.proxy;

/**
 * 抽象主题角色：滴滴接口
 *
 * @author zwp
 * @since 2020-04-04 19:09
 */
public interface Didi {

    /**
     * 可以投诉
     */
    void complain();

    /**
     * 可以查询出车记录
     */
    void queryCarRecord();
}
