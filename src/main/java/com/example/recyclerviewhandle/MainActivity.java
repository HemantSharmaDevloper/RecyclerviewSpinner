package com.example.recyclerviewhandle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public List<Profile> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ProfileAdapter mAdapter;
    String[] editTextArr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new ProfileAdapter(MainActivity.this, movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Profile movie = new Profile("Mad Max: Fury Road", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Profile("Inside Out", "Animation, Kids & Family", "2015");
        movieList.add(movie);

        movie = new Profile("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);

        movie = new Profile("Shaun the Sheep", "Animation", "2015");
        movieList.add(movie);

        movie = new Profile("The Martian", "Science Fiction & Fantasy", "2015");
        movieList.add(movie);

        movie = new Profile("Mission: Impossible Rogue Nation", "Action", "2015");
        movieList.add(movie);

        movie = new Profile("Up", "Animation", "2009");
        movieList.add(movie);

        movie = new Profile("Star Trek", "Science Fiction", "2009");
        movieList.add(movie);


        mAdapter.notifyDataSetChanged();
    }
}