package com.example.appxaydungproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class MainActivitySearch extends AppCompatActivity {
    private  ImageView backArrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search);
        anhXa();
        setUpSystem();
    }
    private void anhXa(){
        backArrow = (ImageView) findViewById(R.id.backArrow);
    }
    private void setUpSystem(){
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(MainActivitySearch.this, MainActivity2.class);
                    startActivity(intent);
                    finish();
            }
        });
    }
}