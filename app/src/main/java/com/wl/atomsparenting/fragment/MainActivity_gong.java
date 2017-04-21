package com.wl.atomsparenting.fragment;

import com.wl.atomsparenting.adapter.FourFragmentAdapter;
import com.wl.atomsparenting.beans.BaseBean;
import com.wl.atomsparenting.beans.MainActivitygongBean;

import java.util.ArrayList;

/**
 * Created by le on 2017/4/8.
 */

public class MainActivity_gong extends BaseListFragment{
    private ArrayList<BaseBean> beanArrayList;
    private FourFragmentAdapter fourFragmentAdapter;

    @Override
    protected void sonStart() {
        beanArrayList = new ArrayList<>();
        MainActivitygongBean mainActivitygongBean = new MainActivitygongBean();
        beanArrayList.add(mainActivitygongBean);
        fourFragmentAdapter = new FourFragmentAdapter(beanArrayList, getContext());
        setadapter(fourFragmentAdapter);
    }
}
