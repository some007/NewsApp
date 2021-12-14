package com.example.newsapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    TextView text_title,text_heading;
    ImageView img_headline;
    CardView cardView;
    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        text_title = itemView.findViewById(R.id.text_Title);
        text_heading = itemView.findViewById(R.id.text_Source);
        img_headline = itemView.findViewById(R.id.img_Headline);
        cardView = itemView.findViewById(R.id.main_container);


    }
}