package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Jojih on 26/03/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOCATION_SEPARATOR = " of ";


    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String primaryLocation;
        String locationOffset;

        View listRow = convertView;
        if (listRow == null) {
            listRow = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_row, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);
        TextView magnitudeView = (TextView) listRow.findViewById(R.id.magnitude);
        magnitudeView.setText(currentEarthquake.getMagnitude());

        String originalLocation = currentEarthquake.getLocation();

        if (originalLocation.contains(LOCATION_SEPARATOR)) {
            String[] parts = originalLocation.split(LOCATION_SEPARATOR);
            locationOffset = parts[0] + LOCATION_SEPARATOR;
            primaryLocation = parts[1];

        } else {
            locationOffset = "Near the ";
            primaryLocation = originalLocation;
        }


        TextView primaryLocationView = (TextView) listRow.findViewById(R.id.primary_location);
        primaryLocationView.setText(primaryLocation);

        TextView offsetLocationView = (TextView) listRow.findViewById(R.id.offset_location);
        offsetLocationView.setText(locationOffset);

        TextView dateView = (TextView) listRow.findViewById(R.id.date);
        Date dateObject = new Date(currentEarthquake.getTimeInMilliseconds());
        dateView.setText(formatDate(dateObject));

        TextView timeView = (TextView) listRow.findViewById(R.id.time);
        Date timeObject = new Date(currentEarthquake.getTimeInMilliseconds());
        timeView.setText(formatTime(timeObject));

        return listRow;
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormatter.format(dateObject);
    }

    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);


    }

}
