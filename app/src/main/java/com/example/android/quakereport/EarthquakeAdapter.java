package com.example.android.quakereport;

import android.content.Context;
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


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listRow = convertView;
        if (listRow == null) {
            listRow = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_row, parent, false);
        }

        Earthquake earthquake = getItem(position);
        TextView magnitudeView = (TextView) listRow.findViewById(R.id.magnitude);
        magnitudeView.setText(earthquake.getMagnitude());

        TextView cityView = (TextView) listRow.findViewById(R.id.city);
        cityView.setText(earthquake.getCity());

        TextView dateView = (TextView) listRow.findViewById(R.id.date);
        dateView.setText(earthquake.getDate());

        return listRow;
    }
}
