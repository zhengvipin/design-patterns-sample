package com.catt.proxy;

/**
 * 代理角色： 滴滴客服
 * 【定义】代理模式为对象提供一个替身或者占位符以控制对这个对象的访问
 * 【要素】抽象主题角色、具体主题角色、代理角色
 * 【作用】代理模式可以有选择的暴露对象的接口，而对访问者屏蔽一些接口，这样就实现了对对象的控制访问
 * 【注意】代理模式和装饰者模式长的是真像，区分于，代理包装对象是为了控制对对象的访问，装饰者是为了给对象添加行为
 *
 * @author zwp
 * @since 2020-04-04 19:13
 */
public class DidiCallCenterProxy implements Didi {

    DidiCompany didi;

    public DidiCallCenterProxy(DidiCompany didi) {
        this.didi = didi;
    }

    @Override
    public void complain() {
        // 调用主题的方法
        didi.complain();
    }

    @Override
    public void queryCarRecord() {
        System.out.println("不好意思，一线客服没有权限，请去总公司查询");
    }
}
