package com.csnd.lei.myiadapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * <b>Create Date:</b> 17/4/17<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> 万能的ViewHolder<br>
 */

public class ViewHolder {

    private SparseArray<View> views;
    private View contentView;

    public ViewHolder(Context context, ViewGroup root, int layoutId) {
        views = new SparseArray<>();
        contentView = LayoutInflater.from(context).inflate(layoutId, root, false);
        contentView.setTag(this);
    }

    public static ViewHolder getViewHolder(Context context, View contentView, ViewGroup root, int layoutId) {
        if (contentView == null) {
            return new ViewHolder(context, root, layoutId);
        }
        return (ViewHolder) contentView.getTag();
    }


    public <T extends View> T getView(int viewId) {
        View view = views.get(viewId);
        if (view == null) {
            view = contentView.findViewById(viewId);
            views.put(viewId, view);
        }
        return (T) view;
    }

    public View getContentView() {
        return contentView;
    }
}
