package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreA = 0;
    private int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button teamAButton3Points = (Button) findViewById(R.id.team_a_button_3points);
        teamAButton3Points.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                teamAButton3PointsClicked();
            }
        });

        final Button teamAButton2Points = (Button) findViewById(R.id.team_a_button_2points);
        teamAButton2Points.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                teamAbutton2PointsClicked();
            }
        });

        final Button teamAButtonFreeThrow = (Button) findViewById(R.id.team_a_button_freethrow);
        teamAButtonFreeThrow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                teamAButtonFreeThrowClicked();
            }
        });

        final Button teamBButton3Points = (Button) findViewById(R.id.team_b_button_3points);
        teamBButton3Points.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                teamBButton3PointsClicked();
            }
        });

        final Button teamBButton2Points = (Button) findViewById(R.id.team_b_button_2points);
        teamBButton2Points.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                teamBbutton2PointsClicked();
            }
        });

        final Button teamBButtonFreeThrow = (Button) findViewById(R.id.team_b_button_freethrow);
        teamBButtonFreeThrow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                teamBButtonFreeThrowClicked();
            }
        });

        final Button resetButton = (Button) findViewById(R.id.button_reset);
        resetButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resetButtonClicked();
            }
        });
    }

    private void resetButtonClicked() {
        scoreA = 0;
        displayForTeamA( scoreA );
        scoreB = 0;
        displayForTeamB( scoreB );
    }

    private void teamAButton3PointsClicked() {
        scoreA += 3;
        displayForTeamA( scoreA );
    }

    private void teamAbutton2PointsClicked() {
        scoreA += 2;
        displayForTeamA( scoreA );

    }

    private void teamAButtonFreeThrowClicked() {
        scoreA += 1;
        displayForTeamA( scoreA );

    }

    private void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    private void teamBButton3PointsClicked() {
        scoreB += 3;
        displayForTeamB( scoreB );
    }

    private void teamBbutton2PointsClicked() {
        scoreB += 2;
        displayForTeamB( scoreB );

    }

    private void teamBButtonFreeThrowClicked() {
        scoreB += 1;
        displayForTeamB( scoreB );

    }

    private void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
