package com.example.nisulo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class grup_band_drum extends AppCompatActivity {

    private ImageButton banner_chain;
    private ImageButton banner_cold;
    private ImageButton banner_maroon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grup_band_drum);

        // ini buat grup band chainsmokers
        banner_chain = (ImageButton) findViewById(R.id.banner_chain);
        banner_chain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openchainsmokers_drum();
            }
        });

        // ini buat grup band coldplay
        banner_cold = (ImageButton) findViewById(R.id.banner_cold);
        banner_cold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencoldplay_drum();
            }
        });

        // ini buat grup band maroon 5
        banner_maroon = (ImageButton) findViewById(R.id.banner_maroon);
        banner_maroon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmaroon_drum();
            }
        });

    }

    //ini buat grupband chainsmokers
    public void openchainsmokers_drum(){
        Intent intent = new Intent(this, chainsmokers_drum.class);
        startActivity(intent);
    }

    //ini buat grupband coldplay
    public void opencoldplay_drum(){
        Intent intent = new Intent(this, coldplay_drum.class);
        startActivity(intent);
    }

    //ini buat grupband maroon 5
    public void openmaroon_drum(){
        Intent intent = new Intent(this, maroon_drum.class);
        startActivity(intent);
    }
}
