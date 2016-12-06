package com.sddd.tfn.factorydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sddd.tfn.factorydemo.abstractfactory.AbstractActivity;
import com.sddd.tfn.factorydemo.factorymethod.FactoryActivity;
import com.sddd.tfn.factorydemo.simplefactory.SimpleActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mSimpleBtn = null;
    private Button mFactoryBtn = null;
    private Button mAbstractBtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
    }

    private void findViews() {
        mSimpleBtn = (Button) findViewById(R.id.simple_factory_btn);
        mSimpleBtn.setOnClickListener(this);
        mFactoryBtn = (Button) findViewById(R.id.factory_method_btn);
        mFactoryBtn.setOnClickListener(this);
        mAbstractBtn = (Button) findViewById(R.id.abstract_factory_btn);
        mAbstractBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.simple_factory_btn:
                simpleBtnOnClick();
                break;
            case R.id.factory_method_btn:
                factoryBtnOnClick();
                break;
            case R.id.abstract_factory_btn:
                abstractBtnOnClick();
                break;
        }
    }

    private void simpleBtnOnClick() {
        Intent intent = new Intent(this, SimpleActivity.class);
        startActivity(intent);
    }

    private void factoryBtnOnClick() {
        Intent intent = new Intent(this, FactoryActivity.class);
        startActivity(intent);
    }

    private void abstractBtnOnClick() {
        Intent intent = new Intent(this, AbstractActivity.class);
        startActivity(intent);
    }

}
