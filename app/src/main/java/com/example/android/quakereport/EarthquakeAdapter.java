package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jojih on 26/03/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listRow = convertView;
        if (listRow == null) {
            listRow = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_row, null);
        }

        Earthquake earthquake = getItem(position);
        TextView magnitudeTextView = (TextView) listRow.findViewById(R.id.magnitude_tf);
        magnitudeTextView.setText("" + earthquake.getMagnitude());

        TextView cityTextView = (TextView) listRow.findViewById(R.id.city_tf);
        cityTextView.setText(earthquake.getCity());

        TextView dateTextView = (TextView) listRow.findViewById(R.id.date_tf);
        dateTextView.setText(earthquake.getDate());

        return listRow;
    }
}
