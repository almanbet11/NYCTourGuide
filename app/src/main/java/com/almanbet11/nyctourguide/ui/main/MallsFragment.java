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
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.lists_places, container, false);


        final ArrayList<Place> places = new ArrayList<>();


        places.add(new Place("Columbus Circle", "---","The Shops at Columbus Circle, located in Time Warner Center in the heart of Manhattan, " +
                "is an iconic indoor and public destination that attracts more than 16 million visitors annually. It's the place to shop, dine, live, work and be entertained." ,
                R.drawable.malls_1_the_shop_at_columbus));

        places.add(new Place("Century 21", "---","The flagship Century 21 store has 220,000 square feet and seven floors of fashion-a great " +
                "selection of designer brands at discounted prices. Personal shopping assistance is available as well.",
                R.drawable.malls_2_centry_21));

        places.add(new Place("Bergdoft Goodman", "---", "A New York landmark since 1901, Bergdorf Goodman represents the global pinnacle of style, " +
                "service and modern luxury. With its rich history of showcasing leading and emerging designers, the iconic store at 5th Avenue and 58th Street - the crossroad of fashion" +
                " - is a singular destination for discerning customers around the world. ",
                R.drawable.malls_3_bergdoft));

        places.add(new Place("American Girls Place", "---", "Spend a day making memories as you browse dolls, accessories, outfits, and best-selling fiction and advice books." +
                " Enjoy dining at the Cafe with rotating menus of kid-friendly fare for lunch, dinner, weekend brunch, and afternoon teas.",
                R.drawable.malls_4_american_girl));

        places.add(new Place("Midtown Comics", "---", "Midtown Comics' flagship store near Times Square sells an enormous selection of comic books, " +
                "graphic novels, books, T-shirts, apparel, statues, action figures, and other pop-culture collectables.",
                R.drawable.malls_5_midtown_comics));

        places.add(new Place("Westfield World Trade Center", "---", "Westfield World Trade Center is an expansive shopping center that boasts a wide variety " +
                "of stores, including UGG, Under Armour, Victoria's Secret, Apple Store, Banana Republic, and Cole Haan.",
                R.drawable.malls_6_westfieldwt));




        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.colorForMalls);

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
