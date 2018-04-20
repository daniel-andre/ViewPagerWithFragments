package br.usjt.deswebmob.viewpagerwithfragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        FragmentManager fm = getSupportFragmentManager();
        viewPager.setAdapter(new TabsAdapter(fm));

        final ActionBar actionBar = getSupportActionBar();

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        actionBar.addTab(actionBar.newTab().setText("Frag1").setTabListener((ActionBar.TabListener) new MyTabListener(viewPager, 0)));

        actionBar.addTab(actionBar.newTab().setText("Frag2").setTabListener((ActionBar.TabListener) new MyTabListener(viewPager, 1)));

        actionBar.addTab(actionBar.newTab().setText("Frag3").setTabListener((ActionBar.TabListener) new MyTabListener(viewPager, 2)));
    }
}
