package com.example.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class Statusadapter extends BaseAdapter {
    Context context;
    ArrayList<Integer>simg;
    ArrayList<String>sname;

    public Statusadapter(Context context, ArrayList<Integer> simg, ArrayList<String> sname) {
        this.context = context;
        this.simg = simg;
        this.sname = sname;
    }

    @Override
    public int getCount() {
        return sname.size();
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
    public View getView(int i, View s, ViewGroup viewGroup) {
         s= LayoutInflater.from(context).inflate(R.layout.statuslayout,viewGroup,false);
        CircleImageView staimg=s.findViewById(R.id.stimg);
        TextView staname=s.findViewById(R.id.stname);

        staimg.setImageResource(simg.get(i));
        staname.setText(sname.get(i));

        return s;
    }
}
