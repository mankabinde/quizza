package com.example.admin.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class physical_question5 extends AppCompatActivity {

    //Declaring the buttons
    Button iron;
    Button tungsten;
    Button copper;
    Button zinc;

    TextView scorePoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phyical_question5);

        // referencing them
        iron = (Button) findViewById(R.id.iron);
        tungsten = (Button) findViewById(R.id.tungsten);
        copper = (Button) findViewById(R.id.copper);
        zinc = (Button) findViewById(R.id.zinc) ;
        scorePoint = (TextView) findViewById(R.id.scorePoint) ;

    }


    public void correctAnswer(View view) {

        MainActivity.score +=3;
        tungsten.setBackgroundColor(Color.GREEN);

        disableButtons();
        scorePoint.setText(String.valueOf(MainActivity.score));
    }

    public void disableButtons() {

      /* //Setting colors to RED
        iron.setBackgroundColor(Color.RED);
        zinc.setBackgroundColor(Color.RED);
        copper.setBackgroundColor(Color.RED);
        */

        //Disabling the wrongs answers
        iron.setEnabled(false);
        zinc.setEnabled(false);
        copper.setEnabled(false);

    }

    public void wrong1(View view) {
        disableButtons();

        //Setting colors to RED
        iron.setBackgroundColor(Color.RED);
        tungsten.setBackgroundColor(Color.GREEN);
        copper.setBackgroundColor(Color.RED);
        zinc.setBackgroundColor(Color.RED);

    }

    public void movetoScorePoint(View view) {
        Intent intent = new Intent(this,scorepoint.class);
        startActivity(intent);
    }


}

