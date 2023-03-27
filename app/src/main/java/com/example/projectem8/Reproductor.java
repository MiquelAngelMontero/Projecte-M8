package com.example.projectem8;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reproductor extends AppCompatActivity {
    MediaPlayer mp2;
    public int length=0, contador=1;
    Button pausar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);

        mp2 = MediaPlayer.create(this, R.raw.orgue1);
        mp2.start();

        pausar = findViewById(R.id.pausar);
    }

    public void reproduirPausar(View view) {
        if(mp2.isPlaying()) {
            mp2.pause();
            length=mp2.getCurrentPosition();
            pausar.setText("Reproduir");

        }else {
            mp2.start();
            mp2.seekTo(length);
            pausar.setText("Pausar");
        }
    }

    public void seguent(View view) {
        mp2.stop();
        if(contador==1) {
            mp2 = MediaPlayer.create(this, R.raw.orgue2);
            contador=2;
        } else {
            mp2 = MediaPlayer.create(this, R.raw.orgue1);
            contador=1;
        }
        mp2.start();
    }
}