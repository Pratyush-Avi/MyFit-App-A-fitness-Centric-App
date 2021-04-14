package com.example.myfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Splits extends AppCompatActivity
{
    RadioGroup radioGroup;
    RadioButton rButton1,rButton2,rButton3,rButton4;
    Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splits);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
        rButton1 = (RadioButton) findViewById(R.id.button1);
        rButton2 = (RadioButton) findViewById(R.id.button2);
        rButton3 = (RadioButton) findViewById(R.id.button3);
        rButton4 = (RadioButton) findViewById(R.id.button4);
        go = (Button) findViewById(R.id.go_btn);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rButton1.isChecked()) {
                    Intent intent = new Intent(getApplicationContext(),ThreeDaySplit.class);
                    startActivity(intent);
                } else if (rButton2.isChecked()) {
                    Intent intent = new Intent(getApplicationContext(),FourDaySplit.class);
                    startActivity(intent);
                } else if (rButton3.isChecked()) {
                    Intent intent = new Intent(getApplicationContext(),FiveDaySplit.class);
                    startActivity(intent);
                } else if (rButton4.isChecked()) {
                    Intent intent = new Intent(getApplicationContext(),SixDaySplit.class);
                    startActivity(intent);
                }
            }
        });
    }
}