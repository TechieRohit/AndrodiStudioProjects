package com.newsapp.rohit.myapplication.activity;

import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.newsapp.rohit.myapplication.R;
import com.newsapp.rohit.myapplication.fragment.MoviesFragment;
import com.newsapp.rohit.myapplication.fragment.TvShowsFragment;
import com.newsapp.rohit.myapplication.utlis.Constants;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private Toolbar mToolbar;
    private ActionBarDrawerToggle mDrawerToggle;
    public static TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawerLayout);
        /*mNavigationView = (NavigationView)findViewById(R.id.navigationView);*/
        mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, mToolbar,R.string.app_name,
                R.string.app_name);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();
        mTabLayout = (TabLayout)findViewById(R.id.tabs);
        mViewPager = (ViewPager)findViewById(R.id.viewpager);
        mTabLayout.setupWithViewPager(mViewPager);
        addFragmentToViewPager(mViewPager);
        onClickListeners();
    }

    private void addFragmentToViewPager(ViewPager viewPager) {
        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new MoviesFragment(),Constants.MOVIES_FRAGMENT);
        pagerAdapter.addFragment(new TvShowsFragment(), Constants.SHOWS_FRAGMENT);
        viewPager.setAdapter(pagerAdapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        private void addFragment(Fragment fragment,String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    private void onClickListeners() {
    }
}
