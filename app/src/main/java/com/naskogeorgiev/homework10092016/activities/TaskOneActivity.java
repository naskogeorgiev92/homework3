package com.naskogeorgiev.homework10092016.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.naskogeorgiev.homework10092016.ArticlesAdapter;
import com.naskogeorgiev.homework10092016.IArticleSelected;
import com.naskogeorgiev.homework10092016.R;
import com.naskogeorgiev.homework10092016.models.Article;

import java.util.ArrayList;

public class TaskOneActivity extends AppCompatActivity implements IArticleSelected{




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_one);



    }

    @Override
    public void onItemSelected(int position) {

    }
}
