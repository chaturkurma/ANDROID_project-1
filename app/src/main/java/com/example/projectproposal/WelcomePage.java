package com.example.projectproposal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WelcomePage extends AppCompatActivity {
    private EditText Name;
    private EditText password;
    private TextView info;
    private Button but;
    private TextView title;
    private Button but1;
    private Button but2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        EditText Name = (EditText) findViewById(R.id    .name);
        EditText password = (EditText) findViewById((R.id.Password));
        //TextView info = (TextView) findViewById(R.id.textView);
        but = (Button) findViewById(R.id.button);
        TextView title = (TextView) findViewById(R.id.Title);
        but1 = (Button) findViewById(R.id.New);
        but2 = (Button) findViewById(R.id.Fpassword);

        but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(WelcomePage.this,Survey_Page.class);
                startActivity(ini);

            }
        });
        but1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(WelcomePage.this,Signup.class);
                startActivity(ini);

            }
        });
        but2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(WelcomePage.this,ForgotPassword.class);
                startActivity(ini);

            }
        });


    }


}
