package com.example.admin.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class christianity_question4 extends AppCompatActivity {

    //Declaring the buttons
    Button acts;
    Button deuteronomy;
    Button revelation;
    Button epistles;

    TextView scorePoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_christianity_question4);

        // referencing them
        acts = (Button) findViewById(R.id.acts);
        deuteronomy = (Button) findViewById(R.id.deuteronomy);
        revelation = (Button) findViewById(R.id.revelation);
        epistles = (Button) findViewById(R.id.epistles) ;
        scorePoint = (TextView) findViewById(R.id.scorePoint) ;

    }


    public void correctAnswer(View view) {

        MainActivity.score += 3;
        acts.setBackgroundColor(Color.GREEN);

        disableButtons();
        scorePoint.setText(String.valueOf(MainActivity.score));
    }

    public void disableButtons() {

      /* //Setting colors to RED
        epistles.setBackgroundColor(Color.RED);
        deuteronomy.setBackgroundColor(Color.RED);
        revelation.setBackgroundColor(Color.RED);
        */

        //Disabling the wrongs answers
        epistles.setEnabled(false);
        deuteronomy.setEnabled(false);
        revelation.setEnabled(false);

    }

    public void wrong1(View view) {
        disableButtons();

        //Setting colors to RED
        epistles.setBackgroundColor(Color.RED);
        deuteronomy.setBackgroundColor(Color.RED);
        revelation.setBackgroundColor(Color.RED);
        acts.setBackgroundColor(Color.GREEN);

    }
    public  void movetoQ2(View view){

        Intent intent3 = new Intent(this,christianity_question5.class);
        startActivity(intent3);
    }


}


