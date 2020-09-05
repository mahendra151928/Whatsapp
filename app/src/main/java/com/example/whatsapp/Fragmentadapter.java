package com.example.whatsapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class Fragmentadapter extends FragmentStatePagerAdapter {

    ArrayList<Fragment> fragmentArrayList=new ArrayList<>();
    ArrayList<String> fragmenttitle=new ArrayList<>();

    public void add(Fragment fragment,String title){
        fragmentArrayList.add(fragment);
        fragmenttitle.add(title);
    }


    public Fragmentadapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmenttitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmenttitle.get(position);
    }
}
