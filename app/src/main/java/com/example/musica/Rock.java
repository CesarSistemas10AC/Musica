package com.example.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Rock extends AppCompatActivity {

    ImageButton btnrock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);

        btnrock = findViewById(R.id.imagebtnR);

        btnrock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Rock.this, R.raw.rock);
                mp.start();
            }
        });
    }

    public void Mensajerock(View view) {
        Toast.makeText(this, "Esto es Rock", Toast.LENGTH_SHORT).show();
    }
}