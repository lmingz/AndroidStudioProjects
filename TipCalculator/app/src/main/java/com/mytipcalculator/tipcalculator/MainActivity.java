package com.mytipcalculator.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView tiptotalTextView;
    TextView totalTextView;
    EditText billTotalEditText;
    Button tip10PercentButton;
    Button tip15PercentButton;
    Button tip20PercentButton;
    Button custmizeRateButton;
    EditText rateEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tiptotalTextView = (TextView) findViewById(R.id.tipTextView);
        totalTextView = (TextView) findViewById(R.id.totalTextView);
        billTotalEditText = (EditText) findViewById(R.id.billTotalEditText);
        tip10PercentButton = (Button) findViewById(R.id.tip10Percent);
        tip15PercentButton = (Button) findViewById(R.id.tip15Percent);
        tip20PercentButton = (Button) findViewById(R.id.tip20Percent);
        custmizeRateButton = (Button) findViewById(R.id.custmizeRateButton);
        rateEditText = (EditText) findViewById(R.id.rateEditText);

        custmizeRateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double rate = Double.valueOf(rateEditText.getText().toString());
                calcTheTip(rate/100);
            }
        });
        tip10PercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcTheTip(0.1);
            }
        });
        tip15PercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcTheTip(0.15);
            }
        });
        tip20PercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcTheTip(0.2);
            }
        });
    }
    void calcTheTip(double rate){// get bill total and calculate tip total and display
        Double billTotal = Double.valueOf(billTotalEditText.getText().toString());
        Double tip = billTotal * rate;
        Double total = billTotal + tip;
        totalTextView.setText("total : " + String.format("%.2f", total));
        tiptotalTextView.setText("tip : " + String.format("%.2f", tip));
    }
}
