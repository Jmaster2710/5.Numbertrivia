package com.example.joel_.numbertrivia3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class TriviaItemAdapter extends  RecyclerView.Adapter<TriviaItemViewHolder>{
    private Context context;
    public List<TriviaItem> listTriviaItem;


    public TriviaItemAdapter(Context context, List<TriviaItem> listTriviaItem) {

        this.context = context;
        this.listTriviaItem = listTriviaItem;
    }

    @Override
    public TriviaItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gridcell, parent, false);

        return new TriviaItemViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final TriviaItemViewHolder holder, final int position) {

        // Gets a single item in the list from its position

        final TriviaItem triviaItem = listTriviaItem.get(position);

        // The holder argument is used to reference the views inside the viewHolder
        // Populate the views with the data from the list

       // holder.geoImage.setImageResource(geoObject.getmGeoImageName());

    }

    @Override
    public int getItemCount() {

        return listTriviaItem.size();
    }
}
