package com.wl.atomsparenting.cards;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.wl.atomsparenting.R;
import com.wl.atomsparenting.adapter.TwoFragment_quanzi_ListAdapter;
import com.wl.atomsparenting.beans.BaseBean;
import com.wl.atomsparenting.views.CursorListView;

import java.util.ArrayList;

/**
 * Created by le on 2017/4/17.
 */

public class TwoFragmentquanziCard extends BaseCard {
    private CursorListView listview;
    private ArrayList<Integer> list;
    private TwoFragment_quanzi_ListAdapter tql;
    private int images[] = {
            R.drawable.welcome_page_one,
            R.drawable.welcome_page_two,
            R.drawable.welcome_page_three,
            R.drawable.welcome_page_four
    };

    public TwoFragmentquanziCard(@NonNull Context context) {
        super(context);
    }

    public TwoFragmentquanziCard(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected int getFindView() {
        return R.layout.twofragment_quanzi;
    }

    @Override
    protected void getMaterial() {
        listview = (CursorListView) mView.findViewById(R.id.twofragment_quanzi_listview);

    }

    @Override
    public void bindBean(BaseBean baseBean) {
        initAdapter();
    }

    private void initAdapter() {
        list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(images[i % images.length]);
        }
        tql = new TwoFragment_quanzi_ListAdapter(list, getContext());
        listview.setAdapter(tql);
    }
}
