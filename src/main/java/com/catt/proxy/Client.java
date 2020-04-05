package com.catt.proxy;

/**
 * @author zwp
 * @since 2020-04-04 19:15
 */
public class Client {

    public static void main(String[] args) {
/*        DidiCompany didiCompany = new DidiCompany();
        Didi didi = new DidiCallCenterProxy(didiCompany);*/

        // 运用简单工厂模式封装下对对象的创建，实现透明代理
        DidiFactory factory = new DidiFactory();
        Didi didi = factory.getInstance();
        // 投诉
        didi.complain();
        // 查询出车记录
        didi.queryCarRecord();
    }
}
