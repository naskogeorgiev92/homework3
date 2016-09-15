package com.naskogeorgiev.homework10092016.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.naskogeorgiev.homework10092016.ArticlesAdapter;
import com.naskogeorgiev.homework10092016.DividerDecoration;
import com.naskogeorgiev.homework10092016.interfaces.IArticleSelected;
import com.naskogeorgiev.homework10092016.R;
import com.naskogeorgiev.homework10092016.interfaces.IPopulateArticles;

/**
 * Created by nasko.georgiev on 14.9.2016 г..
 */

public class FragmentArticles extends Fragment{

    private RecyclerView mRecyclerView;
    private ArticlesAdapter mAdapter;
    private IPopulateArticles mListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_articles, container, false);

        mListener = (IPopulateArticles) getActivity();

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_articles_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new ArticlesAdapter(mListener.getArticles(), (IArticleSelected)getActivity());
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addItemDecoration(new DividerDecoration(getContext()));

        return view;
    }
}
