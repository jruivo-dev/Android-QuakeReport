package com.example.android.quakereport;

/**
 * Created by Jojih on 26/03/2017.
 */

public class Earthquake {
    private String mMagnitude;
    private String mCity;
    private long mTimeInMilliseconds;

    public Earthquake(String mMagnitude, String mCity, long mTimeInMilliseconds) {
        this.mMagnitude = mMagnitude;
        this.mCity = mCity;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }


    public String getMagnitude() {
        return mMagnitude;
    }

    public String getCity() {
        return mCity;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}

