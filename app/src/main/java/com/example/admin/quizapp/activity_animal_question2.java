package com.example.admin.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_animal_question2 extends AppCompatActivity {

    //Declaring the buttons
    Button Dachshund;
    Button poodle;
    Button chihuahua;
    Button pomeraniam;

    TextView scorePoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_question2);

        // referencing them
        Dachshund = (Button) findViewById(R.id.Dachshund);
        poodle = (Button) findViewById(R.id.poodle);
        chihuahua = (Button) findViewById(R.id.chihuahua);
        pomeraniam = (Button) findViewById(R.id.pomeraniam) ;
        scorePoint = (TextView) findViewById(R.id.scorePoint) ;

    }


    public void correctAnswer(View view) {

        MainActivity.score += 3;
        chihuahua.setBackgroundColor(Color.GREEN);

        disableButtons();
        scorePoint.setText(String.valueOf(MainActivity.score));
    }

    public void disableButtons() {

      /* //Setting colors to RED
        Dachshund.setBackgroundColor(Color.RED);
        poodle.setBackgroundColor(Color.RED);
        pomeraniam.setBackgroundColor(Color.RED);
        */

        //Disabling the wrongs answers
        Dachshund.setEnabled(false);
        poodle.setEnabled(false);
        pomeraniam.setEnabled(false);

    }

    public void wrong1(View view) {
        disableButtons();

        //Setting colors to RED
        Dachshund.setBackgroundColor(Color.RED);
        poodle.setBackgroundColor(Color.RED);
        chihuahua.setBackgroundColor(Color.GREEN);
        pomeraniam.setBackgroundColor(Color.RED);

    }
    public  void movetoQ2(View view){

        Intent intent2 = new Intent(this,activity_animal_question3.class);
        startActivity(intent2);
    }


}









