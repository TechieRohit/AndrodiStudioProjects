package com.newsapp.rohit.myapplication.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.newsapp.rohit.myapplication.R;
import com.newsapp.rohit.myapplication.adapter.RecyclerTvShowsAdapter;
import com.newsapp.rohit.myapplication.datamodel.MoviesList;
import com.newsapp.rohit.myapplication.datamodel.TvShowsList;
import com.newsapp.rohit.myapplication.utlis.Constants;
import com.newsapp.rohit.myapplication.volley.VolleySingleton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by ROHIT on 6/17/2018.
 */

public class TvShowsFragment extends Fragment {

    private RecyclerView mRecyclerView;

    private ArrayList<TvShowsList> mArrayList = new ArrayList<>();

    RecyclerTvShowsAdapter movieSource;

    //SwipeRefreshLayout swipeRefreshLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_tv_shows, container, false);


        mRecyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        movieSource = new RecyclerTvShowsAdapter(getActivity(),mArrayList);
        mRecyclerView.setAdapter(movieSource);
        mRecyclerView.setNestedScrollingEnabled(true);

        makeRequest();

        return view;
    }

    /**
     * Making a request to the server for response
     */
    private void makeRequest() {

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, Constants.MOVIES,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        parseResponse(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getActivity(),"Something went wrong !\n" +
                        "Check your internet connection",Toast.LENGTH_LONG).show();

                Log.d("MOVIE_ITEMS", error.toString());
                //swipeRefreshLayout.setRefreshing(false);
            }
        });

        RequestQueue requestQueue = VolleySingleton.getInstance(getActivity()).getRequestQueue();
        requestQueue.add(jsonObjectRequest);
    }

    /**
     * mArrayList carry the data from APIs
     * the data is being assigned using a constructor from the data model of MoviesList
     * here the data is put into an ArrayList and notifyDataSetChanged is called to notify the adapter
     */
    private void parseResponse(JSONObject response) {

        mArrayList.clear();

        try {
            JSONArray jsonArray = response.getJSONArray("movieposter");

            int x = 0;

            while ( x!=2  ) {
                for (int i = 0; i<jsonArray.length(); i++) {
                    JSONObject arrayObj = jsonArray.getJSONObject(i);


                    String sourceId = arrayObj.getString("id");
                    String sourceLikes = arrayObj.getString("likes");
                    String urlToImage = arrayObj.getString("url");

                    mArrayList.add(new TvShowsList(sourceId,urlToImage,sourceLikes));
                }
                x++;
            }


        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(getActivity(),"" + e.toString(),Toast.LENGTH_LONG).show();
        }

        //Notifying the adapter that the data has been changed
        movieSource.notifyDataSetChanged();
        //swipeRefreshLayout.setRefreshing(false);
    }

}
