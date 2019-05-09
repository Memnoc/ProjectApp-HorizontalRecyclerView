package com.smartdroidesign.horizontalrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> images = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getImages();

    }

    private void getImages() {

        images.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        names.add("Havasu Falls");

        images.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        names.add("Trondheim");

        images.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        names.add("Portugal");

        images.add("https://i.redd.it/j6myfqglup501.jpg");
        names.add("Rocky Mountain National Park");


        images.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        names.add("Mahahual");

        images.add("https://i.redd.it/k98uzl68eh501.jpg");
        names.add("Frozen Lake");


        images.add("https://i.redd.it/glin0nwndo501.jpg");
        names.add("White Sands Desert");

        images.add("https://i.redd.it/obx4zydshg601.jpg");
        names.add("Austrailia");

        images.add("https://i.imgur.com/ZcLLrkY.jpg");
        names.add("Washington");

        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.main_container);
        recyclerView.setHasFixedSize(true);
        Adapter adapter = new Adapter(this, names, images);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
