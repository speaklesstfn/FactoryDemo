package com.sddd.tfn.factorydemo.abstractfactory.products.insurance;

/**
 * Created by xiadaidai on 2016/12/5.
 * Modified by xiadaidai 具体产品类，二级保险
 */
public class SecureSecond implements Secure {
    @Override
    public String getLevel() {
        return "二级保险，也还凑合！";
    }
}
