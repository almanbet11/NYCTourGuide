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

        places.add(new Place("Statue Of Liberty", "---", "The Statue of Liberty was France's gift to America. Built in 1886, it remains a famous world symbol of freedom and one of the greatest American icons. " +
                "It is one of the world's largest statues, standing just under 152 feet tall from the base to the torch, and weighing approximately 450,000 pounds.",
                R.drawable.sights_1_statue_of_liberty));

        places.add(new Place("Empire State Building", "---", "The Empire State Building is one of New York's most famous landmark buildings and key tourist attractions. The 381-meter-tall, " +
                "102-storey building was the tallest in the world until the 1 World Trade Center tower rose higher, 41 years later. Topped with a mooring mast for airships, the Empire State Building immediately became a landmark and a symbol for NYC when it opened in 1931.\n" +
                "\n" + "There are actually two observatories atop the Empire State Building, but both offer astounding views. On clear days, you can see up to 80 miles, looking into the neighboring states of New Jersey, Pennsylvania, Connecticut, and Massachusetts.",
                R.drawable.sights_2_empire_state));

        places.add(new Place(" Memorial", "---", "The World Trade Center's twin 110-story towers once dominated the Manhattan skyline but were destroyed by suicide-piloted jetliners on September 11, 2001, with a tragic loss of life. " +
                "Where the two towers of the World Trade Center once stood, now stand two square reflecting pools, each one acre in size. Known as the National September 11 Memorial, the area is a moving tribute to the almost 3,000 people killed as a result of attacks on September 11, " +
                "2001 and also the six people killed in the earlier World Trade Center bombing in February, 1993.",
                R.drawable.sights_3_memorial));

        places.add(new Place("Time Square", "---", "Lined with huge, brilliantly lit billboards and screens, Times Square is the place to go in New York in the evening, but still exciting at any time of day. " +
                "This is the location of New York's New Year's Eve Celebrations and the famous \"ball drop\" at midnight, when the square and surrounding streets are filled with people. Times Square is busy and perpetually crowded but has its own unique appeal. " +
                "Bleachers set up at one end are a great place to take a break and appreciate the scene.",
                R.drawable.sights_4_time_square));

        places.add(new Place("Grand Central Terminal", "---", "Grand Central Terminal, often called Grand Central Station, is a fantastic Beaux Arts building, and it's definitely worth popping in to take a look at this famous landmark. " +
                "The building first opened in 1913 as a terminal for the subway and train stations",
                R.drawable.sights_5_grand_central_terminal));

        places.add(new Place("Brooklyn Bridge", "---", "The Brooklyn Bridge, with its Gothic-shaped arches and suspension cables, is one of the city's most recognizable landmarks and has inspired generations of poets, songwriters, and painters. " +
                "This historic bridge, spanning the East River from Manhattan to Brooklyn, was completed in 1883 and was the world's first steel suspension bridge. You can see it from many of the ferries, or the east side of Manhattan, but the best way to experience this icon is to take an hour and walk across the Brooklyn Bridge.",
                R.drawable.sights_6_brooklyn_bridge));

        places.add(new Place("Wall Street", "---","Stretching for eight city blocks from Broadway to South Street is the world famous Wall Street. " +
                "This street and the surrounding area are home to some of the most important exchanges in the world, including the New York Stock Exchange, the NASDAQ, and the New York Mercantile Exchange.",
                R.drawable.sights_7_wall_street));



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
