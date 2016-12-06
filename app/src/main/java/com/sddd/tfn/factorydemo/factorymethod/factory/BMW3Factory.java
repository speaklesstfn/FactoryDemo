package com.sddd.tfn.factorydemo.factorymethod.factory;

import com.sddd.tfn.factorydemo.factorymethod.product.BMW;
import com.sddd.tfn.factorydemo.factorymethod.product.BMW3;

/**
 * Created by xiadaidai on 2016/12/5.
 * Modified by xiadaidai 具体工厂类，实现生产3系
 */

public class BMW3Factory implements BMWFactory {
    @Override
    public BMW createBMW() {
        return new BMW3();
    }
}
