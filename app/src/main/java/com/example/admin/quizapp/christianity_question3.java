package com.example.admin.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class christianity_question3 extends AppCompatActivity {

    //Declaring the buttons
    Button four;
    Button book;
    Button epistles;
    Button old;

    TextView scorePoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_christianity_question3);

        // referencing them
        four = (Button) findViewById(R.id.four);
        book = (Button) findViewById(R.id.book);
        epistles = (Button) findViewById(R.id.epistles);
        old = (Button) findViewById(R.id.old) ;
        scorePoint = (TextView) findViewById(R.id.scorePoint) ;

    }


    public void correctAnswer(View view) {

        MainActivity.score += 3;
        epistles.setBackgroundColor(Color.GREEN);

        disableButtons();
        scorePoint.setText(String.valueOf(MainActivity.score));
    }

    public void disableButtons() {

      /* //Setting colors to RED
        four.setBackgroundColor(Color.RED);
        book.setBackgroundColor(Color.RED);
        old.setBackgroundColor(Color.RED);
        */

        //Disabling the wrongs answers
        four.setEnabled(false);
        book.setEnabled(false);
        old.setEnabled(false);

    }

    public void wrong1(View view) {
        disableButtons();

        //Setting colors to RED
        four.setBackgroundColor(Color.RED);
        book.setBackgroundColor(Color.RED);
        epistles.setBackgroundColor(Color.GREEN);
        old.setBackgroundColor(Color.RED);

    }
    public  void movetoQ2(View view){

        Intent intent3 = new Intent(this,christianity_question4.class);
        startActivity(intent3);
    }


}


