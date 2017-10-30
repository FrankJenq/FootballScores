package com.example.android.footballscores;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreLiverpool = 0;
    int scoreManUtd = 0;
    int yellowCardLiverpool = 0;
    int yellowCardManUtd = 0;
    int redCardLiverpool = 0;
    int redCardManUtd = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Liverpool by 1 point.
     */
    public void setScoreLiverpool(View v) {
        scoreLiverpool = scoreLiverpool + 1;
        displayForLiverpool(scoreLiverpool);
    }

    /**
     * Increase the score for ManUtd by 1 points.
     */
    public void setScoreManUtd(View v) {
        scoreManUtd = scoreManUtd + 1;
        displayForManUtd(scoreManUtd);
    }

    /**
     * Increase the number of yellow cards of Liverpool by 1.
     */
    public void setYellowCardLiverpool(View v) {
        yellowCardLiverpool = yellowCardLiverpool + 1;
        displayYellowCardForLiverpool(yellowCardLiverpool);
    }

    /**
     * Increase the number of yellow cards of Man Utd by 1.
     */
    public void setYellowCardManUtd(View v) {
        yellowCardManUtd = yellowCardManUtd + 1;
        displayYellowCardForManUtd(yellowCardManUtd);
    }

    /**
     * Increase the number of red cards of Liverpool by 1.
     */
    public void setRedCardLiverpool(View v) {
        redCardLiverpool = redCardLiverpool + 1;
        displayRedCardForLiverpool(redCardLiverpool);
    }

    /**
     * Increase the number of red cards of Man Utd by 1.
     */
    public void setRedCardManUtd(View v) {
        redCardManUtd = redCardManUtd + 1;
        displayRedCardForManUtd(redCardManUtd);
    }

    /**
     * Displays the given score for Liverpool.
     */
    public void displayForLiverpool(int score) {
        TextView scoreView = (TextView) findViewById(R.id.liverpool_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Man Utd.
     */
    public void displayForManUtd(int score) {
        TextView scoreView = (TextView) findViewById(R.id.manutd_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of red cards of Man Utd.
     */
    public void displayRedCardForManUtd(int score) {
        TextView scoreView = (TextView) findViewById(R.id.manutd_redcard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of red cards of Liverpool.
     */
    public void displayRedCardForLiverpool(int score) {
        TextView scoreView = (TextView) findViewById(R.id.liverpool_redcard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of yellow cards of Man Utd.
     */
    public void displayYellowCardForManUtd(int score) {
        TextView scoreView = (TextView) findViewById(R.id.manutd_yellowcard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of yellow cards of Liverpool.
     */
    public void displayYellowCardForLiverpool(int score) {
        TextView scoreView = (TextView) findViewById(R.id.liverpool_yellowcard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset all the data of both teams.
     */
    public void resetBothData(View v) {
        scoreLiverpool = 0;
        scoreManUtd = 0;
        yellowCardLiverpool = 0;
        yellowCardManUtd = 0;
        redCardLiverpool = 0;
        redCardManUtd = 0;
        displayForLiverpool(scoreLiverpool);
        displayForManUtd(scoreManUtd);
        displayRedCardForLiverpool(redCardLiverpool);
        displayRedCardForManUtd(redCardManUtd);
        displayYellowCardForLiverpool(yellowCardLiverpool);
        displayYellowCardForManUtd(yellowCardManUtd);
    }
}