package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView teamATextView = findViewById(R.id.team_a_score);
        teamATextView.setText(String.valueOf(score));
//        teamATextView.setText("" + score);   // equivalent way to setText() an integer
    }

    public void add_3_points(View view){
        displayForTeamA(3);
    }

    public void add_2_points(View view){
        displayForTeamA(2);
    }

    public void add_1_point(View view){
        displayForTeamA(1);
    }

}
