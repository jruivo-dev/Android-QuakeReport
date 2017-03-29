package com.example.android.quakereport;

/**
 * Created by Jojih on 26/03/2017.
 */

public class Earthquake {
    private double mMagnitude;
    private String mCity;
    private long mTimeInMilliseconds;

    public Earthquake(double mMagnitude, String mCity, long mTimeInMilliseconds) {
        this.mMagnitude = mMagnitude;
        this.mCity = mCity;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }


    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mCity;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}

