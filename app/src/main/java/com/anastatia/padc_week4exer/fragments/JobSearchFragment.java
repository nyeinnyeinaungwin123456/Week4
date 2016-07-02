package com.anastatia.padc_week4exer.fragments;

import android.os.Bundle;
//import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.anastatia.padc_week4exer.R;
import com.anastatia.padc_week4exer.adapter.CustomArrayAdapter;

/**
 * Created by Nyein Nyein on 6/28/2016.
 */
public class JobSearchFragment extends ListFragment
{

    String[] jobs = { "Developer / Senior Developer", "Client Partner - Mobile Publisher Sales, Japan",
            "SAP Partner Solution Center Head for APJ and Greater China ",
            "Technical Architect, Marketing Cloud"};

    String[] companys= {"Standard Chatered Bank", "Facebook", "SAP", "salesforce.com"};

    String[] countries ={"Singapore", "Singapore","Singapore", "Singapore"};

    Integer[] ImagesId = {R.drawable.standardchatered, R.drawable.facebook,
                    R.drawable.sappartner, R.drawable.salesforcce};


    public JobSearchFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jobsearch, container, false);

        CustomArrayAdapter adapter = new CustomArrayAdapter(getActivity(), jobs,
                companys, countries, ImagesId);
        setListAdapter(adapter);


        return view;
    }
}
