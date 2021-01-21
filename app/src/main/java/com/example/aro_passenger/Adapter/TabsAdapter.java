package com.example.aro_passenger.Adapter;

import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.aro_passenger.Fragment.AirportFragment;
import com.example.aro_passenger.Fragment.RentalFragment;
import com.example.aro_passenger.Fragment.OnewayFragment;
import com.example.aro_passenger.Fragment.RoundFragment;



public class TabsAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public TabsAdapter(FragmentManager fm, int NoofTabs){
        super(fm);
        this.mNumOfTabs = NoofTabs;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                RoundFragment roundFragment = new RoundFragment();
                return roundFragment;
            case 1:
                OnewayFragment onewayFragment = new OnewayFragment();
                return onewayFragment;
            case 2:
                RentalFragment rentalFragment = new RentalFragment();
                return rentalFragment;
            case 3:
                AirportFragment airportFragment = new AirportFragment();
                return airportFragment;

            default:
                return null;
        }
    }
}