package com.sddd.tfn.factorydemo.simplefactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sddd.tfn.factorydemo.R;
import com.sddd.tfn.factorydemo.simplefactory.factory.BMWFactory;
import com.sddd.tfn.factorydemo.simplefactory.product.BMW;

/**
 * 简单工厂模式Demo
 * 客户端类
 * create by tfn
 */
public class SimpleActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mThreeBtn = null;
    private Button mSevenBtn = null;
    private TextView mResultTxt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        findViews();
    }

    private void findViews() {
        mThreeBtn = (Button) findViewById(R.id.simple_bmw_3);
        mThreeBtn.setOnClickListener(this);
        mSevenBtn = (Button) findViewById(R.id.simple_bmw_7);
        mSevenBtn.setOnClickListener(this);
        mResultTxt = (TextView) findViewById(R.id.simple_result);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.simple_bmw_3:
                threeBtnOnClick();
                break;
            case R.id.simple_bmw_7:
                sevenBtnOnClick();
                break;
        }
    }

    /**
     * 买宝马3系
     */
    private void threeBtnOnClick() {
        BMWFactory factory = new BMWFactory();
        BMW BMW = factory.createBMW("3");
        mResultTxt.setText(BMW.start());
    }

    /**
     * 买宝马7系
     */
    private void sevenBtnOnClick() {
        BMWFactory factory = new BMWFactory();
        BMW BMW = factory.createBMW("7");
        mResultTxt.setText(BMW.start());
    }
}
