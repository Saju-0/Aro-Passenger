package com.example.aro_passenger;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.aro_passenger.Adapter.TabsAdapter;
import com.google.android.material.tabs.TabLayout;

public class Dashboard extends AppCompatActivity {

    public static final String TAG = Dashboard.class.getSimpleName();

    public Context context = Dashboard.this;


    /* Initializing XML Views */

    private TabLayout  tabLayout;

    private ViewPager viewPager;


    /* Initializing Normal Data */

    /**
     * Overriding onCreate
     * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        initializeXML();

        initialWorks();

        clickListener();
    }



    /**
     * Initializing XML Views
     * */
    private void initializeXML()
    {
        tabLayout = findViewById(R.id.tab_layout);

        viewPager = findViewById(R.id.view_pager);
    }



    /**
     * Contains Initial Works
     * */
    private void initialWorks()
    {
        tabLayout.addTab(tabLayout.newTab().setText("ROUND"));
        tabLayout.addTab(tabLayout.newTab().setText("ONE-WAY"));
        tabLayout.addTab(tabLayout.newTab().setText("RENTAL"));
        tabLayout.addTab(tabLayout.newTab().setText("AIRPORT"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        TabsAdapter tabsAdapter = new TabsAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(tabsAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


    }



    /**
     * Listens All Actions
     * */
    private void clickListener()
    {
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {


            }
        });
    }
}
