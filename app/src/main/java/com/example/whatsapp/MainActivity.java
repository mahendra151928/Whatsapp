package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tlayout);
        viewPager=findViewById(R.id.vpager);

        Fragmentadapter fragmentadapter=new Fragmentadapter(getSupportFragmentManager());
        fragmentadapter.add(new ChatFragment(),"Chat");
        fragmentadapter.add(new StatusFragment(),"Status");
        fragmentadapter.add(new CallFragment(),"Call");
        viewPager.setAdapter(fragmentadapter);
        tabLayout.setupWithViewPager(viewPager,true);


    }
}
