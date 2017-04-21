package com.wl.atomsparenting.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.wl.atomsparenting.R;

import java.util.ArrayList;

/**
 * Created by le on 2017/4/14.
 */

public class ThreeListViewItem extends BaseAdapter {
    private ArrayList<Integer> list;
    private LayoutInflater inflater;
    private Context context;

    public ThreeListViewItem(ArrayList<Integer> list, Context context) {
        this.list = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHoder vh = null;
        if (view == null) {
            vh = new ViewHoder();
            view = inflater.inflate(R.layout.three_recyclerview_item, null);
            vh.three_item_img = (ImageView) view.findViewById(R.id.three_item_img);

            view.setTag(vh);
        } else {
            vh = (ViewHoder) view.getTag();
        }
        vh.three_item_img.setImageResource(list.get(i));

        return view;
    }

    class ViewHoder {
        ImageView three_item_img;

    }
}
