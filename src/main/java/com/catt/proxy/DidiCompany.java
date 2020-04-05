package com.catt.proxy;

/**
 * 具体主题角色: 滴滴公司
 *
 * @author zwp
 * @since 2020-04-04 19:11
 */
public class DidiCompany implements Didi {
    @Override
    public void complain() {
        System.out.println("收到投诉，请耐心等待处理结果");
    }

    @Override
    public void queryCarRecord() {
        System.out.println("正在查询出车记录，请耐心等待");
    }
}
