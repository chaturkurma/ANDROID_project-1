package com.example.projectproposal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Signup extends AppCompatActivity {
    private TextView Title;
    private TextView fname;
    private TextView lname;
    private TextView email;
    private TextView contact;
    private TextView password;
    private TextView confPassword;
    private EditText a;
    private EditText b;
    private EditText c;
    private EditText d;
    private EditText e;
    private EditText f;
    private Button BT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        TextView Title = (TextView) findViewById(R.id.title);
        TextView fName = (TextView) findViewById(R.id.Fname);
        TextView lname = (TextView) findViewById(R.id.Lname);
        TextView email = (TextView) findViewById(R.id.Email);
        TextView contact = (TextView) findViewById(R.id.Contact);
        TextView password = (TextView) findViewById(R.id.Password);
        TextView confPassword = (TextView) findViewById(R.id.ConfirmPassword);

        EditText a = (EditText) findViewById((R.id.B1));
        EditText b = (EditText) findViewById((R.id.B2));
        EditText c = (EditText) findViewById((R.id.B3));
        EditText d = (EditText) findViewById((R.id.B4));
        EditText e = (EditText) findViewById((R.id.B5));
        EditText f = (EditText) findViewById((R.id.B6));
        BT = (Button)findViewById(R.id.BTN5);

        BT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(Signup.this,MainActivity.class);
                startActivity(ini);

            }
        });




    }
}
