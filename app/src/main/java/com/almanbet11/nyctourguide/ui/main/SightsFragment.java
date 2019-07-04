package com.almanbet11.nyctourguide.ui.main;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.UserDictionary;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.almanbet11.nyctourguide.Place;
import com.almanbet11.nyctourguide.PlacesAdapter;
import com.almanbet11.nyctourguide.R;

import java.util.ArrayList;

import static android.view.View.VISIBLE;

/**
 * A simple {@link Fragment} subclass.
 */
public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.lists_places, container, false);


        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place("40.689247","-74.044502","Statue Of Liberty", "New York, NY 10004", "The Statue of Liberty was France's gift to America. Built in 1886, it remains a famous world symbol of freedom and one of the greatest American icons. " +
                "It is one of the world's largest statues, standing just under 152 feet tall from the base to the torch, and weighing approximately 450,000 pounds.\nYou can see the statue from land, with particularly good views from Battery Park, on the southern tip of Manhattan. " +
                "However, to truly appreciate the Statue of Liberty, the best thing to do is to take a short boat trip to Liberty Island and see it up close. You can walk around the base, enter the pedestal, or, with advance reservations, go right up to the crown.",
                R.drawable.sights_1_statue_of_liberty));

        places.add(new Place("40.748817","-73.985428","Empire State Building", "20W 34th St, NY 10001", "The Empire State Building is one of New York's most famous landmark buildings and key tourist attractions. The 381-meter-tall, " +
                "102-storey building was the tallest in the world until the 1 World Trade Center tower rose higher, 41 years later. Topped with a mooring mast for airships, the Empire State Building immediately became a landmark and a symbol for NYC when it opened in 1931." +
                "\n" + "There are actually two observatories atop the Empire State Building, but both offer astounding views. On clear days, you can see up to 80 miles, looking into the neighboring states of New Jersey, Pennsylvania, Connecticut, and Massachusetts.\nThere are actually " +
                "two observatories atop the Empire State Building, but both offer astounding views. On clear days, you can see up to 80 miles, looking into the neighboring states of New Jersey, Pennsylvania, Connecticut, and Massachusetts.",
                R.drawable.sights_2_empire_state));

        places.add(new Place("40.711496", "-74.013490"," Memorial", "180 Greenwich St, NY10007", "The World Trade Center's twin 110-story towers once dominated the Manhattan skyline but were destroyed by suicide-piloted jetliners on September 11, 2001, with a tragic loss of life. " +
                "Where the two towers of the World Trade Center once stood, now stand two square reflecting pools, each one acre in size. Known as the National September 11 Memorial, the area is a moving tribute to the almost 3,000 people killed as a result of attacks on September 11, " +
                "2001 and also the six people killed in the earlier World Trade Center bombing in February, 1993.\nSurrounded by trees and grass, the pools are recessed, with water cascading over the sides and flowing into a seemingly bottomless square. These are the largest manmade " +
                "waterfalls in North America. Around the pools are bronze panels with the names of all those who were killed in the attacks.",
                R.drawable.sights_3_memorial));

        places.add(new Place("40.758023","-73.985510","Time Square", "Manhattan, NY 10036", "Lined with huge, brilliantly lit billboards and screens, Times Square is the place to go in New York in the evening, but still exciting at any time of day. " +
                "This is the location of New York's New Year's Eve Celebrations and the famous \"ball drop\" at midnight, when the square and surrounding streets are filled with people. Times Square is busy and perpetually crowded but has its own unique appeal. " +
                "Bleachers set up at one end are a great place to take a break and appreciate the scene.\nFormerly Longacre Square, Times Square was named in 1904 after the New York Times tower. " +
                "The newspaper first posted current headlines along its moving sign, the first of its kind in the world, in 1928.",
                R.drawable.sights_4_time_square));

        places.add(new Place("40.752783","-73.977186","Grand Central Terminal", "89 E 42nd St, NY 10017", "Grand Central Terminal, often called Grand Central Station, is a fantastic Beaux Arts building, and it's definitely worth popping in to take a look at this famous landmark. " +
                "The building first opened in 1913 as a terminal for the subway and train stations.\nOutside, the 42nd Street colonnaded faces and the statuary on top are some of the key highlights. Inside, you can't miss the Grand Staircase, where you can stop to gaze out over the concourse. " +
                "The beautifully restored ceiling here shows a celestial scene. You'll also find an extensive selection of retail shops and restaurants inside.",
                R.drawable.sights_5_grand_central_terminal));
//
//        places.add(new Place("Brooklyn Bridge", "---", "The Brooklyn Bridge, with its Gothic-shaped arches and suspension cables, is one of the city's most recognizable landmarks and has inspired generations of poets, songwriters, and painters. " +
//                "This historic bridge, spanning the East River from Manhattan to Brooklyn, was completed in 1883 and was the world's first steel suspension bridge. You can see it from many of the ferries, or the east side of Manhattan, but the best way to experience this icon is to take an hour and walk across the Brooklyn Bridge.",
//                R.drawable.sights_6_brooklyn_bridge));
//
//        places.add(new Place("Wall Street", "---","Stretching for eight city blocks from Broadway to South Street is the world famous Wall Street. " +
//                "This street and the surrounding area are home to some of the most important exchanges in the world, including the New York Stock Exchange, the NASDAQ, and the New York Mercantile Exchange.",
//                R.drawable.sights_7_wall_street));



        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.colorForSights);

        final ListView listView = (ListView) rootView.findViewById(R.id.lists_of_places);

        listView.setAdapter(adapter);

        //this code is going to handle the click functionality.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Place currentPlace = places.get(position);


                LinearLayout info_view = view.findViewById(R.id.info_view);

                if (currentPlace.getState() == false){
                    info_view.setVisibility(View.VISIBLE);
                    currentPlace.setState(true);
                }
                else{
                    info_view.setVisibility(View.GONE);
                    currentPlace.setState(false);
                }
            }
        });

        return rootView;


    }


}
