package com.example.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Calladapter extends BaseAdapter {
    Context context;
    int []calcirimg;
    String [] calname;
    int[] calimg;

    public Calladapter(Context context, int[] calcirimg, String[] calname, int[] calimg) {
        this.context = context;
        this.calcirimg = calcirimg;
        this.calname = calname;
        this.calimg = calimg;
    }

    @Override
    public int getCount() {
        return calcirimg.length;
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
    public View getView(int i, View ca, ViewGroup viewGroup) {
        ca= LayoutInflater.from(context).inflate(R.layout.calllayout,viewGroup,false);
        CircleImageView callcimg=ca.findViewById(R.id.cacimg);
        TextView callname=ca.findViewById(R.id.caname);
        ImageView callimg=ca.findViewById(R.id.caimg);

        callcimg.setImageResource(calcirimg[i]);
        callname.setText(calname[i]);
        callimg.setImageResource(calimg[i]);
        return ca;
    }
}
