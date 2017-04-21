package com.wl.atomsparenting.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.wl.atomsparenting.R;
import com.wl.atomsparenting.domain.Griddomaiozhao;

import java.util.ArrayList;

/**
 * Created by le on 2017/4/10.
 */

public class Gridmiaozhaobaseadapter extends BaseAdapter {
    private ArrayList<Griddomaiozhao> list;
    private LayoutInflater inflater;
    private Context context;

    public Gridmiaozhaobaseadapter(ArrayList<Griddomaiozhao> list, Context context) {
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
            view = inflater.inflate(R.layout.main_miaozhao, null);
            vh.imgimg = (ImageView) view.findViewById(R.id.imgimg);
            vh.tvtv = (TextView) view.findViewById(R.id.tvtv);
            vh.tvtvpeple = (TextView) view.findViewById(R.id.tvtvpeple);
            view.setTag(vh);
        } else {
            vh = (ViewHolder) view.getTag();
        }
        Griddomaiozhao gm = list.get(i);
        vh.imgimg.setImageResource(gm.getImg());
        vh.tvtv.setText(gm.getTitle());
        vh.tvtvpeple.setText(gm.getNumber() + "人感兴趣");
        return view;
    }

    class ViewHolder {
        ImageView imgimg;
        TextView tvtv, tvtvpeple;
    }
}
