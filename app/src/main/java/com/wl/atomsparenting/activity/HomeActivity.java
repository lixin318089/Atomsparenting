package com.wl.atomsparenting.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.wl.atomsparenting.R;
import com.wl.atomsparenting.fragment.FourFragment;
import com.wl.atomsparenting.fragment.MainFragment;
import com.wl.atomsparenting.fragment.ThreeFragment;
import com.wl.atomsparenting.fragment.TwoFragment;

import java.util.ArrayList;

/**
 * Created by le on 2017/4/7.
 */

public class HomeActivity extends FragmentActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup rg;
    private RadioButton[] rb;
    private ArrayList<Fragment> listfragment;
    private FragmentManager supportFragmentManager;
    private int num;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeactivity);
        initView();
        initFragment();
        initLunbo();
    }

    private void initLunbo() {

    }

    private void initFragment() {
        listfragment = new ArrayList<>();

        MainFragment mainFragment = new MainFragment();
        TwoFragment twoFragment = new TwoFragment();
        ThreeFragment threeFragment = new ThreeFragment();
        FourFragment fourFragment = new FourFragment();

        listfragment.add(mainFragment);
        listfragment.add(twoFragment);
        listfragment.add(threeFragment);
        listfragment.add(fourFragment);

        supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.beginTransaction().add(R.id.home_relativeLayout, listfragment.get(0)).commit();

    }

    private void initView() {
        rg = (RadioGroup) findViewById(R.id.home_rg);
        rb = new RadioButton[rg.getChildCount()];
        for (int i = 0; i < rg.getChildCount(); i++) {
            rb[i] = (RadioButton) rg.getChildAt(i);
        }
        rb[0].setChecked(true);
        rb[0].setTextColor(Color.rgb(255, 153, 158));
        rg.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {
            case R.id.home_rb1:
                showfragment(i);
                rb[0].setTextColor(Color.rgb(255, 153, 158));
                rb[1].setTextColor(Color.BLACK);
                rb[2].setTextColor(Color.BLACK);
                rb[3].setTextColor(Color.BLACK);
                break;
            case R.id.home_rb2:
                showfragment(i);
                rb[1].setTextColor(Color.rgb(255, 153, 158));
                rb[0].setTextColor(Color.BLACK);
                rb[2].setTextColor(Color.BLACK);
                rb[3].setTextColor(Color.BLACK);
                break;
            case R.id.home_rb3:
                showfragment(i);
                rb[2].setTextColor(Color.rgb(255, 153, 158));
                rb[1].setTextColor(Color.BLACK);
                rb[0].setTextColor(Color.BLACK);
                rb[3].setTextColor(Color.BLACK);
                break;
            case R.id.home_rb4:
                showfragment(i);
                rb[3].setTextColor(Color.rgb(255, 153, 158));
                rb[1].setTextColor(Color.BLACK);
                rb[2].setTextColor(Color.BLACK);
                rb[0].setTextColor(Color.BLACK);
                break;
            default:
                break;
        }
    }

    private void showfragment(int i) {
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        for (int i1 = 0; i1 < rg.getChildCount(); i1++) {
            if (rb[i1].getId() == i) {
                if (listfragment.get(i1).isAdded()) {
                    fragmentTransaction.show(listfragment.get(i1)).hide(listfragment.get(num)).commit();
                } else {
                    fragmentTransaction.add(R.id.home_relativeLayout, listfragment.get(i1)).hide(listfragment.get(num)).commit();
                }
                num = i1;
            }
        }
    }
}
