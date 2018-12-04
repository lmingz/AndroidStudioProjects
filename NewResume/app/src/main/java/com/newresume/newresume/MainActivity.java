package com.newresume.newresume;

import android.content.Intent;
import android.net.Uri;
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
        final Button emailButton = findViewById(R.id.emailButton);

        nameTextView.setText("Roaring Bunny");

        workingHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goTOWorkHistory = new Intent(getApplicationContext(), WorkHistoryActivity.class);
                startActivity(goTOWorkHistory);
            }
        });
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri myCellNumber = Uri.parse("tel:+8613812345678");
                Intent callMyNumber = new Intent(Intent.ACTION_DIAL, myCellNumber);
                startActivity(callMyNumber);
            }
        });
        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailMe = new Intent(Intent.ACTION_SEND);
                emailMe.setType("plain/text");
                emailMe.putExtra(Intent.EXTRA_EMAIL, new String[] {"12312535@qq.com"});
                emailMe.putExtra(Intent.EXTRA_SUBJECT, "your resume");
                emailMe.putExtra(Intent.EXTRA_TEXT, "I have read your resume");
                startActivity(emailMe);
            }
        });
    }
}
