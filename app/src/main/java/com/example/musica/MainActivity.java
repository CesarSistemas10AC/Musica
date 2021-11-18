package com.example.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button audioelectro, audiosalsa,audiorock, audiocumbia, audiohuayno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audioelectro = findViewById(R.id.btnelectro);
        audiocumbia = findViewById(R.id.btnCumbia);
        audiohuayno = findViewById(R.id.btnhuayno);
        audiorock = findViewById(R.id.btnRock);
        audiosalsa = findViewById(R.id.btnsalsa);

        audioelectro.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                LlamarAudio();
            }
        });

        audiorock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                LlamarAudio1();
            }
        });

        audiosalsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                LlamarAudio2();
            }
        });

        audiocumbia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                LlamarAudio3();
            }
        });

        audiohuayno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                LlamarAudio4();
            }
        });
    }
    private void LlamarAudio()
    {
        Intent intent = new Intent(MainActivity.this, Electro.class);
        startActivity(intent);
    }
    private void LlamarAudio1()
    {
        Intent intent = new Intent(MainActivity.this, Rock.class);
        startActivity(intent);
    }
    private void LlamarAudio2()
    {
        Intent intent = new Intent(MainActivity.this, Huayno.class);
        startActivity(intent);
    }
    private void LlamarAudio3()
    {
        Intent intent = new Intent(MainActivity.this, Salsa.class);
        startActivity(intent);
    }
    private void LlamarAudio4()
    {
        Intent intent = new Intent(MainActivity.this, Cumbia.class);
        startActivity(intent);
    }
}
