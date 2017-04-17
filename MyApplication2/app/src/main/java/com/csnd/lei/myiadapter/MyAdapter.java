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
 * http://blog.csdn.net/qq_30379689/article/details/53029794
 * 传统的Adapter
 * <br>
 */

public class MyAdapter extends BaseAdapter {

    private List<Student> mList;
    private LayoutInflater mInflater;
    private Context mContext;

    public MyAdapter(Context context, List<Student> list) {
        this.mContext = context;
        mInflater = LayoutInflater.from(context);
        mList = list;
    }

    @Override
    public int getCount() {
        return mList.size() == 0 ? 0 : mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ViewHolder viewHolder = null;
//        if (convertView == null) {
//            convertView = mInflater.inflate(R.layout.item, parent, false);
//            viewHolder = new ViewHolder();
//            viewHolder.mImageView = (ImageView) convertView.findViewById(R.id.item_img);
//            viewHolder.mTextView = (TextView) convertView.findViewById(R.id.item_text);
//            convertView.setTag(viewHolder);
//        } else {
//            viewHolder = (ViewHolder) convertView.getTag();
//            viewHolder.mImageView.setImageDrawable(ContextCompat.getDrawable(mContext,R.mipmap.ic_launcher));
//            viewHolder.mTextView.setText(mList.get(position).toString());
//        }
//        return convertView;
//    }


//    class ViewHolder {
//        ImageView mImageView;
//        TextView mTextView;
//    }


//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        if (convertView == null) {
//            convertView = mInflater.inflate(R.layout.item, parent, false);
//        }
//        ViewHolder viewHolder = getViewHolder(convertView);
//        viewHolder.mTextView.setText(mList.get(position).toString());
//        viewHolder.mImageView.setImageDrawable(ContextCompat.getDrawable(mContext, R.mipmap.ic_launcher));
//        return convertView;
//    }
//
//
//    public ViewHolder getViewHolder(View view) {
//        ViewHolder viewHolder = (ViewHolder) view.getTag();
//        if (viewHolder == null) {
//            viewHolder = new ViewHolder(view);
//            view.setTag(viewHolder);
//        }
//        return viewHolder;
//    }
//
//    class ViewHolder {
//        ImageView mImageView;
//        TextView mTextView;
//
//        public ViewHolder(View view) {
//            mImageView = (ImageView) view.findViewById(R.id.item_img);
//            mTextView = (TextView) view.findViewById(R.id.item_text);
//        }
//
//    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }


    /**
     * 万能的viewholder
     */


    class ViewHolder{

    }
}
