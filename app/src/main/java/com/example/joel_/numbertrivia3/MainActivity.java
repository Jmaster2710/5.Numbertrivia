package com.example.joel_.numbertrivia3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    private TextView mQuoteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuoteTextView = findViewById(R.id.quote_message);

        final List<TriviaItem> mTriviaObjects = new ArrayList<>();

        //Assigning the layout manager.
        final RecyclerView mGeoRecyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 1);

        mGeoRecyclerView.setLayoutManager(mLayoutManager);
        TriviaItemAdapter mAdapter = new TriviaItemAdapter(this, mTriviaObjects);
        mGeoRecyclerView.setAdapter(mAdapter);


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        requestData();
    }

    public void setQuoteTextView(String message) {

        mQuoteTextView.setText(message);

    }

    private void requestData() {
        NumbersApiServices service = NumbersApiServices.retrofit.create(NumbersApiServices.class);
        Random random = new Random();
        int number = random.nextInt(500);

        /**
         * Make an a-synchronous call by enqueing and definition of callbacks.
         */

        Call<TriviaItem> call = service.getQuote(number);
        call.enqueue(new Callback<TriviaItem>() {

            @Override
            public void onResponse(Call<TriviaItem> call, Response<TriviaItem> response) {
                TriviaItem dayQuoteItem = response.body();
                setQuoteTextView(dayQuoteItem.getText());
            }

            @Override
            public void onFailure(Call<TriviaItem> call, Throwable t) {
            }

        });

    }

}
