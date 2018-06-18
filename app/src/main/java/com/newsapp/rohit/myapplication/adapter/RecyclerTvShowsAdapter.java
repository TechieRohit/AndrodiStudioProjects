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
import com.newsapp.rohit.myapplication.datamodel.TvShowsList;

import java.util.ArrayList;

/**
 * Created by ROHIT on 6/17/2018.
 */

public class RecyclerTvShowsAdapter extends RecyclerView.Adapter<RecyclerTvShowsAdapter.RecyclerTvShows> {

    private Context mContext;

    private ArrayList<TvShowsList> showList = new ArrayList<>();

    public RecyclerTvShowsAdapter(Context mContext, ArrayList<TvShowsList> showLists) {
        this.mContext = mContext;
        this.showList = showLists;
    }


    /**
     * Returns total size of items in recyclerview
     * @return
     */
    @Override
    public int getItemCount() {
        return showList.size();
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
    public RecyclerTvShows onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_movies,parent,false);
        RecyclerTvShows news = new RecyclerTvShows(view);
        return news;
    }

    /**
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull RecyclerTvShows holder, int position) {
        Glide.with(mContext).load(showList.get(position).getmImageUrl()).
                placeholder(R.drawable.popcorn_time_placeholder).into(holder.imageView);
    }

    class RecyclerTvShows extends RecyclerView.ViewHolder {

        ImageView imageView;

        public RecyclerTvShows(View itemView) {
            super(itemView);

            imageView = (ImageView)itemView.findViewById(R.id.imageView);

        }
    }
}
