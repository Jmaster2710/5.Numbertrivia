package com.example.joel_.numbertrivia3;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TriviaObjectViewHolder extends RecyclerView.ViewHolder {
    public View view;
    public TextView textOne;
    public TextView textTwo;


    public TriviaObjectViewHolder(View itemView) {

        super(itemView);
       // geoImage = itemView.findViewById(R.id.geoImageView);
        view = itemView;
        textOne = itemView.findViewById(R.id.TextOne);
        textTwo = itemView.findViewById(R.id.TextTwo);

    }
}
