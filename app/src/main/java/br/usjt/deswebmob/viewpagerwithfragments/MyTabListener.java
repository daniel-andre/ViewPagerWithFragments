package br.usjt.deswebmob.viewpagerwithfragments;

import android.app.ActionBar;

import android.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar.TabListener;

/**
 * Created by arqdsis on 19/04/2018.
 */

public class MyTabListener implements ActionBar.TabListener {

    private ViewPager viewPager;
    private int index;

    public MyTabListener(ViewPager viewPager, int index) {
        this.viewPager = viewPager;
        this.index = index;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        viewPager.setCurrentItem(index);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }
}
