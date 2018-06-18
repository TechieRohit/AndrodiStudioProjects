package com.newsapp.rohit.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.bumptech.glide.Glide;
import com.newsapp.rohit.myapplication.R;
import com.newsapp.rohit.myapplication.datamodel.MoviesList;

import java.util.ArrayList;

/**
 * Created by ROHIT on 6/17/2018.
 */

public class RecyclerMovieAdapter extends RecyclerView.Adapter<RecyclerMovieAdapter.RecyclerMovies> {

    private Context mContext;
    private ArrayList<MoviesList> movieList = new ArrayList<>();

    public RecyclerMovieAdapter(Context mContext, ArrayList<MoviesList> moviesLists) {
        this.mContext = mContext;
        this.movieList = moviesLists;
    }

    /**
     * Returns total size of items in recyclerview
     * @return
     */
    @Override
    public int getItemCount() {
        return movieList.size();
    }

    /**
     * Used for creating the view
     * we can also return different view types by using parameter viewType
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public RecyclerMovies onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_movies,parent,false);
        RecyclerMovies news = new RecyclerMovies(view);
        return news;
    }

    /**
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull RecyclerMovies holder, int position) {
        Glide.with(mContext).load(movieList.get(position).getmImageUrl()).
                placeholder(R.drawable.popcorn_time_placeholder).into(holder.imageView);
    }

    class RecyclerMovies extends RecyclerView.ViewHolder {

        ImageView imageView;

        public RecyclerMovies(View itemView) {
            super(itemView);

            imageView = (ImageView)itemView.findViewById(R.id.imageView);

        }
    }
}
