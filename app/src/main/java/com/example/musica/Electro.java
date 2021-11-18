package com.example.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Electro extends AppCompatActivity {
    ImageButton btnelectro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electro);

        btnelectro = findViewById(R.id.ConstraintLayout);

        btnelectro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Electro.this, R.raw.kygo);
                mp.start();
            }
        });
    }

    public void Mensajeelectro(View view) {
        Toast.makeText(this, "Esto es electro", Toast.LENGTH_SHORT).show();
    }

}