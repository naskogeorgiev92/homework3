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
import com.naskogeorgiev.homework10092016.interfaces.IPopulateArticleInfo;
import com.naskogeorgiev.homework10092016.models.Article;

/**
 * Created by nasko.georgiev on 15.9.2016 г..
 */

public class FragmentArticleInfo extends Fragment {

    TextView tvTitleInfo, tvContentInfo;
    IPopulateArticleInfo mListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_article_info, container, false);
        tvTitleInfo = (TextView) view.findViewById(R.id.tv_title_info);
        tvContentInfo = (TextView) view.findViewById(R.id.tv_content_info);


        tvTitleInfo.setText(mListener.populateArticle().getTitle());
        tvContentInfo.setText(mListener.populateArticle().getContent());
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mListener = (IPopulateArticleInfo) getActivity();
    }

    public void updateArticle(Article article){
        tvTitleInfo.setText(mListener.populateArticle().getTitle());
        tvContentInfo.setText(mListener.populateArticle().getContent());
    }
}
