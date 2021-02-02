package com.example.scorekeeper;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

public class Update {
    static Context context;
    public Update(Context context){
        this.context=context;
    }
    public static void add3(int scoretoadd){
        TextView TeamAScore = (TextView) ((Activity)context).findViewById(R.id.teamAScore);
        TeamAScore.setText(scoretoadd);
    }
}
