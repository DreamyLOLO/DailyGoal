package com.example.dailygoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DailyGoals2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_goals2);

        Intent i = getIntent();
        String[] info = i.getStringArrayExtra("info");
        TextView tv1 = findViewById(R.id.textView7);
        tv1.setText("Read up on materials before class: " + info[0] + "\nArrive on time so as not to miss important part of lesson: " + info[1] + "\nAttempt the problem myself: " + info[2] + "\nReflection: " + info[3]);
    }
}
