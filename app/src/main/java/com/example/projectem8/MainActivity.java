package com.example.projectem8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnHistoria(View view) {
        Intent historia = new Intent(this, Historia_Orgue.class);
        startActivity(historia);

    }

    public void btnJugar(View view) {
        Intent jugar = new Intent(this, Joc.class);
        startActivity(jugar);
    }

}