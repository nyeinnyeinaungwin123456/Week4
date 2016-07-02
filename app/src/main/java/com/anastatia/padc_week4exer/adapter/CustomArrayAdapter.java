package com.anastatia.padc_week4exer.adapter;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.anastatia.padc_week4exer.R;

public class CustomArrayAdapter extends ArrayAdapter<String> {
	private final Activity context;
	private final String[] jobname;
	private final String[] company;
	private final String[] country;
	private final Integer[] imageIds;

	public CustomArrayAdapter(Activity context, String[] jobname,
							  String[] company,String[] country, Integer[] imageIds) {
		super(context, R.layout.custom_jobsearch_array, jobname);
		this.context = context;
		this.jobname = jobname;
		this.company = company;
		this.country=country;
		this.imageIds=imageIds;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Log.d("CustomJobArrayAdapter", String.valueOf(position));
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView = inflater.inflate(R.layout.custom_jobsearch_array, null, true);
		TextView txtJobName = (TextView)rowView
				.findViewById(R.id.tv_jobname);
//		TextView txtTitle2 = (TextView) rowView
//				.findViewById(R.id.txtPresidentName);
		TextView txtCompany = (TextView) rowView
				.findViewById(R.id.tv_company);
		TextView txtCountry = (TextView) rowView.findViewById(R.id.tv_country);
		ImageView jobImage=(ImageView)rowView.findViewById(R.id.iv_jobImage);

		txtJobName.setText(jobname[position]);
		txtCompany.setText(company[position]);
//		txtTitle.setText(years[position]);
		txtCountry.setText(country[position]);
		jobImage.setImageResource(imageIds[position]);
		return rowView;

	}
}
