package com.example.admin.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_animal_question4 extends AppCompatActivity {

    //Declaring the buttons
    Button stork;
    Button swan;
    Button condor;
    Button albatross;

    TextView scorePoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_question4);

        // referencing them
        stork = (Button) findViewById(R.id.stork);
        swan = (Button) findViewById(R.id.swan);
        condor = (Button) findViewById(R.id.condor);
        albatross = (Button) findViewById(R.id.albatross) ;
        scorePoint = (TextView) findViewById(R.id.scorePoint) ;

    }


    public void correctAnswer(View view) {

        MainActivity.score += 3;
        albatross.setBackgroundColor(Color.GREEN);

        disableButtons();
        scorePoint.setText(String.valueOf(MainActivity.score));
    }

    public void disableButtons() {

      /* //Setting colors to RED
        stork.setBackgroundColor(Color.RED);
        swan.setBackgroundColor(Color.RED);
        condor.setBackgroundColor(Color.RED);
        */

        //Disabling the wrongs answers
        stork.setEnabled(false);
        swan.setEnabled(false);
        condor.setEnabled(false);

    }

    public void wrong1(View view) {
        disableButtons();

        //Setting colors to RED
        stork.setBackgroundColor(Color.RED);
        swan.setBackgroundColor(Color.RED);
        condor.setBackgroundColor(Color.RED);
        albatross.setBackgroundColor(Color.GREEN);

    }
    public  void movetoQ2(View view){

        Intent intent2 = new Intent(this,activity_animal_question5.class);
        startActivity(intent2);
    }


}






