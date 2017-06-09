package com.example.admin.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class christianity_question2 extends AppCompatActivity {

    //Declaring the buttons
    Button acts;
    Button deuteronomy;
    Button revelation;
    Button gospel;

    TextView scorePoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_christianity_question2);

        // referencing them
        acts = (Button) findViewById(R.id.acts);
        deuteronomy = (Button) findViewById(R.id.deuteronomy);
        revelation = (Button) findViewById(R.id.revelation);
        gospel = (Button) findViewById(R.id.gospel) ;
        scorePoint = (TextView) findViewById(R.id.scorePoint) ;

    }


    public void correctAnswer(View view) {

        MainActivity.score += 3;
        revelation.setBackgroundColor(Color.GREEN);

        disableButtons();
        scorePoint.setText(String.valueOf(MainActivity.score));
    }

    public void disableButtons() {

      /* //Setting colors to RED
        acts.setBackgroundColor(Color.RED);
        deuteronomy.setBackgroundColor(Color.RED);
        gospel.setBackgroundColor(Color.RED);
        */

        //Disabling the wrongs answers
        acts.setEnabled(false);
        deuteronomy.setEnabled(false);
        gospel.setEnabled(false);

    }

    public void wrong1(View view) {
        disableButtons();

        //Setting colors to RED
        acts.setBackgroundColor(Color.RED);
        deuteronomy.setBackgroundColor(Color.RED);
        gospel.setBackgroundColor(Color.RED);
        revelation.setBackgroundColor(Color.GREEN);

    }
    public  void movetoQ2(View view){

        Intent intent3 = new Intent(this,christianity_question3.class);
        startActivity(intent3);
    }


}



