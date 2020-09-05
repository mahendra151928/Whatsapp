package com.example.whatsapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.transform.Result;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class StatusFragment extends Fragment {
    private CircleImageView profileimage;
    private static final int pick_image=1;
    Uri imageUri;

    ListView stView;
    ArrayList<Integer> statimg=new ArrayList<>(Arrays.asList(R.drawable.buddi,R.drawable.chunchu,R.drawable.mahe,R.drawable.maheriya,R.drawable.musali,R.drawable.riya,R.drawable.supriya,R.drawable.tikal,R.drawable.tingari));
    ArrayList<String>statname=new ArrayList<>(Arrays.asList("supriya","riya","chunchu","maheriya","buddi","tikkal","tingari","musali","mahe"));



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View s= inflater.inflate(R.layout.fragment_status, container, false);
        stView=s.findViewById(R.id.statview);
        profileimage=s.findViewById(R.id.profile);

        profileimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gallery=new Intent();
                gallery.setType("image/*");
                gallery.setAction(Intent.ACTION_GET_CONTENT);

                startActivityForResult(Intent.createChooser(gallery,"Select Picture"),pick_image);
            }

        });

        Statusadapter statusadapter=new Statusadapter(getActivity(),statimg,statname);
        stView.setAdapter(statusadapter);

        return s;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==pick_image && resultCode==resultCode){
            imageUri=data.getData();
            try {
                InputStream inputStream=getActivity().getContentResolver().openInputStream(data.getData());
                Bitmap bitmap= MediaStore.Images.Media.getBitmap(getActivity().getContentResolver(),imageUri);
                profileimage.setImageBitmap(bitmap);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
