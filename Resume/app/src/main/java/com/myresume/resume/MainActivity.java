package com.myresume.resume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nameTextView;
    ImageView photoImageView;
    Button workingHistoryButton;
    Button callButton;
    Button emailButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView nameTextView = findViewById(R.id.nameTextView);
        ImageView photoImageView = findViewById(R.id.photoImageView);
        Button workingHistoryButton = findViewById(R.id.workingHistoryButton);
        Button callButton = findViewById(R.id.callButton);
        Button emailButton = findViewById(R.id.emailButton);

        nameTextView.setText("Xiao Feitu");

        workingHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goTOWorkHistory = new Intent(getApplicationContext(), WorkHistoryActivity.class);
                startActivity(goTOWorkHistory);
            }
        });


    }
}
