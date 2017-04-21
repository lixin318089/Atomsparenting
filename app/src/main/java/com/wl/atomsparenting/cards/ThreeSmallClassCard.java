package com.wl.atomsparenting.cards;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.wl.atomsparenting.R;
import com.wl.atomsparenting.adapter.ThreeListViewItem;
import com.wl.atomsparenting.beans.BaseBean;
import com.wl.atomsparenting.views.CursorListView;

import java.util.ArrayList;

/**
 * Created by le on 2017/4/17.
 */

public class ThreeSmallClassCard extends BaseCard {
    private int images[] = {
            R.drawable.welcome_page_three,
            R.drawable.welcome_page_four,
            R.drawable.welcome_page_one,
            R.drawable.welcome_page_two

    };
    private CursorListView three_recyclerview;
    private ArrayList<Integer> listrecyclerview;
    private ThreeListViewItem tli;

    public ThreeSmallClassCard(@NonNull Context context) {
        super(context);
    }

    public ThreeSmallClassCard(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected int getFindView() {
        return R.layout.threefragmentcursorlistview;
    }

    @Override
    protected void getMaterial() {
        three_recyclerview = (CursorListView) mView.findViewById(R.id.three_recyclerview);
    }

    @Override
    public void bindBean(BaseBean baseBean) {
        initRecyclerView();
    }

    private void initRecyclerView() {
        listrecyclerview = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listrecyclerview.add(images[i % images.length]);
        }
//        LinearLayoutManager manager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
//        three_recyclerview.setLayoutManager(manager);
//        tfr = new ThreeFragmentRecyclerView(listrecyclerview, getActivity());
        tli = new ThreeListViewItem(listrecyclerview, getContext());
        three_recyclerview.setAdapter(tli);
    }
}
