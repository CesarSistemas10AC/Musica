package com.example.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Salsa extends AppCompatActivity {

    ImageButton btnsalsa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salsa);

        btnsalsa = findViewById(R.id.imagebtnS);

        btnsalsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Salsa.this, R.raw.salsa);
                mp.start();
            }
        });
    }

    public void Mensajesalsa(View view) {
        Toast.makeText(this, "Esto es salsa", Toast.LENGTH_SHORT).show();
    }
}