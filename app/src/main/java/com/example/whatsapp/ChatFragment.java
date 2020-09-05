package com.example.whatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends Fragment {
    ListView listView;
    int [] images={R.drawable.buddi,R.drawable.chunchu,R.drawable.mahe,R.drawable.maheriya,R.drawable.musali,R.drawable.riya,R.drawable.supriya,R.drawable.tikal,R.drawable.tingari};
    String[]names={"supriya","riya","chunchu","maheriya","buddi","tikkal","tingari","musali","mahe"};




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_chat, container, false);
        listView=v.findViewById(R.id.lview);
        Chatadapter chatadapter=new Chatadapter(getActivity(),images,names);
        listView.setAdapter(chatadapter);
        return v;
    }
}
