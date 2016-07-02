package com.anastatia.padc_week4exer.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.anastatia.padc_week4exer.R;

import org.w3c.dom.Text;

/**
 * A placeholder fragment containing a simple view.
 */
public class LinkInFragment extends Fragment {

    public LinkInFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_linkin, container, false);

        int intSize=16;

        String normalBefore= "\nNyein Nyein Aung Win \n";
        String normalBOLD=  "Junior Android Developer \n";
        String normalMedium= "N0.10, Myaynigone Block, Sanchaung Township, Yangon.\n\n";
        String normalAfter="Developer life is not too easy and not too difficult as well." +
                "I love doing this! Bravo!!!!";

        SpannableString span1 = new SpannableString(normalBefore);
        span1.setSpan(new AbsoluteSizeSpan(18), 0, normalBefore.length(), span1.SPAN_INCLUSIVE_INCLUSIVE);

        SpannableString span2 = new SpannableString(normalBOLD);
        span2.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 0,normalBOLD.length(), span2.SPAN_INCLUSIVE_INCLUSIVE);


        SpannableString span3 = new SpannableString(normalMedium);
        span3.setSpan(new AbsoluteSizeSpan(18), 0,normalMedium.length(), span3.SPAN_INCLUSIVE_INCLUSIVE);

        SpannableString span4 = new SpannableString(normalAfter);
        span4.setSpan(new AbsoluteSizeSpan(18), 0,normalAfter.length(), span4.SPAN_INCLUSIVE_INCLUSIVE);

        CharSequence finalText = TextUtils.concat(span1, span2, span3, span4);
//        String finalString= normalBefore+normalBOLD+normalMedium+normalAfter;
//        Spannable sb = new SpannableString( finalString );
//        sb.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), finalString.indexOf(normalBOLD), normalBOLD.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); //bold
//        sb.setSpan(new AbsoluteSizeSpan(intSize), finalString.indexOf(normalBOLD), normalBOLD.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);//resize size

        TextView headertext=(TextView) view.findViewById(R.id.tv_header);
        headertext.setText(finalText);

        String firsttext1=  "37 \n";
        String firsttext2= "Who's View your profile \n";

        SpannableString spanable1 = new SpannableString(firsttext1);
        spanable1.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 0,firsttext1.length(), spanable1.SPAN_INCLUSIVE_INCLUSIVE);

        SpannableString spanable2 = new SpannableString(firsttext2);
        spanable2.setSpan(new AbsoluteSizeSpan(18), 0,firsttext2.length(), spanable2.SPAN_INCLUSIVE_INCLUSIVE);

        CharSequence totalText1 = TextUtils.concat(spanable1, spanable2);

        TextView firstcolumn=(TextView)view.findViewById(R.id.tv_firstcolumn);
        firstcolumn.setText(totalText1);

        String secondtext1=  "0 \n";
        String secondtext2= "Who's View your share \n";

        SpannableString spanable3 = new SpannableString(secondtext1);
        spanable3.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 0,secondtext1.length(), spanable3.SPAN_INCLUSIVE_INCLUSIVE);

        SpannableString spanable4 = new SpannableString(secondtext2);
        spanable4.setSpan(new AbsoluteSizeSpan(18), 0,secondtext2.length(), spanable4.SPAN_INCLUSIVE_INCLUSIVE);

        CharSequence totalText2 = TextUtils.concat(spanable3, spanable4);

        TextView secondcolumn=(TextView)view.findViewById(R.id.tv_secondcolumn);
        secondcolumn.setText(totalText2);


//        ImageView img = (ImageView)view.findViewById(R.id.image);
//
//        img.setImageResource(R.drawable.frgone);

        return view;
    }
}
