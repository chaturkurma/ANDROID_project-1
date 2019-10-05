package com.example.projectproposal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity   {
    private EditText Name;
    private EditText password;
    private TextView info;
    private Button but;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Name = (EditText) findViewById(R.id    .name);
        EditText password = (EditText) findViewById((R.id.Password));
        //TextView info = (TextView) findViewById(R.id.textView);
      but = (Button) findViewById(R.id.button);

  but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

               Intent ini = new Intent(MainActivity.this,SecondActivity.class);
               startActivity(ini);

            }
       });
    }


}
