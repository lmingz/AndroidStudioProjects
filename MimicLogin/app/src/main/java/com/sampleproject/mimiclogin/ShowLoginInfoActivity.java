package com.sampleproject.mimiclogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowLoginInfoActivity extends AppCompatActivity {
    TextView showUserName;
    TextView showPassWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_login_info);
        Intent passInfo = getIntent();
        LoginInfo info = (LoginInfo) passInfo.getSerializableExtra("info");
        String userName = info.getUserName();
        String passWord = info.getPassWord();
        showUserName = (TextView) findViewById(R.id.showUserNameTextView);
        showPassWord = (TextView) findViewById(R.id.showPassWordTextView);
        showUserName.setText("用户名： " + userName);
        showPassWord.setText("密码： " + passWord);
    }
}
