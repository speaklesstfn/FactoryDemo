package com.sddd.tfn.factorydemo.abstractfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sddd.tfn.factorydemo.R;
import com.sddd.tfn.factorydemo.abstractfactory.factory.BMW3Factory;
import com.sddd.tfn.factorydemo.abstractfactory.factory.BMW7Factory;
import com.sddd.tfn.factorydemo.abstractfactory.factory.BMWFactory;
import com.sddd.tfn.factorydemo.abstractfactory.products.car.BMW;
import com.sddd.tfn.factorydemo.abstractfactory.products.insurance.Secure;

/**
 * 抽象工厂模式Demo
 * 客户端类
 * create by tfn
 */
public class AbstractActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mThreeBtn = null;
    private Button mSevenBtn = null;
    private TextView mResultTxt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract);
        findViews();
    }

    private void findViews() {
        mThreeBtn = (Button) findViewById(R.id.abstract_bmw_3);
        mThreeBtn.setOnClickListener(this);
        mSevenBtn = (Button) findViewById(R.id.abstract_bmw_7);
        mSevenBtn.setOnClickListener(this);
        mResultTxt = (TextView) findViewById(R.id.abstract_result);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.abstract_bmw_3:
                threeBtnOnClick();
                break;
            case R.id.abstract_bmw_7:
                sevenBtnOnClick();
                break;
        }
    }

    /**
     * 买宝马3系
     */
    private void threeBtnOnClick() {
        BMWFactory factory = new BMW3Factory();//得到具体的工厂类
        BMW BMW = factory.createBMW();//得到具体汽车
        Secure secure = factory.buyInsure();//得到具体的保险类型
        mResultTxt.setText(BMW.start() + "   " + secure.getLevel());
    }

    /**
     * 买宝马7系
     */
    private void sevenBtnOnClick() {
        BMWFactory factory = new BMW7Factory();
        BMW BMW = factory.createBMW();
        Secure secure = factory.buyInsure();//得到具体的保险类型
        mResultTxt.setText(BMW.start() + "   " + secure.getLevel());
    }
}
