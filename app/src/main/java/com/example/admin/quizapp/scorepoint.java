package com.example.admin.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class scorepoint extends AppCompatActivity {


    TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorepoint);

        textView= (TextView) findViewById(R.id.point);



        double per = ((MainActivity.score/15.0)*100);


        textView.setText(" "+(int)per + "%");

    }

    public void score (View view){
        Intent intent1 = new Intent(this,MainActivity.class);
        startActivity(intent1);

    }




}
