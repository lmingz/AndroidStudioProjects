package com.sampleproject.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        TextView textView = findViewById(R.id.text);
        String value = getIntent().getStringExtra("param");
        textView.setText(value);
    }
}
