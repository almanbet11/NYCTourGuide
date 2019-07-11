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


        places.add(new Place("40.767956","-73.981509","Columbus Circle", "848 Columbus Cir, NY 10019","The Shops at Columbus Circle, located in Time Warner Center in the heart of Manhattan, " +
                "is an iconic indoor and public destination that attracts more than 16 million visitors annually. It's the place to shop, dine, live, work and be entertained." ,
                R.drawable.m_1));

        places.add(new Place("40.773940","-73.981880","Century 21", "1964 Broadway, NY 10023","The flagship Century 21 store has 220,000 square feet and seven floors of fashion-a great " +
                "selection of designer brands at discounted prices. Personal shopping assistance is available as well.",
                R.drawable.m_2));

        places.add(new Place("40.763374", "-73.973958", "Bergdoft Goodman", "754 5th Ave, NY 10019", "A New York landmark since 1901, Bergdorf Goodman represents the global pinnacle of style, " +
                "service and modern luxury. With its rich history of showcasing leading and emerging designers, the iconic store at 5th Avenue and 58th Street - the crossroad of fashion" +
                " - is a singular destination for discerning customers around the world. ",
                R.drawable.m_3));

        places.add(new Place("40.760030", "-73.977798", "American Girls Place", "75 Rockefeller, NY 10104", "Spend a day making memories as you browse dolls, accessories, outfits, and best-selling fiction and advice books." +
                " Enjoy dining at the Cafe with rotating menus of kid-friendly fare for lunch, dinner, weekend brunch, and afternoon teas.",
                R.drawable.m_4));

        places.add(new Place("40.754926", "-73.988409", "Midtown Comics", "200 W 40th St, NY 10018", "Midtown Comics' flagship store near Times Square sells an enormous selection of comic books, " +
                "graphic novels, books, T-shirts, apparel, statues, action figures, and other pop-culture collectables.",
                R.drawable.m_5));

        places.add(new Place("40.711599", "-74.011467","WWT Center", "185 Greenwich St, NY 10007", "Westfield World Trade Center is an expansive shopping center that boasts a wide variety " +
                "of stores, including UGG, Under Armour, Victoria's Secret, Apple Store, Banana Republic, and Cole Haan.",
                R.drawable.m_6));




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
