package com.sddd.tfn.factorydemo.abstractfactory.factory;

import com.sddd.tfn.factorydemo.abstractfactory.products.car.BMW;
import com.sddd.tfn.factorydemo.abstractfactory.products.insurance.Secure;

/**
 * Created by xiadaidai on 2016/12/5.
 * Modified by xiadaidai 抽象工厂类
 */
public interface BMWFactory {
    /**
     * 生产宝马车
     *
     * @return 宝马车对象
     */
    BMW createBMW();

    /**
     * 购买保险
     *
     * @return 保险对象
     */
    Secure buyInsure();
}
