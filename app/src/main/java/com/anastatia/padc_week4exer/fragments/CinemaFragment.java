package com.anastatia.padc_week4exer.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.anastatia.padc_week4exer.R;
import com.anastatia.padc_week4exer.adapter.CustomArrayAdapter;
import com.anastatia.padc_week4exer.adapter.CustomMovieArrayAdapter;
import com.anastatia.padc_week4exer.data.vos.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nyein Nyein on 6/28/2016.
 */
public class CinemaFragment extends ListFragment {

    String[] movies = { "Mad Max: Fury Road", "Inside Out",
            "Star Wars: Episode VII - The Force Awakens",
            "Shaun the Sheep", "The Martian", "Mission: Impossible Rogue Nation"};

    String[] townships= {"Pyin Oo Lwin", "Yangon", "Mandalay", "Nay Pyi Taw", "Mawlamyaing", "MyitKyiNa"};

    String[] time ={"10:00 AM, 12:00 AM, 03:00 PM, 06:30 PM", "10:00 AM, 12:00 AM, 03:00 PM, 06:30 PM",
            "10:00 AM, 12:00 AM, 03:00 PM, 06:30 PM", "10:00 AM, 12:00 AM, 03:00 PM, 06:30 PM",
            "10:00 AM, 12:00 AM, 03:00 PM, 06:30 PM", "10:00 AM, 12:00 AM, 03:00 PM, 06:30 PM"};

    Integer[] image1 = {R.drawable.ic_share_black_24dp, R.drawable.ic_share_black_24dp,
            R.drawable.ic_share_black_24dp, R.drawable.ic_share_black_24dp,
            R.drawable.ic_share_black_24dp, R.drawable.ic_share_black_24dp};

    Integer[] image2 = {R.drawable.ic_call_black_24dp, R.drawable.ic_call_black_24dp,
            R.drawable.ic_call_black_24dp, R.drawable.ic_call_black_24dp,
            R.drawable.ic_call_black_24dp, R.drawable.ic_call_black_24dp};


    public CinemaFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cinema, container, false);

        CustomMovieArrayAdapter adapter = new CustomMovieArrayAdapter(getActivity(), movies,
                townships, time, image1, image2);
        setListAdapter(adapter);

//        ListView lv=(ListView) view.findViewById()
//        lv.setOnTouchListener(new ListView.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                int action = event.getAction();
//                switch (action) {
//                    case MotionEvent.ACTION_DOWN:
//                        // Disallow ScrollView to intercept touch events.
//                        v.getParent().requestDisallowInterceptTouchEvent(true);
//                        break;
//
//                    case MotionEvent.ACTION_UP:
//                        // Allow ScrollView to intercept touch events.
//                        v.getParent().requestDisallowInterceptTouchEvent(false);
//                        break;
//                }
//
//                // Handle ListView touch events.
//                v.onTouchEvent(event);
//                return true;
//            }
//        });


        return view;
    }
}




//    private void prepareMovieData() {
//        Movie movie = new Movie("Mad Max: Fury Road", "Pyin Oo Lwin", "10:00 AM, 12:00 AM, 03:00 PM, 06:30 PM", R.drawable.ic_share_black_24dp, R.drawable.ic_call_black_24dp);
//        movieList.add(movie);
//
//        movie = new Movie("Inside Out", "Yangon", "10:00 AM, 12:00 AM, 03:00 PM, 06:30 PM" , R.drawable.ic_share_black_24dp, R.drawable.ic_call_black_24dp);
//        movieList.add(movie);
//
//        movie = new Movie("Star Wars: Episode VII - The Force Awakens", "Nay Pyi Taw", "10:00 AM, 12:00 AM, 03:00 PM, 06:30 PM" , R.drawable.ic_share_black_24dp, R.drawable.ic_call_black_24dp);
//        movieList.add(movie);
//
//        movie = new Movie("Shaun the Sheep", "Mandalay", "10:00 AM, 12:00 AM, 03:00 PM, 06:30 PM" , R.drawable.ic_share_black_24dp, R.drawable.ic_call_black_24dp);
//        movieList.add(movie);
//
//        movie = new Movie("The Martian", "MawLaMyaing", "10:00 AM, 12:00 AM, 03:00 PM, 06:30 PM" , R.drawable.ic_share_black_24dp, R.drawable.ic_call_black_24dp);
//        movieList.add(movie);
//
//        movie = new Movie("Mission: Impossible Rogue Nation", "Bagan", "10:00 AM, 12:00 AM, 03:00 PM, 06:30 PM" , R.drawable.ic_share_black_24dp, R.drawable.ic_call_black_24dp);
//        movieList.add(movie);
//
//        mAdapter.notifyDataSetChanged();
//
//    }

//}

