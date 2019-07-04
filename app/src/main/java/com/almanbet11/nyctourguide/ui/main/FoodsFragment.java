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

        places.add(new Place("40.722232","-73.987430", "Katz's Delicatessen", "161 Ludlow St, NY 10002", "Easily one of the most famous New York City restaurants, Katz’s Delicatessen is an institution that has been serving classic sandwiches since 1888.\n " +
        "\n" + "Although they have a variety of foods on their menu, the single reason you should eat at Katz’s Deli is for their pastrami. The pastrami is sensational, fall apart tender, with a perfect ratio of fat to meat, and a crust of black pepper and secret spices. It’s everything you could want in pastrami.\n" + "\n" +
                "When you enter Katz’s Delicatessen you’ll be handed a little yellow ticket (make sure you hold onto this and don’t lose it or they will charge you, seriously). Take the little yellow ticket and go to the bar-style counter and hand it to a cutter. The cutter will take your order, and fix your sandwiches. " +
                "Oftentimes your cutter will give you a sample of the pastrami as he’s making your sandwich. It’s expected that you give your cutter a tip.",
                R.drawable.f_1));

        places.add(new Place("40.717006", "-73.993244" , "Spacy Village", "72 Forsyth St, NY 10002", "“[The chicken] is marinated in Budweiser, salt, pepper and MSG.”\n" +
                "\nAs I was rummaging my chopsticks through the beauty that is the “Spciy Big Tray Chicken” at Spicy Village restaurant, I caught a glimpse of an article written by the New York Times posted on the wall, written all about Spicy Village and especially focused on the dish I was about to devour.\n" +
                "\nSpicy Village is a tiny restaurant located in Chinatown in Manhattan that specializes in home-cooked style dishes from the central Henan province of China, plus some extra dishes that have roots in Xinjiang – the Spicy Big Tray Chicken being one of them.",
                R.drawable.f_2));

        places.add(new Place("40.625040", "-73.961545", "Di Fara Pizza", "1424 Avenue, NY 11230","When you think about food in New York City, pizza is probably one of the first foods you think of; Not eating pizza in NYC would be the same as getting into a car and not going anywhere – you simply do not do that.\n" +
                "\nIn any New York City travel or food guide, you’ll find dozens of legendary pizza restaurants like Lombardi’s, which is one of the first pizzerias in America, and Grimaldi’s which is known for their coal brick oven pizza.\n" +
                "\nBut when I asked where to go for the best pizza in New York City, I got an overwhelming answer to try Di Fara Pizza in Brooklyn",
                R.drawable.f_3));

        places.add(new Place("40.761915","-73.979361","The Halal Guys", "West 53rd St, NY 10019", "What could be so good about chicken over rice?\n"+
                "That’s what I thought to myself before ever eating at The Halal Guys, one of the original New York City street food carts. " +
                "Their food is Middle Eastern inspired and they serve Halal food as their name pretty clearly suggests.\n" +
                "“Make sure you get a lot of sauce, both the white sauce and the red chili sauce,” are what many people told me about eating at The Halal Guys.",
                R.drawable.f_4));

        places.add(new Place("40.722609","-73.988253","Russ & Daughters", "Houston St, NY 10002", "Another New York City heritage staple is Russ & Daughters, a deli with beginnings as a street food pushcart and has been “Appetizing since 1914.”\n" +
                "Russ & Daughters is one of the most famous New York City restaurants for serving all types of salmon, both smoked and salt cured, with bagels and cream cheese. " +
                "They also have a pretty extensive selection of other delicious foods like herring, salads, and dried fruits and nuts.",
                R.drawable.f_5));

        places.add(new Place("40.730438","-74.000146","Meske Ethiopian", "124 Macdougal St, NY 10012", "Along with more famous New York City restaurants that have become institutions in the city, NYC also provides you with the opportunity to sample cuisines from around the world.\n" +
                "Ethiopian food happens to be a personal favorite of mine, and when I was in NYC, I met up with my good fried Sarah from OHK World, and she took me to one of her favorite Ethiopian restaurants in the city: Meske Ethiopian Restaurant.",
                R.drawable.f_6));

        places.add(new Place("40.742373","-74.005961","Los Tacos #1", "75 9th Ave, NY 10011", "After graduating from University in the United States, in 2009 I decided to travel to Southeast Asia, and I never moved back.\n" +
                "And as much as I love Thai food, one of the only main cuisines I really miss living in Bangkok is Mexican food. It’s not the Tex-Mex type of food that I miss, " +
                "but it’s the real proper tacos where you can taste the meat, the smokiness, and the fiery dry chilies in the salsa.",
                R.drawable.f_7));


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
