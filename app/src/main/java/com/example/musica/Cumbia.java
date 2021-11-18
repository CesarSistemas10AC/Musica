package com.example.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Cumbia extends AppCompatActivity {
    ImageButton btncumbia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cumbia);

        btncumbia = findViewById(R.id.imagebtnC);

        btncumbia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Cumbia.this, R.raw.cumbia);
                mp.start();
            }
        });
    }
    public void Mensajecumbia(View view)
    {
        Toast.makeText(this, "Esto suena a cumbia", Toast.LENGTH_SHORT).show();
    }
}