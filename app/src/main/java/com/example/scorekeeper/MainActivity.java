package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView TeamAScore;
    private TextView TeamBScore;
    private Button AButtonScore3;
    private Button AButtonScore2;
    private Button AButtonScoreFreeThrow;
    private Button BButtonScore3;
    private Button BButtonScore2;
    private Button BButtonScoreFreeThrow;
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
}