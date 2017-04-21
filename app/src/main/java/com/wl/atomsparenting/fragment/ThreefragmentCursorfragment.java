package com.wl.atomsparenting.fragment;

import com.wl.atomsparenting.adapter.FourFragmentAdapter;
import com.wl.atomsparenting.beans.BaseBean;
import com.wl.atomsparenting.beans.RollPagerViewBean;
import com.wl.atomsparenting.beans.ThreeSmallClassBean;

import java.util.ArrayList;

/**
 * Created by le on 2017/4/17.
 */

public class ThreefragmentCursorfragment extends BaseListFragment {
    private ArrayList<BaseBean> beanArrayList;
    private FourFragmentAdapter fourFragmentAdapter;

    @Override
    protected void sonStart() {
        beanArrayList = new ArrayList<>();
        ThreeSmallClassBean threeSmallClassBean = new ThreeSmallClassBean();
        RollPagerViewBean rollPagerViewBean = new RollPagerViewBean();
        beanArrayList.add(rollPagerViewBean);
        beanArrayList.add(threeSmallClassBean);
        fourFragmentAdapter = new FourFragmentAdapter(beanArrayList, getContext());
        setadapter(fourFragmentAdapter);
    }
}
