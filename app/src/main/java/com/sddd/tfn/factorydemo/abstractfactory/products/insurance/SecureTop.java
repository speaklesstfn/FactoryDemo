package com.sddd.tfn.factorydemo.abstractfactory.products.insurance;

/**
 * Created by xiadaidai on 2016/12/5.
 * Modified by xiadaidai 具体产品类，一级保险
 */
public class SecureTop implements Secure {
    @Override
    public String getLevel() {
        return "一级保险，不怕撞！";
    }
}
