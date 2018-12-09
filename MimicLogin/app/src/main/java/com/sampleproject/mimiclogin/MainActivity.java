package com.sampleproject.mimiclogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText userNameEditText;
    EditText passWordEditText;
    Button loginButton;
    TextView noPassWordLoginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userNameEditText = (EditText) findViewById(R.id.userNameEditText);
        passWordEditText = (EditText) findViewById(R.id.passWordEditText);
        loginButton = (Button) findViewById(R.id.logInButton);
        noPassWordLoginTextView = (TextView) findViewById(R.id.noPassWordLoginTextView);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginInfo info = new LoginInfo(userNameEditText.getText().toString(), passWordEditText.getText().toString());
                Intent passInfo = new Intent(MainActivity.this, ShowLoginInfoActivity.class);
                passInfo.putExtra("info", info);
                startActivity(passInfo);
            }
        });

        noPassWordLoginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToNoPasswordLoginActivity = new Intent(MainActivity.this, NoPasswordLoginActivity.class);
                startActivity(goToNoPasswordLoginActivity);
            }
        });

    }
}
