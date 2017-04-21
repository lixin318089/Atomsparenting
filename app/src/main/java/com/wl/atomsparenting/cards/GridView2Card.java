package com.wl.atomsparenting.cards;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.wl.atomsparenting.R;
import com.wl.atomsparenting.adapter.Gridmiaozhaobaseadapter;
import com.wl.atomsparenting.views.HeaderGridView;
import com.wl.atomsparenting.beans.BaseBean;
import com.wl.atomsparenting.domain.Griddomaiozhao;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by le on 2017/4/17.
 */

public class GridView2Card extends BaseCard{
    private ArrayList<Griddomaiozhao> listmiaozhao;
    private int imgs[] = {
            R.drawable.welcome_page_four,
            R.drawable.welcome_page_three,
            R.drawable.welcome_page_two,
            R.drawable.welcome_page_one

    };
    private HeaderGridView recyclerview;
    private Gridmiaozhaobaseadapter gridbaseadapter;

    public GridView2Card(@NonNull Context context) {
        super(context);
    }

    public GridView2Card(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected int getFindView() {
        return R.layout.gridview2card;
    }

    @Override
    protected void getMaterial() {
        recyclerview = (HeaderGridView) mView.findViewById(R.id.main_miao_recyclerview);

    }

    @Override
    public void bindBean(BaseBean baseBean) {
        initrecyclerview();
    }
    private void initrecyclerview() {
        listmiaozhao=new ArrayList<>();


        gridbaseadapter = new Gridmiaozhaobaseadapter(listmiaozhao,mContext);
        recyclerview.setAdapter(gridbaseadapter);
        shujuyuan();
    }
    private void shujuyuan() {
        Random random=new Random();
        for (int i = 0; i < 20; i++) {
            int j=random.nextInt(500)+700;
            Griddomaiozhao gm=new Griddomaiozhao(imgs[i%imgs.length],"讲好英语的8个窍门",j);
            listmiaozhao.add(gm);
        }
        gridbaseadapter.notifyDataSetChanged();
    }
}
