package com.example.android.quakereport;

/**
 * Created by Jojih on 26/03/2017.
 */

public class Earthquake {
    private String mMagnitude;
    private String mCity;
    private String mDate;

    public Earthquake(String mMagnitude, String mCity, String mDate) {
        this.mMagnitude = mMagnitude;
        this.mCity = mCity;
        this.mDate = mDate;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getCity() {
        return mCity;
    }

    public String getDate() {
        return mDate;
    }
}
