package com.sddd.tfn.factorydemo.simplefactory.factory;

import com.sddd.tfn.factorydemo.simplefactory.product.BMW;
import com.sddd.tfn.factorydemo.simplefactory.product.BMW7;
import com.sddd.tfn.factorydemo.simplefactory.product.BMW3;

/**
 * Created by xiadaidai on 2016/12/5.
 * Modified by xiadaidai 简单工厂类，宝马车工厂
 */
public class BMWFactory {

    public BMW createBMW(String type) {
        BMW result = null;
        if ("3".equalsIgnoreCase(type)) {
            result = new BMW3();
        }
        else if ("7".equalsIgnoreCase(type)) {
            result = new BMW7();
        }
        return result;
    }
}
