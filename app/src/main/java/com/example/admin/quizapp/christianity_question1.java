package com.example.admin.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class christianity_question1 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_christianity_question1);

    }

    public void correctAnswer(View view){
        MainActivity.score += 3;
        movetoQ2(view);
    }

    public  void movetoQ2(View view){
        Intent intent1 = new Intent(this,christianity_question2.class);
        startActivity(intent1);
    }



}
