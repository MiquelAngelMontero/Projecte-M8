package com.example.projectem8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Joc extends AppCompatActivity {

    TextView pregunta;
    Button[] resposta = new Button[4];
    String[] preguntes = new String[13];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joc);
        Resources res = getResources();

        preguntes = res.getStringArray(R.array.array_preguntas);

        pregunta = findViewById(R.id.pregunta);
        resposta[0] = findViewById(R.id.respuesta1);
        resposta[1] = (Button)findViewById(R.id.respuesta2);
        resposta[2] = (Button)findViewById(R.id.respuesta3);
        resposta[3] = (Button)findViewById(R.id.respuesta4);

        pregunta.setText(preguntes[0]);

    }
}