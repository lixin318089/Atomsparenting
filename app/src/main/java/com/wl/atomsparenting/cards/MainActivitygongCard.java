package com.wl.atomsparenting.cards;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.wl.atomsparenting.R;
import com.wl.atomsparenting.adapter.ListViewAdapter;
import com.wl.atomsparenting.beans.BaseBean;
import com.wl.atomsparenting.views.CursorListView;

import java.util.ArrayList;

/**
 * Created by le on 2017/4/17.
 */

public class MainActivitygongCard extends BaseCard {
    private CursorListView listview;
    private ArrayList<Integer> list;
    private int img[] = {
            R.drawable.welcome_page_one,
            R.drawable.welcome_page_two,
            R.drawable.welcome_page_three,
            R.drawable.welcome_page_four
    };

    public MainActivitygongCard(@NonNull Context context) {
        super(context);
    }

    public MainActivitygongCard(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected int getFindView() {
        return R.layout.mainactivity_gong;
    }

    @Override
    protected void getMaterial() {
        listview = (CursorListView) mView.findViewById(R.id.main_gong_listview);
    }

    @Override
    public void bindBean(BaseBean baseBean) {
        initListview();
    }

    private void initListview() {
        list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(img[i % img.length]);
        }
        ListViewAdapter listViewAdapter = new ListViewAdapter(list, getContext());
        listview.setAdapter(listViewAdapter);
    }
}
