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
public class FoodsFragment extends Fragment {


    public FoodsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.lists_places, container, false);


        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place("Katz's Delicatessen", "---", "Easily one of the most famous New York City restaurants, Katz’s Delicatessen is an institution that has been serving classic sandwiches since 1888.\n" + "" +
                "Although they have a variety of foods on their menu, the single reason you should eat at Katz’s Deli is for their pastrami. The pastrami is sensational, fall apart tender, with a perfect ratio of fat to meat, and a crust of black pepper and secret spices. " +
                "It’s everything you could want in pastrami.",
                R.drawable.foods_1_katz));

        places.add(new Place("Spacy Village", "---", "“[The chicken] is marinated in Budweiser, salt, pepper and MSG.”\n" +
                "\n" +
                "As I was rummaging my chopsticks through the beauty that is the “Spciy Big Tray Chicken” at Spicy Village restaurant, I caught a glimpse of an article written by the New York Times posted on the wall, " +
                "written all about Spicy Village and especially focused on the dish I was about to devour.",
                R.drawable.foods_2_spicy_village));

        places.add(new Place("Di Fara Pizza", "---","When you think about food in New York City, pizza is probably one of the first foods you think of; " +
                "Not eating pizza in NYC would be the same as getting into a car and not going anywhere – you simply do not do that.\n" +
                "In any New York City travel or food guide, you’ll find dozens of legendary pizza restaurants like Lombardi’s, which is one of the first pizzerias in America, and Grimaldi’s which is known for their coal brick oven pizza.",
                R.drawable.foods_3_difara));

        places.add(new Place("The Halal Guys", "---", "What could be so good about chicken over rice?\n"+
                "That’s what I thought to myself before ever eating at The Halal Guys, one of the original New York City street food carts. " +
                "Their food is Middle Eastern inspired and they serve Halal food as their name pretty clearly suggests.\n" +
                "“Make sure you get a lot of sauce, both the white sauce and the red chili sauce,” are what many people told me about eating at The Halal Guys.",
                R.drawable.foods_4_halal_guys));

        places.add(new Place("Russ & Daughters", "---", "Another New York City heritage staple is Russ & Daughters, a deli with beginnings as a street food pushcart and has been “Appetizing since 1914.”\n" +
                "Russ & Daughters is one of the most famous New York City restaurants for serving all types of salmon, both smoked and salt cured, with bagels and cream cheese. " +
                "They also have a pretty extensive selection of other delicious foods like herring, salads, and dried fruits and nuts.",
                R.drawable.foods_5_russ));

        places.add(new Place("Meske Ethiopian", "---", "Along with more famous New York City restaurants that have become institutions in the city, NYC also provides you with the opportunity to sample cuisines from around the world.\n" +
                "Ethiopian food happens to be a personal favorite of mine, and when I was in NYC, I met up with my good fried Sarah from OHK World, and she took me to one of her favorite Ethiopian restaurants in the city: Meske Ethiopian Restaurant.",
                R.drawable.foods_6_meske_epthiopian));

        places.add(new Place("Los Tacos #1", "---", "After graduating from University in the United States, in 2009 I decided to travel to Southeast Asia, and I never moved back.\n" +
                "And as much as I love Thai food, one of the only main cuisines I really miss living in Bangkok is Mexican food. It’s not the Tex-Mex type of food that I miss, " +
                "but it’s the real proper tacos where you can taste the meat, the smokiness, and the fiery dry chilies in the salsa.",
                R.drawable.foods_7_los_tacos));


        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.colorForFoods);

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
