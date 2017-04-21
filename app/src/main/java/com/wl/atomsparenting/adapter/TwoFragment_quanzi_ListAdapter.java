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

public class TwoFragment_quanzi_ListAdapter extends BaseAdapter {
    private ArrayList<Integer> list;
    private Context context;
    private LayoutInflater inflater;

    public TwoFragment_quanzi_ListAdapter(ArrayList<Integer> list, Context context) {
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
        ViewHolder vh = null;
        if (view == null) {
            vh = new ViewHolder();
            view = inflater.inflate(R.layout.quanziitem, null);
            vh.quanzi_roundCornerImageView = (ImageView) view.findViewById(R.id.quanzi_roundCornerImageView);
            view.setTag(vh);
        } else {
            vh = (ViewHolder) view.getTag();
        }
        vh.quanzi_roundCornerImageView.setImageResource(list.get(i));
        return view;
    }

    class ViewHolder {
        ImageView quanzi_roundCornerImageView;
    }
}
