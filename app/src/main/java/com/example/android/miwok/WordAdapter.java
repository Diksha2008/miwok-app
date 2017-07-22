package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Diksha on 1/24/2017.
 */

public class WordAdapter extends ArrayAdapter<word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<word> words,int colorResourceId){
        super(context,0,words);
        mColorResourceId=colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View lisItemView=convertView;
        if(lisItemView==null){
            lisItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        word currentWord=getItem(position);

        LinearLayout linearLayout=(LinearLayout) lisItemView.findViewById(R.id.background);
        linearLayout.setBackgroundResource(mColorResourceId);

        TextView defaultTextView=(TextView) lisItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView=(TextView) lisItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        ImageView iconView = (ImageView) lisItemView.findViewById(R.id.image);

        if(currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getImageResourceID());
            iconView.setVisibility(View.VISIBLE);
        }
        else{
            iconView.setVisibility(View.GONE);
        }

        return lisItemView;
    }
}
