package com.example.appxaydungproject.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments = new ArrayList<>();
    private List<String> fragmentTitle = new ArrayList<>();

    public  ViewPagerAdapter(@NonNull FragmentManager fm , int behavior){
        super(fm, behavior);
    }
    public  void addFragment(Fragment fragment , String title){
        fragments.add(fragment);
        fragmentTitle.add(title);
    }
    @NonNull
    @Override
    public Fragment getItem(int position){
        return  fragments.get(position);
    }

    @Override
    public int getCount(){
        return  fragments.size();
    }

    @NonNull
    @Override
    public CharSequence getPageTitle(int position){
        return  fragmentTitle.get(position);
    }
}
