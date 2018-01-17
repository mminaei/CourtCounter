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

        //Disabling Undo button at the creation of the app.
        Button buttonUndo = (Button) findViewById(R.id.undoLastScore);
        buttonUndo.setEnabled(false);
    }
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int lastScore = 0; //Keeping track of the last score value
    String lastTeam = ""; //Keeping track of the last team scored
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScores (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

        //disabling Undo button
        Button buttonUndo = (Button) findViewById(R.id.undoLastScore);
        buttonUndo.setEnabled(false);


    }
    public void add3ForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        lastScore = 3;
        lastTeam = "A";
        displayForTeamA(scoreTeamA);

        //Enabling Undo button
        Button buttonUndo = (Button) findViewById(R.id.undoLastScore);
        buttonUndo.setEnabled(true);
    }

    public void add2ForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        lastScore = 2;
        lastTeam = "A";
        displayForTeamA(scoreTeamA);

        //Enabling Undo button
        Button buttonUndo = (Button) findViewById(R.id.undoLastScore);
        buttonUndo.setEnabled(true);
    }

    public void add1ForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        lastScore = 1;
        lastTeam = "A";
        displayForTeamA(scoreTeamA);

        //Enabling Undo button
        Button buttonUndo = (Button) findViewById(R.id.undoLastScore);
        buttonUndo.setEnabled(true);
    }
    public void add3ForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        lastScore = 3;
        lastTeam = "B";
        displayForTeamB(scoreTeamB);

        //Enabling Undo button
        Button buttonUndo = (Button) findViewById(R.id.undoLastScore);
        buttonUndo.setEnabled(true);
    }

    public void add2ForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        lastScore = 2;
        lastTeam = "B";
        displayForTeamB(scoreTeamB);

        //Enabling Undo button
        Button buttonUndo = (Button) findViewById(R.id.undoLastScore);
        buttonUndo.setEnabled(true);
    }

    public void add1ForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        lastScore = 1;
        lastTeam = "B";
        displayForTeamB(scoreTeamB);

        //Enabling Undo button
        Button buttonUndo = (Button) findViewById(R.id.undoLastScore);
        buttonUndo.setEnabled(true);
    }
    public void undoLastScore (View view) {
        if (lastTeam == "A") {
            scoreTeamA = scoreTeamA - lastScore;
            displayForTeamA(scoreTeamA);
        }
        if (lastTeam == "B") {
            scoreTeamB = scoreTeamB - lastScore;
            displayForTeamB(scoreTeamB);
        }

        //Disabling Undo button because it has been used.
        Button buttonUndo = (Button) findViewById(R.id.undoLastScore);
        buttonUndo.setEnabled(false);
    }
}
