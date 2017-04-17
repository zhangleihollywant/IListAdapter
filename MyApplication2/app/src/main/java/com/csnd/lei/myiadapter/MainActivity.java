package com.csnd.lei.myiadapter;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private List<Student> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        mListView.setAdapter(new Adapter<Student>(this, mList, R.layout.item) {
            @Override
            public void convert(ViewHolder viewHolder, Student item) {
                TextView textView = viewHolder.getView(R.id.item_text);
                ImageView imageView = viewHolder.getView(R.id.item_img);
                textView.setText(item.toString());
                imageView.setImageDrawable(ContextCompat.getDrawable(MainActivity.this, R.mipmap.ic_launcher));
            }
        });
    }

    private void initData() {
        mList.add(new Student("zhangsan ", 1));
        mList.add(new Student("zhangsan ", 1));
        mList.add(new Student("zhangsan ", 1));
        mList.add(new Student("zhangsan ", 1));
    }

    private void initView() {
        mList = new ArrayList<>();
        mListView = (ListView) findViewById(R.id.mlist);
    }

}
