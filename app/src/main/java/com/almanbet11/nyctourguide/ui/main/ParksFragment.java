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

        places.add(new Place("40.782861","-73.965705", "Central Park", "New York, NY", "A walk, peddle, or carriage ride through the crisscrossing pathways of Central Park is a must-do on anyone's New York City itinerary. " +
                "In winter, you can even lace up your skates and glide across Wollman Rink. This huge park in the city center, a half-mile wide and 2.5 miles long, is one of the things that makes New York such a beautiful and livable city.",
                R.drawable.p_1));

        places.add(new Place("40.753759", "-73.983447", "Bryant Park", "New York, NY 10018", "On a summer's day, it's hard to beat a leisurely afternoon at Bryant Park. The grounds feature monuments and gardens, and \"Le Carrousel,\" a popular carousel. " +
                "A games area makes available chess boards, checkers, and backgammon boards for a small fee.",
                R.drawable.p_2));

        places.add(new Place("40.700660", "-73.996813", "Brooklyn Bridge Park", "334 Furman St, NY 11201", "From the bridge park are beautiful views over Manhattan, the East River, and beyond to the Statue of Liberty. Biking over the bridge is another option, " +
                "but pedestrian traffic is often very heavy, and cycling can be slow and challenging on busy days. Be aware that the access to the bridge begins well back from the water's edge.",
                R.drawable.p_3));

        places.add(new Place("43.081631", "-79.072701", "Niagara State Park", "Niagara Falls, NY 14303", "Niagara Falls is one of the natural wonders of North America, drawing millions of visitors each year. Located along the border of Canada and the United States, " +
                "there are actually three waterfalls within the park - Bridal Veil Falls, American Falls, and Horseshoe Falls (also known as Canadian Falls). Horseshoe Falls is widest and tallest, dropping 167 feet from a 2,700-foot-wide ledge. " +
                "Tourists can get a panoramic view of all three falls from the observation tower, or take the famed Maid of the Mist boat tour into the basin of Horseshoe Falls.In addition to park information and tour tickets, the visitor center has a gift " +
                "shop, several dining options, and a theater that shows a 40-minute film about the history and legend of the falls. The park also provides nighttime illumination of the Horseshoe Falls and hosts spectacular fireworks shows on special occasions.",
                R.drawable.p_4));

        places.add(new Place("42.669879", "-77.963408","Letchworth State Park", "Letchworth, NY 14427","Letchworth State Park is home to three sets of waterfalls along the dramatic Genesee River Gorge. Steep cliff walls line the gorge, which is surrounded by forest, " +
                "and it is often referred to as the \"Grand Canyon of the East.\" Middle Falls is the largest, with a 107-foot drop, and is illuminated at night from May through October. The park offers a full range of facilities, " +
                "from campsites and cabin rentals to trails, swimming, a playground, and concessions. Winter activities include snowshoeing, cross country skiing, and designated snowmobile trails",
                R.drawable.p_5));
//
        places.add(new Place("42.371386","-76.883402" ,"Watkin Glen State Park", "Six Nations Campground", "Watkins Glen is located at the southern tip of Seneca Lake within the Finger Lakes State Parks. The glen extends for two miles, " +
                "dropping a total of 400 feet over 19 waterfalls, past 200-foot cliffs that were carved by the water. In addition to admiring the gorge from its rim trails, visitors will find many things to do, including fishing, hiking, " +
                "and even swimming in the park's Olympic-sized pool. The park has campsites for both tents and RVs, as well as picnic areas for day visitors. Guided tours of the gorge are available in season.",
                R.drawable.p_6));



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
