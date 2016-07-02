package com.anastatia.padc_week4exer.adapter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.anastatia.padc_week4exer.R;
import com.anastatia.padc_week4exer.data.vos.Movie;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Nyein Nyein on 6/30/2016.
 */
public class CustomMovieArrayAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] movieName;
    private final String[] movieTownship;
    private final String[] movieTime;
    private final Integer[] imageId1;
    private final Integer[] imageId2;

    public CustomMovieArrayAdapter(Activity context, String[] movieName,
                              String[] movieTownship,String[] movieTime, Integer[] imageId1, Integer[] imageId2) {
        super(context, R.layout.movie_list_row, movieName);
        this.context = context;
        this.movieName = movieName;
        this.movieTownship = movieTownship;
        this.movieTime=movieTime;
        this.imageId1=imageId1;
        this.imageId2=imageId2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d("CustomMovieArrayAdapter", String.valueOf(position));
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.movie_list_row, null, true);
        TextView txtmovieName = (TextView)rowView
                .findViewById(R.id.tv_moviename);
//		TextView txtTitle2 = (TextView) rowView
//				.findViewById(R.id.txtPresidentName);
        TextView txtmovieTownship = (TextView) rowView
                .findViewById(R.id.tv_movietownship);
        TextView txtmovieTime = (TextView) rowView.findViewById(R.id.tv_movietime);
        ImageView ivjobImage1=(ImageView) rowView.findViewById(R.id.iv_share);
        ImageView ivjobImage2=(ImageView)rowView.findViewById(R.id.iv_call);


//                Bitmap bitmap = BitmapFactory.decodeResource(getContext().getResources(),R.drawable.ic_share_black_24dp);
//        Bitmap circularBitmap = ImageConverter.getRoundedCornerBitmap(bitmap, 100);
//
//        ImageView circularImageView = (ImageView)findViewById(R.id.imageView);
//        circularImageView.setImageBitmap(circularBitmap);

        txtmovieName.setText(movieName[position]);
        txtmovieTownship.setText(movieTownship[position]);
//		txtTitle.setText(years[position]);
        txtmovieTime.setText(movieTime[position]);
        ivjobImage1.setImageResource(imageId1[position]);
        ivjobImage2.setImageResource(imageId2[position]);
        return rowView;

    }
}
