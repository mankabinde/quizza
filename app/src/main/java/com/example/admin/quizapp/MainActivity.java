package com.example.admin.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

   public static int  score =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void physcialScience(View view)
    {
        Intent intent1 = new Intent(this,physical_question1.class);
        startActivity(intent1);
    }



    public void animals(View view)
    {
        Intent intent2 = new Intent(this,animalQuestion1.class);
        startActivity(intent2);
    }

    public void Christianity(View view)
    {
        Intent intent3 = new Intent(this,christianity_question1.class);
        startActivity(intent3);
    }


}
