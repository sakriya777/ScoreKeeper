package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private TextView TeamAScore;
    private TextView TeamBScore;
    private Button AButtonScore3;
    private Button AButtonScore2;
    private Button AButtonScoreFreeThrow;
    private Button BButtonScore3;
    private Button BButtonScore2;
    private Button BButtonScoreFreeThrow;
    public static int TeamAScoreCounter = 0;
    public static int TeamBScoreCounter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TeamAScore = findViewById(R.id.teamAScore);
        AButtonScore3 = findViewById(R.id.teamA_btn_add3);
        AButtonScore2 = findViewById(R.id.teamA_btn_add2);
        AButtonScoreFreeThrow = findViewById(R.id.teamA_btn_add1);
        TeamBScore = findViewById(R.id.teamBScore);
        BButtonScore3 = findViewById(R.id.teamB_btn_add3);
        BButtonScore2 = findViewById(R.id.teamB_btn_add2);
        BButtonScoreFreeThrow = findViewById(R.id.teamB_btn_add1);
    }
    public void AAdd3(View view){
        TeamAScoreCounter = TeamAScoreCounter + 3;
        TeamAScore.setText(Integer.toString(TeamAScoreCounter));
    }
    public void AAdd2(View view){
        TeamAScoreCounter = TeamAScoreCounter + 2;
        TeamAScore.setText(Integer.toString(TeamAScoreCounter));
    }
    public void AAdd1(View view){
        TeamAScoreCounter = TeamAScoreCounter + 1;
        TeamAScore.setText(Integer.toString(TeamAScoreCounter));
    }
    public void BAdd3(View view){
        TeamBScoreCounter = TeamBScoreCounter + 3;
        TeamBScore.setText(Integer.toString(TeamBScoreCounter));
    }
    public void BAdd2(View view){
        TeamBScoreCounter = TeamBScoreCounter + 2;
        TeamBScore.setText(Integer.toString(TeamBScoreCounter));
    }
    public void BAdd1(View view){
        TeamBScoreCounter = TeamBScoreCounter + 1;
        TeamBScore.setText(Integer.toString(TeamBScoreCounter));
    }
    public void ResetScore(View view){
        TeamAScoreCounter = 0;
        TeamBScoreCounter = 0;
        TeamAScore.setText("0");
        TeamBScore.setText("0");
    }
}