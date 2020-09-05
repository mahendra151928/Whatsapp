package com.example.whatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class CallFragment extends Fragment {

    ListView calview;
    int [] callcircleimages={R.drawable.buddi,R.drawable.chunchu,R.drawable.mahe,R.drawable.maheriya,R.drawable.musali,R.drawable.riya,R.drawable.supriya,R.drawable.tikal,R.drawable.tingari};
    String[]callnames={"supriya","riya","chunchu","maheriya","buddi","tikkal","tingari","musali","mahe"};
    int[] callimages={R.drawable.ic_video,R.drawable.ic_call,R.drawable.ic_call,R.drawable.ic_video,R.drawable.ic_video,R.drawable.ic_call,R.drawable.ic_video,R.drawable.ic_call,R.drawable.ic_video};




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View c= inflater.inflate(R.layout.fragment_call, container, false);
        calview=c.findViewById(R.id.callview);
        Calladapter calladapter=new Calladapter(getActivity(),callcircleimages,callnames,callimages);
        calview.setAdapter(calladapter);
        return c;
    }
}
