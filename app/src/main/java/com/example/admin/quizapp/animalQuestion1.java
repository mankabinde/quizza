package com.example.admin.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class animalQuestion1 extends AppCompatActivity {

    //Declaring the buttons
    Button Crustacean;
    Button Arachnid;
    Button Fish;
    Button Shell;

    TextView scorePoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_question1);

        // referencing them
        Crustacean = (Button) findViewById(R.id.Crustacean);
        Arachnid = (Button) findViewById(R.id.Arachnid);
        Fish = (Button) findViewById(R.id.Fish);
        Shell = (Button) findViewById(R.id.Shell) ;
        scorePoint = (TextView) findViewById(R.id.scorePoint) ;

    }


    public void correctAnswer(View view) {

        MainActivity.score += 3;
        Fish.setBackgroundColor(Color.GREEN);

        disableButtons();
        scorePoint.setText(String.valueOf(MainActivity.score));
    }

    public void disableButtons() {

      /* //Setting colors to RED
        Crustacean.setBackgroundColor(Color.RED);
        Arachnid.setBackgroundColor(Color.RED);
        Shell.setBackgroundColor(Color.RED);
        */

        //Disabling the wrongs answers
        Crustacean.setEnabled(false);
        Arachnid.setEnabled(false);
        Shell.setEnabled(false);

    }

    public void wrong1(View view) {
        disableButtons();

        //Setting colors to RED
        Crustacean.setBackgroundColor(Color.RED);
        Arachnid.setBackgroundColor(Color.RED);
        Fish.setBackgroundColor(Color.GREEN);
        Shell.setBackgroundColor(Color.RED);

    }
    public  void movetoQ2(View view){

        Intent intent2 = new Intent(this,activity_animal_question2.class);
        startActivity(intent2);
    }


}





