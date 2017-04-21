package com.wl.atomsparenting.cards;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;
import com.wl.atomsparenting.R;
import com.wl.atomsparenting.beans.BaseBean;
import com.wl.atomsparenting.beans.RollPagerViewBean;

/**
 * Created by le on 2017/4/17.
 */

public class RollPagerViewCard extends BaseCard {
    private RollPagerView rollPV = null;


    public RollPagerViewCard(@NonNull Context context) {
        super(context);
    }

    public RollPagerViewCard(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected int getFindView() {
        return R.layout.rollpagerviewcard;
    }

    @Override
    protected void getMaterial() {
        //轮播
        rollPV = (RollPagerView) mView.findViewById(R.id.mainmiao_rollPV);
        //设置每个图片的切换时间
        rollPV.setPlayDelay(3000);
        //设置图片切换动画时间
        rollPV.setAnimationDurtion(500);
        //设置指示器:
        //rollPV.setHintView(new IconHintView());
        //rollPV.setHintView(new IconHintView(this,R.mipmap.ic_launcher,R.mipmap.ic_launcher));
        rollPV.setHintView(new ColorPointHintView(mContext, getResources().getColor(R.color.colorrollpagerView), R.color.colorView));

        //设置每一个图片的点击事件
//        rollPV.setOnItemClickListener(new OnItemClickListener() {
//            @Override
//            public void onItemClick(int position) {
//                Toast.makeText(SecondActivity.this, "点击了图片"+position, Toast.LENGTH_SHORT).show();
//
//            }
//        });
        //设置适配器
        rollPV.setAdapter(new RollPagerAdapter());
    }

    @Override
    public void bindBean(BaseBean baseBean) {
        RollPagerViewBean rollPagerViewBean = (RollPagerViewBean) baseBean;


    }

    //适配器
    private class RollPagerAdapter extends StaticPagerAdapter {
        //图片资源
        private int images[] = {
                R.drawable.welcome_page_one,
                R.drawable.welcome_page_two,
                R.drawable.welcome_page_three,
                R.drawable.welcome_page_four
        };

        @Override
        public View getView(ViewGroup container, int position) {

            ImageView view = new ImageView(container.getContext());
            //设置图片资源
            view.setImageResource(images[position]);
            //设置高度和宽度
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            //设置拉伸方式
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);

            return view;
        }

        @Override
        public int getCount() {
            return images.length;
        }
    }
}
