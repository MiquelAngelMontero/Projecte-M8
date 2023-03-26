package com.example.projectem8;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Joc extends AppCompatActivity implements View.OnClickListener{

    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA, ansB, ansC, ansD;
    Button submitBtn;
    ImageView imatgeP;

    int score=0;
    int totalQuestion = Resposta.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joc);

        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submitBtn = findViewById(R.id.submit_btn);
        imatgeP = findViewById(R.id.imatgeP);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

        totalQuestionsTextView.setText("Preguntes totals : "+totalQuestion);

        loadNewQuestion();




    }

    @Override
    public void onClick(View view) {

        MediaPlayer mp2 = MediaPlayer.create(this, R.raw.boton);
        mp2.start();

        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);
        ansD.setBackgroundColor(Color.WHITE);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.submit_btn){
            if(selectedAnswer.equals(Resposta.correctAnswers[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();


        }else{
            //choices button clicked
            selectedAnswer  = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.MAGENTA);

        }

    }

    void loadNewQuestion(){

        if(currentQuestionIndex == totalQuestion ){
            finishQuiz();
            return;
        } else if(currentQuestionIndex == 5 || currentQuestionIndex == 6 || currentQuestionIndex == 7) {
            questionTextView.setTextSize(12);
        } else {
            questionTextView.setTextSize(14);
        }

        questionTextView.setText(Resposta.question[currentQuestionIndex]);
        ansA.setText(Resposta.choices[currentQuestionIndex][0]);
        ansB.setText(Resposta.choices[currentQuestionIndex][1]);
        ansC.setText(Resposta.choices[currentQuestionIndex][2]);
        ansD.setText(Resposta.choices[currentQuestionIndex][3]);
        String uri = Resposta.imatge[currentQuestionIndex];  // where myresource (without the extension) is the file

        int imageResource = getResources().getIdentifier(uri, null, getPackageName());

        Drawable res = getResources().getDrawable(imageResource);
        imatgeP.setImageDrawable(res);

    }

    void finishQuiz(){
        String passStatus = "";
        if(score > totalQuestion*0.60){
            passStatus = "Aprovat";
        }else{
            passStatus = "Suspes";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("La teva puntuació és "+ score+" de "+ totalQuestion)
                .setPositiveButton("Tornar a començar",(dialogInterface, i) -> restartQuiz() )
                .setCancelable(false)
                .show();


    }

    void restartQuiz(){
        score = 0;
        currentQuestionIndex =0;
        loadNewQuestion();
    }

}