package com.example.projectproposal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Button BTN;
    private TextView tit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv = (TextView) findViewById(R.id.univ1);
        TextView tv1 = (TextView) findViewById(R.id.univ2);
        BTN = (Button) findViewById(R.id.BTNnext);
        TextView tit = (TextView)findViewById(R.id.titleUniv);


        tv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(ini);

            }

        });

        tv1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(SecondActivity.this,fourthActivity.class);
                startActivity(ini);

            }

        });

        BTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(SecondActivity.this, feedback.class);
                startActivity(ini);


            }
        });
    }
    }
