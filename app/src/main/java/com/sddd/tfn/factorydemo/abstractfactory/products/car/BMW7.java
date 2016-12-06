package com.sddd.tfn.factorydemo.abstractfactory.products.car;

/**
 * Created by xiadaidai on 2016/12/5.
 * Modified by xiadaidai 具体产品类，宝马7系
 */
public class BMW7 implements BMW {
    @Override
    public String start() {
        return "要开就开7系";
    }
}
