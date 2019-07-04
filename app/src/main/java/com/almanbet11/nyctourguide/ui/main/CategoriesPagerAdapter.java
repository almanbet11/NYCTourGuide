package com.almanbet11.nyctourguide.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.almanbet11.nyctourguide.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class CategoriesPagerAdapter extends FragmentPagerAdapter {


    private String tabTitles[] = new String[] { "Sights", "Parks", "Foods", "Malls" };

    public CategoriesPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {

        if (position == 0){
            return new SightsFragment();
        }
        else if (position == 1){
            return new ParksFragment();
        }
        else if (position == 2){
            return new FoodsFragment();
        }
        else{
            return new MallsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}