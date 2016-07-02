package com.anastatia.padc_week4exer.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.anastatia.padc_week4exer.R;

/**
 * Created by Nyein Nyein on 6/28/2016.
 */
public class PulseFragment extends Fragment{

    public PulseFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pulse, container, false);

//        ImageView img = (ImageView)view.findViewById(R.id.image);
//
//        img.setImageResource(R.drawable.frgthree);

        return view;
    }
}
