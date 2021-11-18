package com.example.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Huayno extends AppCompatActivity {

    ImageButton btnhuayno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huayno);

        btnhuayno = findViewById(R.id.imagebtnH);

        btnhuayno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Huayno.this, R.raw.blackbeatles);
                mp.start();
            }
        });
    }

    public void Mensajehuayno(View view) {
        Toast.makeText(this, "Esto es huayno", Toast.LENGTH_SHORT).show();
    }
}