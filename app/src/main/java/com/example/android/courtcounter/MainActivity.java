package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Track the score for two teams.
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
    * Increase the score for Team A by 3,2,or1 point.
    */
    public void addThreeForTeamA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 3,2,or1 point.
     */
    public void addThreeForTeamB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     *  display the given score for two teams
     */
    public void displayForTeamA(int scoreTeamA) {
        TextView scoreATextView = findViewById(R.id.team_a_score);
        scoreATextView.setText(String.valueOf(scoreTeamA));
    }

    public void displayForTeamB(int scoreTeamB) {
        TextView scoreTeamBTextView = findViewById(R.id.team_b_score);
        scoreTeamBTextView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
