package com.example.jingbin.designpattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.jingbin.designpattern.emtag.EmTagActivity;
import com.example.jingbin.designpattern.factory.RoujiaMoStoreActivity;
import com.example.jingbin.designpattern.observer.ObserverActivity;
import com.example.jingbin.designpattern.singleton.SingletonActivity;
import com.example.jingbin.designpattern.strategy.StrategyActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jingbin on 2016/10/21.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.bt_observer)
    Button btObserver;
    @BindView(R.id.bt_factory)
    Button btFactory;
    @BindView(R.id.bt_html)
    Button btHtml;
    @BindView(R.id.bt_singleton)
    Button btSingleton;
    @BindView(R.id.activity_main)
    LinearLayout activityMain;
    @BindView(R.id.bt_strategy)
    Button btStrategy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initListener();
    }

    private void initListener() {
        btObserver.setOnClickListener(this);
        btFactory.setOnClickListener(this);
        btHtml.setOnClickListener(this);
        btSingleton.setOnClickListener(this);
        btStrategy.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_observer:// 观察者模式
                startActivity(new Intent(this, ObserverActivity.class));
                break;
            case R.id.bt_factory:// 工厂模式
                startActivity(new Intent(this, RoujiaMoStoreActivity.class));
                break;
            case R.id.bt_singleton:// 单例设计模式
                startActivity(new Intent(this, SingletonActivity.class));
                break;
            case R.id.bt_strategy:// 策略模式
                startActivity(new Intent(this, StrategyActivity.class));
                break;
            case R.id.bt_html:// 为TextView增加自定义HTML标签
                startActivity(new Intent(this, EmTagActivity.class));
                break;
            default:
                break;
        }
    }
}
