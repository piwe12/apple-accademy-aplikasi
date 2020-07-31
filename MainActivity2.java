package com.example.nisulo4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    private ImageButton gitarButton;
    private ImageButton pianoButton;
    private ImageButton biolaButton;
    private ImageButton drumButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //ini buat gitar button
        gitarButton = (ImageButton) findViewById(R.id.gitarButton);
        gitarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengrup_band_gitar();
            }
        });

        //ini buat piano button
        pianoButton = (ImageButton) findViewById(R.id.pianoButton);
        pianoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengrup_band_piano();
            }
        });

        //ini buat biola button
        biolaButton = (ImageButton) findViewById(R.id.biolaButton);
        biolaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengrup_band_biola();
            }
        });

        //ini buat drum button
        drumButton = (ImageButton) findViewById(R.id.drumButton);
        drumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengrup_band_drum();
            }
        });


        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.bar_top));
        }
    }

    //gitar
    public void opengrup_band_gitar(){
        Intent intent = new Intent(this, grup_band_gitar.class);
        startActivity(intent);
    }

    //piano
    public void opengrup_band_piano(){
        Intent intent2 = new Intent(this, grup_band_piano.class);
        startActivity(intent2);
    }

    //biola
    public void opengrup_band_biola(){
        Intent intent3 = new Intent(this, grup_band_biola.class);
        startActivity(intent3);
    }

    //drum
    public void opengrup_band_drum(){
        Intent intent4 = new Intent(this, grup_band_drum.class);
        startActivity(intent4);
    }
}
