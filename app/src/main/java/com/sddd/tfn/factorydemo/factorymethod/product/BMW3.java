package com.sddd.tfn.factorydemo.factorymethod.product;

/**
 * Created by xiadaidai on 2016/12/5.
 * Modified by xiadaidai 具体产品类，宝马3系
 */
public class BMW3 implements BMW {
    @Override
    public String start() {
        return "先开个3系吧";
    }
}
