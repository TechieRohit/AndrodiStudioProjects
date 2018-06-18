package com.newsapp.rohit.myapplication.volley;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by ROHIT on 6/16/2018.
 */
public class VolleySingleton {

    private RequestQueue requestQueue;
    private static Context mcontext;
    private static VolleySingleton mInstance;

    public VolleySingleton(Context context) {
        mcontext = context;
        requestQueue = getRequestQueue();
    }

    public RequestQueue getRequestQueue() {

        if (requestQueue == null)
        {
            requestQueue = Volley.newRequestQueue(mcontext.getApplicationContext());
        }
        return requestQueue;
    }

    public static VolleySingleton getInstance(Context context)
    {
        if (mInstance == null)
        {
            mInstance = new VolleySingleton(context);
        }

        return mInstance;
    }

}
