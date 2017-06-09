package com.example.admin.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_animal_question5 extends AppCompatActivity {

    //Declaring the buttons
    Button birds;
    Button cats;
    Button dogs;
    Button horses;

    TextView scorePoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_question5);

        // referencing them
        birds = (Button) findViewById(R.id.birds);
        cats = (Button) findViewById(R.id.cats);
        dogs = (Button) findViewById(R.id.dogs);
        horses = (Button) findViewById(R.id.horses) ;
        scorePoint = (TextView) findViewById(R.id.scorePoint) ;

    }


    public void correctAnswer(View view) {

        MainActivity.score += 3;
        dogs.setBackgroundColor(Color.GREEN);

        disableButtons();
        scorePoint.setText(String.valueOf(MainActivity.score));
    }

    public void disableButtons() {

      /* //Setting colors to RED
        birds.setBackgroundColor(Color.RED);
        cats.setBackgroundColor(Color.RED);
        horses.setBackgroundColor(Color.RED);
        */

        //Disabling the wrongs answers
        birds.setEnabled(false);
        cats.setEnabled(false);
        horses.setEnabled(false);

    }

    public void wrong1(View view) {
        disableButtons();

        //Setting colors to RED
        birds.setBackgroundColor(Color.RED);
        cats.setBackgroundColor(Color.RED);
        horses.setBackgroundColor(Color.RED);
        dogs.setBackgroundColor(Color.GREEN);

    }
    public  void movetoQ2(View view){

        Intent intent2 = new Intent(this,scorepoint.class);
        startActivity(intent2);
    }


}





