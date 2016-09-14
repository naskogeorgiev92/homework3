package com.naskogeorgiev.homework10092016.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.naskogeorgiev.homework10092016.R;


/**
 * Created by nasko.georgiev on 14.9.2016 г..
 */

public class FragmentCountryInfo extends Fragment{
    TextView tvCountryInfo;
    ICountrySelected mListener;

    public interface ICountrySelected {
        String onCountrySelected();
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mListener = (ICountrySelected) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_country_info, container, false);
        tvCountryInfo = (TextView) view.findViewById(R.id.tv_country_info);

        if(mListener != null)
            tvCountryInfo.setText(mListener.onCountrySelected());

        return view;
    }

}
