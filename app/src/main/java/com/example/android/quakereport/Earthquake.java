package com.example.android.quakereport;

/**
 * Created by Jojih on 26/03/2017.
 */

public class Earthquake {
    private double mMagnitude;
    private String mCity;
    private String mDate;

    public Earthquake(double mMagnitude, String mCity, String mDate) {
        this.mMagnitude = mMagnitude;
        this.mCity = mCity;
        this.mDate = mDate;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getCity() {
        return mCity;
    }

    public String getDate() {
        return mDate;
    }
}
