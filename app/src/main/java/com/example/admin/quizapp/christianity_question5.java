package com.example.admin.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class christianity_question5 extends AppCompatActivity {
    //Declaring the buttons
    Button conception;
    Button crucifixion;
    Button tomb;
    Button resection;

    TextView scorePoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_christianity_question5);

        // referencing them
        conception = (Button) findViewById(R.id.conception);
        crucifixion = (Button) findViewById(R.id.crucifixion);
        tomb = (Button) findViewById(R.id.tomb);
        resection = (Button) findViewById(R.id.resection) ;
        scorePoint = (TextView) findViewById(R.id.scorePoint) ;

    }


    public void correctAnswer(View view) {

        MainActivity.score += 3;
        tomb.setBackgroundColor(Color.GREEN);

        disableButtons();
        scorePoint.setText(String.valueOf(MainActivity.score));
    }

    public void disableButtons() {

      /* //Setting colors to RED
        conception.setBackgroundColor(Color.RED);
        crucifixion.setBackgroundColor(Color.RED);
        resection.setBackgroundColor(Color.RED);
        */

        //Disabling the wrongs answers
        conception.setEnabled(false);
        crucifixion.setEnabled(false);
        resection.setEnabled(false);

    }

    public void wrong1(View view) {
        disableButtons();

        //Setting colors to RED
        conception.setBackgroundColor(Color.RED);
        crucifixion.setBackgroundColor(Color.RED);
        tomb.setBackgroundColor(Color.GREEN);
        resection.setBackgroundColor(Color.RED);

    }
    public  void movetoQ2(View view){

        Intent intent3 = new Intent(this,scorepoint.class);
        startActivity(intent3);
    }


}


