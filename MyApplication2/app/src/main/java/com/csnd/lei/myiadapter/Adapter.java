package com.csnd.lei.myiadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * <b>Create Date:</b> 17/4/17<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b>
 * 万能的适配器
 * <br>
 */

public abstract class Adapter<T> extends BaseAdapter {
    protected LayoutInflater mLayoutInflater;
    protected Context mContext;
    private List<T> list;
    private int layoutId;

    public Adapter(Context context, List<T> list, int layoutId) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        this.list = list;
        this.layoutId = layoutId;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = getViewHolder(mContext, convertView, parent);
        convert(viewHolder, list.get(position));
        return viewHolder.getContentView();
    }

    public abstract void convert(ViewHolder viewHolder, T item);

    public ViewHolder getViewHolder(Context context, View contentView, ViewGroup root) {
        return ViewHolder.getViewHolder(context, contentView, root, layoutId);
    }

}
