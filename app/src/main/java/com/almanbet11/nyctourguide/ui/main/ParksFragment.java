package com.almanbet11.nyctourguide.ui.main;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

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

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.lists_places, container, false);


        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place("Central Park", "---", "A walk, peddle, or carriage ride through the crisscrossing pathways of Central Park is a must-do on anyone's New York City itinerary. " +
                "In winter, you can even lace up your skates and glide across Wollman Rink. This huge park in the city center, a half-mile wide and 2.5 miles long, is one of the things that makes New York such a beautiful and livable city.",
                R.drawable.parks_1_central_park));

        places.add(new Place("Bryant Park", "---", "On a summer's day, it's hard to beat a leisurely afternoon at Bryant Park. The grounds feature monuments and gardens, and \"Le Carrousel,\" a popular carousel. " +
                "A games area makes available chess boards, checkers, and backgammon boards for a small fee.",
                R.drawable.parks_2_bryant_park));

        places.add(new Place("Brooklyn Bridge Park", "---", "From the bridge park are beautiful views over Manhattan, the East River, and beyond to the Statue of Liberty. Biking over the bridge is another option, " +
                "but pedestrian traffic is often very heavy, and cycling can be slow and challenging on busy days. Be aware that the access to the bridge begins well back from the water's edge.",
                R.drawable.parks_3_brooklyn_bridge_park));

        places.add(new Place("Niagara State Park", "---", "Niagara Falls is one of the natural wonders of North America, drawing millions of visitors each year. Located along the border of Canada and the United States, " +
                "there are actually three waterfalls within the park - Bridal Veil Falls, American Falls, and Horseshoe Falls (also known as Canadian Falls). Horseshoe Falls is widest and tallest, dropping 167 feet from a 2,700-foot-wide ledge. " +
                "Tourists can get a panoramic view of all three falls from the observation tower, or take the famed Maid of the Mist boat tour into the basin of Horseshoe Falls.",
                R.drawable.parks_4_niagara_falls));

        places.add(new Place("Letchworth State Park", "---","Letchworth State Park is home to three sets of waterfalls along the dramatic Genesee River Gorge. Steep cliff walls line the gorge, which is surrounded by forest, " +
                "and it is often referred to as the \"Grand Canyon of the East.\" Middle Falls is the largest, with a 107-foot drop, and is illuminated at night from May through October. The park offers a full range of facilities, " +
                "from campsites and cabin rentals to trails, swimming, a playground, and concessions. Winter activities include snowshoeing, cross country skiing, and designated snowmobile trails",
                R.drawable.parks_5_letchworth_state_park));

        places.add(new Place("Watkin Glen State Park", "---", "Watkins Glen is located at the southern tip of Seneca Lake within the Finger Lakes State Parks. The glen extends for two miles, " +
                "dropping a total of 400 feet over 19 waterfalls, past 200-foot cliffs that were carved by the water. In addition to admiring the gorge from its rim trails, visitors will find many things to do, including fishing, hiking, " +
                "and even swimming in the park's Olympic-sized pool. The park has campsites for both tents and RVs, as well as picnic areas for day visitors. Guided tours of the gorge are available in season.",
                R.drawable.parks_6_waktin_glen_state_park));



        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.colorForParks);

        ListView listView = (ListView) rootView.findViewById(R.id.lists_of_places);

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
