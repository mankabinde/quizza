package com.example.admin.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class physical_question3 extends AppCompatActivity {

    //Declaring the buttons
    Button layer;
    Button magnification;
    Button polaroids;
    Button lead;

    TextView scorePoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical_question3);

        // referencing them
        layer = (Button) findViewById(R.id.layer);
        magnification = (Button) findViewById(R.id.magnification);
        polaroids = (Button) findViewById(R.id.polaroids);
        lead = (Button) findViewById(R.id.lead_glass) ;

        scorePoint = (TextView) findViewById(R.id.scorePoint) ;

    }


    public void correctAnswer(View view) {

        MainActivity.score += 3;
        polaroids.setBackgroundColor(Color.GREEN);

        disableButtons();
        scorePoint.setText(String.valueOf(MainActivity.score));
    }

    public void disableButtons() {

      /* //Setting colors to RED
        layer.setBackgroundColor(Color.RED);
        magnification.setBackgroundColor(Color.RED);
        lead.setBackgroundColor(Color.RED);
        */

        //Disabling the wrongs answers
        layer.setEnabled(false);
        magnification.setEnabled(false);
        lead.setEnabled(false);

    }

    public void wrong1(View view) {
        disableButtons();

        //Setting colors to RED
        layer.setBackgroundColor(Color.RED);
        magnification.setBackgroundColor(Color.RED);
        lead.setBackgroundColor(Color.RED);
        polaroids.setBackgroundColor(Color.GREEN);
    }

    public  void movetoQ4(View view){
        Intent intent1 = new Intent(this,physical_question4.class);
        startActivity(intent1);
    }


}
