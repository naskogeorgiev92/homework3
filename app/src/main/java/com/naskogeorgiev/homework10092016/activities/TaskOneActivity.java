package com.naskogeorgiev.homework10092016.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.naskogeorgiev.homework10092016.fragments.FragmentArticleInfo;
import com.naskogeorgiev.homework10092016.interfaces.IArticleSelected;
import com.naskogeorgiev.homework10092016.R;
import com.naskogeorgiev.homework10092016.interfaces.IPopulateArticleInfo;
import com.naskogeorgiev.homework10092016.models.Article;
import com.naskogeorgiev.homework10092016.interfaces.IPopulateArticles;

import java.util.ArrayList;

public class TaskOneActivity extends AppCompatActivity implements IArticleSelected, IPopulateArticles, IPopulateArticleInfo {

    private ArrayList<Article> data;
    private Article currentArticle;
    private FragmentArticleInfo fragmentArticleInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        data = new ArrayList<>();
        generateData();
        setContentView(R.layout.activity_task_one);
        fragmentArticleInfo = (FragmentArticleInfo) getSupportFragmentManager().findFragmentById(R.id.fragment_article_info);
    }

    void generateData() {
        data.add(new Article("Над 700 хиляди деца влизат в класните стаи",
                "66 611 деца тръгват за първи път на училище днес. През миналата година първокласниците са били 67 503. \n" +
                        "Броят на учениците от 1 до 12 клас през новата учебна година ще е 719 405, по прогнозни данни на регионалните управления по образование. През миналата година в дневна форма на обучение са били включени 718 370 ученици. "));
        data.add(new Article("850 лева данък за всяко такси в София догодина",
                "850 лева годишен данък за всяко такси ще плащат превозвачите в София. \n" +
                        "Това предвижда промяна в Наредбата за местните данъци и такси в столицата, след като през април влезе в сила новият данък върху таксиметров превоз на пътници. Всяка община трябва да определи сама размера му между 300 и 900 лева всяка година до 30 октомври. За тази година обаче този срок е 30 септември."));
    }

    @Override
    public void onItemSelected(int position) {
        currentArticle = data.get(position);
        fragmentArticleInfo.updateArticle(currentArticle);
    }

    @Override
    public ArrayList<Article> getArticles() {
        return data;
    }

    @Override
    public Article populateArticle() {
        if (currentArticle != null)
            return currentArticle;
        else
            return data.get(0);
    }
}
