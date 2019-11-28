package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Tracks the score for Team X
    int scoreTeamX = 0;

    // Tracks the score for Team Y
    int scoreTeamY = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    /**
     * Increase the score for Team X by 1 point.
     */
    public void addOneForTeamX(View v) {
        scoreTeamX = scoreTeamX + 1;
        displayForTeamX(scoreTeamX);
    }

    /**
     * Increase the score for Team X by 2 points.
     */
    public void addTwoForTeamX(View v) {
        scoreTeamX = scoreTeamX + 2;
        displayForTeamX(scoreTeamX);
    }

    /**
     * Increase the score for Team X by 3 points.
     */
    public void addThreeForTeamX(View v) {
        scoreTeamX = scoreTeamX + 3;
        displayForTeamX(scoreTeamX);
    }

    /**
     * Increase the score for Team Y by 1 point.
     */
    public void addOneForTeamY(View v) {
        scoreTeamY = scoreTeamY + 1;
        displayForTeamY(scoreTeamY);
    }

    /**
     * Increase the score for Team Y by 2 points.
     */
    public void addTwoForTeamY(View v) {
        scoreTeamY = scoreTeamY + 2;
        displayForTeamY(scoreTeamY);
    }

    /**
     * Increase the score for Team Y by 3 points.
     */
    public void addThreeForTeamY(View v) {
        scoreTeamY = scoreTeamY + 3;
        displayForTeamY(scoreTeamY);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamX = 0;
        scoreTeamY = 0;
        displayForTeamX(scoreTeamX);
        displayForTeamY(scoreTeamY);
    }

    /**
     * Displays the given score for Team X.
     */
    public void displayForTeamX(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_x_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team Y.
     */
    public void displayForTeamY(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_y_score);
        scoreView.setText(String.valueOf(score));
    }
}
