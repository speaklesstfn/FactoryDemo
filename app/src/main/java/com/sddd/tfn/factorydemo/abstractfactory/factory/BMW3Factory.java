package com.sddd.tfn.factorydemo.abstractfactory.factory;

import com.sddd.tfn.factorydemo.abstractfactory.products.car.BMW;
import com.sddd.tfn.factorydemo.abstractfactory.products.car.BMW3;
import com.sddd.tfn.factorydemo.abstractfactory.products.insurance.Secure;
import com.sddd.tfn.factorydemo.abstractfactory.products.insurance.SecureSecond;

/**
 * Created by xiadaidai on 2016/12/5.
 * Modified by xiadaidai 具体工厂类，生产3系车，买二级保险
 */
public class BMW3Factory implements BMWFactory {
    @Override
    public BMW createBMW() {
        return new BMW3();
    }

    @Override
    public Secure buyInsure() {
        return new SecureSecond();
    }
}
