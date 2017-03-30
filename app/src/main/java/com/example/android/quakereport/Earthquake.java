package com.example.android.quakereport;

/**
 * Created by Jojih on 26/03/2017.
 */

public class Earthquake {
    private double mMagnitude;
    private String mCity;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double mMagnitude, String mCity, long mTimeInMilliseconds, String url) {
        this.mMagnitude = mMagnitude;
        this.mCity = mCity;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        mUrl = url;
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

    public String getUrl() {
        return mUrl;
    }
}

