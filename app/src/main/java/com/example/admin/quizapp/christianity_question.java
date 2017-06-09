package com.example.admin.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class christianity_question extends AppCompatActivity {

    //Declaring the buttons
    Button hebrew;
    Button testaments;
    Button old;
    Button torah;

    TextView scorePoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_christianity_question1);

        // referencing them
        hebrew = (Button) findViewById(R.id.hebrew);
        testaments = (Button) findViewById(R.id.testaments);
        old = (Button) findViewById(R.id.old);
        torah = (Button) findViewById(R.id.torah) ;
        scorePoint = (TextView) findViewById(R.id.scorePoint) ;

    }


    public void correctAnswer(View view) {

        MainActivity.score  += 3;
        torah.setBackgroundColor(Color.GREEN);

        disableButtons();
        scorePoint.setText(String.valueOf(MainActivity.score));
    }

    public void disableButtons() {

      /* //Setting colors to RED
        hebrew.setBackgroundColor(Color.RED);
        testaments.setBackgroundColor(Color.RED);
        old.setBackgroundColor(Color.RED);
        */

        //Disabling the wrongs answers
        hebrew.setEnabled(false);
        testaments.setEnabled(false);
        old.setEnabled(false);

    }

    public void wrong1(View view) {
        disableButtons();

        //Setting colors to RED
        hebrew.setBackgroundColor(Color.RED);
        testaments.setBackgroundColor(Color.RED);
        old.setBackgroundColor(Color.RED);
        torah.setBackgroundColor(Color.GREEN);

    }
    public  void movetoQ2(View view){

        Intent intent3 = new Intent(this,christianity_question2.class);
        startActivity(intent3);
    }


}




