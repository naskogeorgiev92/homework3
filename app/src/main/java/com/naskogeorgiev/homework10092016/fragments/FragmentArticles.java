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
import com.naskogeorgiev.homework10092016.R;
import com.naskogeorgiev.homework10092016.activities.TaskOneActivity;
import com.naskogeorgiev.homework10092016.models.Article;

import java.util.ArrayList;

/**
 * Created by nasko.georgiev on 14.9.2016 г..
 */

public class FragmentArticles extends Fragment implements View.OnClickListener {

    private RecyclerView mRecyclerView;
    private ArticlesAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Article> data;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_articles, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_articles_list);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new ArticlesAdapter(data, getActivity());
    }

    @Override
    public void onClick(View v) {

    }
}
