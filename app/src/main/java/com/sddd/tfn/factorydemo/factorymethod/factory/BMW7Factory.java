package com.sddd.tfn.factorydemo.factorymethod.factory;

import com.sddd.tfn.factorydemo.factorymethod.product.BMW;
import com.sddd.tfn.factorydemo.factorymethod.product.BMW7;

/**
 * Created by xiadaidai on 2016/12/5.
 * Modified by xiadaidai 具体工厂类，实现生产7系
 */

public class BMW7Factory implements BMWFactory {
    @Override
    public BMW createBMW() {
        return new BMW7();
    }
}
