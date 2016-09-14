package com.naskogeorgiev.homework10092016.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.naskogeorgiev.homework10092016.R;
import com.naskogeorgiev.homework10092016.models.Country;

/**
 * Created by nasko.georgiev on 12.9.2016 г..
 */

public class FragmentCountries extends Fragment implements View.OnClickListener {


    public interface IButtonPressed {
        void onButtonPressed(String data);
    }

    Button mBtnSpain, mBtnFrance, mBtnItaly, mBtnCanada, mBtnMexico;
    IButtonPressed callback;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_countries, container, false);

        mBtnSpain = (Button) view.findViewById(R.id.btn_spain);
        mBtnFrance = (Button) view.findViewById(R.id.btn_france);
        mBtnItaly = (Button) view.findViewById(R.id.btn_italy);
        mBtnCanada = (Button) view.findViewById(R.id.btn_canada);
        mBtnMexico = (Button) view.findViewById(R.id.btn_mexico);

        mBtnSpain.setOnClickListener(this);
        mBtnFrance.setOnClickListener(this);
        mBtnItaly.setOnClickListener(this);
        mBtnCanada.setOnClickListener(this);
        mBtnMexico.setOnClickListener(this);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callback = (IButtonPressed) context;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_spain) {
            if (callback != null)
                callback.onButtonPressed(Country.spain());
        }
        if (v.getId() == R.id.btn_france) {
            if (callback != null)
                callback.onButtonPressed(Country.france());
        }
        if (v.getId() == R.id.btn_italy) {
            if (callback != null)
                callback.onButtonPressed(Country.italy());
        }
        if (v.getId() == R.id.btn_canada) {
            if (callback != null)
                callback.onButtonPressed(Country.canada());
        }
        if (v.getId() == R.id.btn_mexico) {
            if (callback != null)
                callback.onButtonPressed(Country.mexico());
        }
    }

}