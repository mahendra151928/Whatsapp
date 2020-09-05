package com.example.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Chatadapter extends BaseAdapter {
    Context context;
    int[] chaimg;
    String[] chaname;

    public Chatadapter(Context context, int[] chaimg, String[] chaname) {
        this.context = context;
        this.chaimg = chaimg;
        this.chaname = chaname;
    }

    @Override
    public int getCount() {
        return chaname.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View v, ViewGroup viewGroup) {

        v= LayoutInflater.from(context).inflate(R.layout.chatlayout,viewGroup,false);
        CircleImageView circleImageView=v.findViewById(R.id.chimg);
        TextView textView=v.findViewById(R.id.chname);

        circleImageView.setImageResource(chaimg[i]);
        textView.setText(chaname[i]);
        return v;
    }
}
