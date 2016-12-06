package com.sddd.tfn.factorydemo.abstractfactory.factory;

import com.sddd.tfn.factorydemo.abstractfactory.products.car.BMW;
import com.sddd.tfn.factorydemo.abstractfactory.products.car.BMW7;
import com.sddd.tfn.factorydemo.abstractfactory.products.insurance.Secure;
import com.sddd.tfn.factorydemo.abstractfactory.products.insurance.SecureTop;

/**
 * Created by xiadaidai on 2016/12/5.
 * Modified by xiadaidai 具体工厂类，生产7系车，买一级保险
 */
public class BMW7Factory implements BMWFactory {
    @Override
    public BMW createBMW() {
        return new BMW7();
    }

    @Override
    public Secure buyInsure() {
        return new SecureTop();
    }
}
