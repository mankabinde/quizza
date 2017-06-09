package com.example.admin.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PhysicalQuestion1 extends AppCompatActivity {


    //Declaring the buttons
    Button viscometer;
    Button nephetometer;
    Button tacheometer;
    Button galvanometer;

    TextView scorePoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phyisical_question1);

        // referencing them
        viscometer = (Button) findViewById(R.id.viscometer);
        nephetometer = (Button) findViewById(R.id.nephetometer);
        tacheometer = (Button) findViewById(R.id.tacheometer);
        galvanometer = (Button) findViewById(R.id.galvanometer) ;
        scorePoint = (TextView) findViewById(R.id.scorePoint) ;

    }


    public void correctAnswer(View view) {

        MainActivity.score += 3;
        galvanometer.setBackgroundColor(Color.GREEN);

        disableButtons();
        scorePoint.setText(String.valueOf(MainActivity.score));
    }

    public void disableButtons() {

      /* //Setting colors to RED
        viscometer.setBackgroundColor(Color.RED);
        nephetometer.setBackgroundColor(Color.RED);
        tacheometer.setBackgroundColor(Color.RED);
        */

        //Disabling the wrongs answers
        viscometer.setEnabled(false);
        nephetometer.setEnabled(false);
        tacheometer.setEnabled(false);

    }

    public void wrong1(View view) {
        disableButtons();

        //Setting colors to RED
        viscometer.setBackgroundColor(Color.RED);
        nephetometer.setBackgroundColor(Color.RED);
        tacheometer.setBackgroundColor(Color.RED);
        galvanometer.setBackgroundColor(Color.GREEN);

    }
    public  void movetoQ2(View view){

        Intent intent1 = new Intent(this,physical_question2.class);
        startActivity(intent1);
    }


}
