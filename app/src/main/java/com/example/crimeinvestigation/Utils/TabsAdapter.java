package com.example.crimeinvestigation.Utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

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
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                Crime crime = new Crime();
                return crime;
            case 1:
                Complaint complaint = new Complaint();
                return complaint;
            case 2:
                MissingPerson missingPerson = new MissingPerson();
                return missingPerson;
            default:
                return null;
        }
    }
}