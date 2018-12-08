package com.newresume.newresume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.newresume.newresume.model.MyBean;

public class WorkHistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if(null != intent){
            MyBean bean = (MyBean) intent.getSerializableExtra("bean");
            Toast.makeText(this, String.valueOf(bean.getPageIndex()), Toast.LENGTH_LONG).show();
        }

        //setContentView(R.layout.activity_work_history);
    }
}
