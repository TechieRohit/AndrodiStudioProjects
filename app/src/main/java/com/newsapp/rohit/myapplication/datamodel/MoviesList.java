package com.newsapp.rohit.myapplication.datamodel;

/**
 * Created by ROHIT on 6/17/2018.
 * DataModel for news source
 */

public class MoviesList {

    private String mId;
    private String mImageUrl;
    private String mLikes;

    public MoviesList(String mId, String mImageUrl, String mLikes) {
        this.mImageUrl = mImageUrl;
        this.mId = mId;
        this.mLikes = mLikes;
    }

    public String getmLikes() {
        return mLikes;
    }

    public void setmLikes(String mLikes) {
        this.mLikes = mLikes;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }
}
