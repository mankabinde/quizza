package com.example.admin.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class physical_question4 extends AppCompatActivity {
    //Declaring the buttons
    Button pressure;
    Button normal;
    Button boiling;
    Button cooker;

    TextView scorePoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical_question4);

        // referencing them
        pressure = (Button) findViewById(R.id.pressure);
        normal = (Button) findViewById(R.id.normal);
        boiling = (Button) findViewById(R.id.boiling);
        cooker = (Button) findViewById(R.id.cooker) ;


        scorePoint = (TextView) findViewById(R.id.scorePoint) ;

    }


    public void correctAnswer(View view) {

        MainActivity.score +=3;
        boiling.setBackgroundColor(Color.GREEN);

        disableButtons();
        scorePoint.setText(String.valueOf(MainActivity.score));
    }

    public void disableButtons() {

      /* //Setting colors to RED
        pressure.setBackgroundColor(Color.RED);
        normal.setBackgroundColor(Color.RED);
        boiling.setBackgroundColor(Color.RED);
        */

        //Disabling the wrongs answers
        pressure.setEnabled(false);
        normal.setEnabled(false);
        boiling.setEnabled(false);

    }

    public void wrong1(View view) {
        disableButtons();

        //Setting colors to RED
        pressure.setBackgroundColor(Color.RED);
        normal.setBackgroundColor(Color.RED);
        boiling.setBackgroundColor(Color.GREEN);
        cooker.setBackgroundColor(Color.RED);

    }
    public  void movetoQ5(View view){

        Intent intent1= new Intent(this,physical_question5.class);
        startActivity(intent1);
    }


}

