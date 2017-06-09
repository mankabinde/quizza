package com.example.admin.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class physical_question2 extends AppCompatActivity {

    //Declaring the buttons
    Button distance;
    Button temperature;
    Button speed;
    Button capacitance;

    TextView scorePoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical_question2);

        // referencing them
        distance = (Button) findViewById(R.id.distance);
        temperature = (Button) findViewById(R.id.temperature);
        speed = (Button) findViewById(R.id.speed) ;
        capacitance = (Button) findViewById(R.id.capacitance);
        scorePoint = (TextView) findViewById(R.id.scorePoint) ;

    }


    public void correctAnswer(View view) {

        MainActivity.score +=3;
        capacitance.setBackgroundColor(Color.GREEN);

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
        distance.setEnabled(false);
        temperature.setEnabled(false);
        speed.setEnabled(false);

    }

    public void wrong1(View view) {
        disableButtons();

        //Setting colors to RED
        distance.setBackgroundColor(Color.RED);
        temperature.setBackgroundColor(Color.RED);
        speed.setBackgroundColor(Color.RED);

        capacitance.setBackgroundColor(Color.GREEN);

    }
    public  void movetoQ3(View view){

        Intent intent = new Intent(this,physical_question3.class);
        startActivity(intent);
    }


}
