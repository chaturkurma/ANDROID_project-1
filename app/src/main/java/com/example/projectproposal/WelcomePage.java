package com.example.projectproposal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WelcomePage extends AppCompatActivity {


    private TextView w1;
    private Button By;
    private Button By1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        TextView w1 = (TextView) findViewById(R.id.welcome);
        By = (Button) findViewById(R.id.Adminlogin);
        By1 = (Button) findViewById(R.id.Studentlogin);

        By.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(WelcomePage.this, adminlogin.class);
                startActivity(ini);


            }
        });

        By1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(WelcomePage.this,MainActivity.class);
                startActivity(ini);


            }
        });
    }
}


