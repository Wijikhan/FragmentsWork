package com.example.pratice1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAccessorAdapter extends FragmentPagerAdapter {
    public TabsAccessorAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                DataFragment dataFragment = new DataFragment();
                return dataFragment;

            case 1:
                ShowDataFragment showDataFragment = new ShowDataFragment();
                return showDataFragment;


            default:
                return null;
        }
    }

        @Override
        public int getCount () {
            return 2;
        }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "Send Data";

            case 1:
                return "Show Data";


            default:
                return null;
        }
    }
}

