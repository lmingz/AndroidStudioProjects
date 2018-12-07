package com.sampleproject.dreamteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlayerDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_detail);
        TextView nameTextView = findViewById(R.id.nameTextView);
        String playerName = "player name : " + (String) getIntent().getExtras().get("playerName");
        nameTextView.setText(playerName);
    }
}
