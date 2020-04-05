package com.catt.proxy;

/**
 * @author zwp
 * @since 2020-04-04 19:48
 */
public class DidiFactory {
    private Didi didi;

    public Didi getInstance() {
        didi = new DidiCallCenterProxy(new DidiCompany());
        return didi;
    }
}
