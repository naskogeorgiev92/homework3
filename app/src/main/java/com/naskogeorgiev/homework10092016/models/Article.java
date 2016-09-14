package com.naskogeorgiev.homework10092016.models;

/**
 * Created by nasko.georgiev on 14.9.2016 г..
 */

public class Article {

    private String mTitle;

    public Article(String mTitle, String mContent) {
        this.mTitle = mTitle;
        this.mContent = mContent;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String mContent) {
        this.mContent = mContent;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    private String mContent;
}
