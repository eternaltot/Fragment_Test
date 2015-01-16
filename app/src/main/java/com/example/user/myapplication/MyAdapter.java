package com.example.user.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by User on 7/1/2558.
 */
public class MyAdapter extends FragmentPagerAdapter {

    private final int PAGE_NUM =3;

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0)
            return new FragmentOne();
        else if (position==1)
            return new FragmentTwo();
        else if (position==2)
            return new FragmentThree();
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_NUM;
    }
}
