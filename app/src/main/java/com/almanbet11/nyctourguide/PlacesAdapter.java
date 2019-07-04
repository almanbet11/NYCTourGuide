package com.almanbet11.nyctourguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;

import static androidx.core.content.ContextCompat.startActivity;

public class PlacesAdapter extends ArrayAdapter<Place> {

    private int colorRecourceId;

    public PlacesAdapter(Activity context, ArrayList<Place> places, int colorRecourceId){
        super(context, 0, places);
        this.colorRecourceId = colorRecourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;


        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_for_one_place, parent, false);
        }

        final Place currentPlace = getItem(position);

        TextView nameOfPlace = listItemView.findViewById(R.id.name_of_place);
        nameOfPlace.setText(currentPlace.getNameOfPlace());

        TextView infoAboutLocation = listItemView.findViewById(R.id.location_state);
        infoAboutLocation.setText(currentPlace.getLocationAndState());

        ImageView imageForPlace = listItemView.findViewById(R.id.image_for_place);
        imageForPlace.setImageResource(currentPlace.getImageResourceId());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorRecourceId);
        textContainer.setBackgroundColor(color);

        View listContainer = listItemView.findViewById(R.id.list);
        listContainer.setBackgroundColor(color);

        TextView infoText = listItemView.findViewById(R.id.text_info);
        infoText.setText(currentPlace.getInfo());

        return listItemView;
    }

}
