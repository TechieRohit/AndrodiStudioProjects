package com.newsapp.rohit.myapplication.datamodel;

/**
 * Created by ROHIT on 6/17/2018.
 * DataModel for News item from news source
 */

public class TvShowsList {

    private String mId;
    private String mImageUrl;
    private String mLikes;

    public TvShowsList(String mId, String mImageUrl, String mLikes) {
        this.mId = mId;
        this.mImageUrl = mImageUrl;
        this.mLikes = mLikes;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public String getmLikes() {
        return mLikes;
    }

    public void setmLikes(String mLikes) {
        this.mLikes = mLikes;
    }
}
