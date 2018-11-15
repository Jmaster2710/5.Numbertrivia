package com.example.joel_.numbertrivia3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class TriviaObjectAdapter extends  RecyclerView.Adapter<TriviaObjectViewHolder>{
    private Context context;
    public List<TriviaObject> listTriviaObject;


    public TriviaObjectAdapter(Context context, List<TriviaObject> listTriviaItem) {

        this.context = context;
        this.listTriviaObject = listTriviaItem;
    }

    public void swapList (List<TriviaObject> newList) {
        listTriviaObject = newList;
        if (newList != null) {
            // Force the RecyclerView to refresh
            this.notifyDataSetChanged();
        }
    }

    @Override
    public TriviaObjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        if (listTriviaObject.size() % 2 == 0) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gridcellreverse, parent, false);
        } else
        {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gridcell, parent, false);
        }

        return new TriviaObjectViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final TriviaObjectViewHolder holder, final int position) {

        // Gets a single item in the list from its position

        final TriviaObject triviaObject = listTriviaObject.get(position);

        // The holder argument is used to reference the views inside the viewHolder
        // Populate the views with the data from the list

        holder.textOne.setText(String.valueOf(triviaObject.getmNumber()));
        holder.textTwo.setText(triviaObject.getmQuote());
       // holder.geoImage.setImageResource(triviaObject.getmGeoImageName());

    }

    @Override
    public int getItemCount() {

        return listTriviaObject.size();
    }
}
