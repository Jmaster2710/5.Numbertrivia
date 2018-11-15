package com.example.joel_.numbertrivia3;

public class TriviaObject {
    private int mNumber;
    private String mQuote;


    public TriviaObject(String mQuote, int mNumber) {
        this.mQuote = mQuote;
        this.mNumber = mNumber;
    }

    //Getters
    public String getmQuote()
    {
        return mQuote;
    }

    public int getmNumber()
    {
        return mNumber;
    }

    //Setters
    public void setmQuote(String mQuote)
    {
        this.mQuote = mQuote;
    }
    public void mNumber(int mNumber)
    {
        this.mNumber = mNumber;
    }
}
