package com.naskogeorgiev.homework10092016.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.naskogeorgiev.homework10092016.R;
import com.naskogeorgiev.homework10092016.fragments.FragmentCountries;
import com.naskogeorgiev.homework10092016.fragments.FragmentCountryInfo;

public class TaskTwoActivity extends AppCompatActivity implements FragmentCountries.IButtonPressed, FragmentCountryInfo.ICountrySelected {

    Fragment fragmentTaskTwo;
    Fragment fragmentCountryInfo;
    String country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_two);

        fragmentTaskTwo = new FragmentCountries();
        getSupportFragmentManager().beginTransaction().add(R.id.activity_task_two, fragmentTaskTwo).commit();
    }

    @Override
    public void onButtonPressed(String data) {
        this.country = data;
        fragmentCountryInfo = new FragmentCountryInfo();
        getSupportFragmentManager().beginTransaction().replace(R.id.activity_task_two, fragmentCountryInfo).commit();
    }

    @Override
    public void onBackPressed() {
        if (fragmentCountryInfo != null && fragmentCountryInfo.isVisible())
            getSupportFragmentManager().beginTransaction().replace(R.id.activity_task_two, fragmentTaskTwo).commit();
        else
            super.onBackPressed();
    }

    @Override
    public String onCountrySelected() {
        if (country != null)
            return country;
        return "Failed to get country";
    }
}
