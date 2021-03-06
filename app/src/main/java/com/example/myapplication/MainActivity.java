package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private DummyContent content = new DummyContent();
    private RViewAdapter rViewAdapter = new RViewAdapter(this, content.ITEMS);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rView = findViewById(R.id.List);
        rView.setLayoutManager(new LinearLayoutManager(this));
        rView.setAdapter(rViewAdapter);
    }
}