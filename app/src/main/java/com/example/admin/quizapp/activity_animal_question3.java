package com.example.admin.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_animal_question3 extends AppCompatActivity {

    //Declaring the buttons
    Button white;
    Button black;
    Button both;
    Button none;

    TextView scorePoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_question3);

        // referencing them
        white = (Button) findViewById(R.id.white);
        black = (Button) findViewById(R.id.black);
        both = (Button) findViewById(R.id.both);
        none = (Button) findViewById(R.id.none) ;
        scorePoint = (TextView) findViewById(R.id.scorePoint) ;

    }


    public void correctAnswer(View view) {

        MainActivity.score += 3;
        black.setBackgroundColor(Color.GREEN);

        disableButtons();
        scorePoint.setText(String.valueOf(MainActivity.score));
    }

    public void disableButtons() {

      /* //Setting colors to RED
        white.setBackgroundColor(Color.RED);
        none.setBackgroundColor(Color.RED);
        both.setBackgroundColor(Color.RED);
        */

        //Disabling the wrongs answers
        white.setEnabled(false);
        none.setEnabled(false);
        both.setEnabled(false);

    }

    public void wrong1(View view) {
        disableButtons();

        //Setting colors to RED
        white.setBackgroundColor(Color.RED);
        none.setBackgroundColor(Color.RED);
        both.setBackgroundColor(Color.RED);
        black.setBackgroundColor(Color.GREEN);

    }
    public  void movetoQ2(View view){

        Intent intent2 = new Intent(this,activity_animal_question4.class);
        startActivity(intent2);
    }


}







