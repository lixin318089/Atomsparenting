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
 * Created by le on 2017/4/12.
 */

public class ListViewAdapter extends BaseAdapter {
    private ArrayList<Integer> list;
    private LayoutInflater inflater;
    private Context context;

    public ListViewAdapter(ArrayList<Integer> list, Context context) {
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
            view = inflater.inflate(R.layout.maingong_listview, null);
            vh.maingong_listimg = (ImageView) view.findViewById(R.id.maingong_listimg);

            view.setTag(vh);
        } else {
            vh = (ViewHoder) view.getTag();
        }
        vh.maingong_listimg.setImageResource(list.get(i));

        return view;
    }

    class ViewHoder {
        ImageView maingong_listimg;

    }
}
