package com.example.projectem8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Joc extends AppCompatActivity {

    TextView pregunta;
    Button[] resposta = new Button[4];
    String[] preguntes;
    String[] correctes;
    Pregunta[] aPreg = new Pregunta[13];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joc);

        Resources res = getResources();

        preguntes = res.getStringArray(R.array.array_preguntas);
        correctes = res.getStringArray(R.array.correctes);

        int cont = 0;
        aPreg[0] = new Pregunta(preguntes[0], correctes[0], res.getStringArray(R.array.respostes1));
        aPreg[1] = new Pregunta(preguntes[1], correctes[1], res.getStringArray(R.array.respostes2));
        aPreg[2] = new Pregunta(preguntes[2], correctes[2], res.getStringArray(R.array.respostes3));
        aPreg[3] = new Pregunta(preguntes[3], correctes[3], res.getStringArray(R.array.respostes4));
        aPreg[4] = new Pregunta(preguntes[4], correctes[4], res.getStringArray(R.array.respostes5));
        aPreg[5] = new Pregunta(preguntes[5], correctes[5], res.getStringArray(R.array.respostes6));
        aPreg[6] = new Pregunta(preguntes[6], correctes[6], res.getStringArray(R.array.respostes7));
        aPreg[7] = new Pregunta(preguntes[7], correctes[7], res.getStringArray(R.array.respostes8));
        aPreg[8] = new Pregunta(preguntes[8], correctes[8], res.getStringArray(R.array.respostes9));
        aPreg[9] = new Pregunta(preguntes[9], correctes[9], res.getStringArray(R.array.respostes10));
        aPreg[10] = new Pregunta(preguntes[10], correctes[10], res.getStringArray(R.array.respostes11));
        aPreg[11] = new Pregunta(preguntes[11], correctes[11], res.getStringArray(R.array.respostes12));
        aPreg[12] = new Pregunta(preguntes[12], correctes[12], res.getStringArray(R.array.respostes13));

        pregunta = findViewById(R.id.pregunta);
        resposta[0] = findViewById(R.id.respuesta1);
        resposta[1] = findViewById(R.id.respuesta2);
        resposta[2] = findViewById(R.id.respuesta3);
        resposta[3] = findViewById(R.id.respuesta4);

        while (cont != preguntes.length) {
            int random = (int) (Math.random()*3+0);

            pregunta.setText(aPreg[cont].getPregunta());

            switch (random) {
                case 0:
                    resposta[0].setText(aPreg[cont].getRespostes()[0]);
                    resposta[1].setText(aPreg[cont].getRespostes()[1]);
                    resposta[2].setText(aPreg[cont].getRespostes()[2]);
                    resposta[3].setText(aPreg[cont].getRespostes()[3]);
                    break;
                case 1:
                    resposta[0].setText(aPreg[cont].getRespostes()[1]);
                    resposta[1].setText(aPreg[cont].getRespostes()[2]);
                    resposta[2].setText(aPreg[cont].getRespostes()[3]);
                    resposta[3].setText(aPreg[cont].getRespostes()[0]);
                    break;
                case 2:
                    resposta[0].setText(aPreg[cont].getRespostes()[2]);
                    resposta[1].setText(aPreg[cont].getRespostes()[3]);
                    resposta[2].setText(aPreg[cont].getRespostes()[0]);
                    resposta[3].setText(aPreg[cont].getRespostes()[1]);
                    break;
                case 3:
                    resposta[0].setText(aPreg[cont].getRespostes()[3]);
                    resposta[1].setText(aPreg[cont].getRespostes()[0]);
                    resposta[2].setText(aPreg[cont].getRespostes()[1]);
                    resposta[3].setText(aPreg[cont].getRespostes()[2]);
                    break;
            }

            /*if() {

            }*/
        }

    }
}