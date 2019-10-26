package com.example.projectproposal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForgotPassword extends AppCompatActivity {
    private TextView C1;
    private TextView C2;
    private TextView C3;
    private TextView C4;
    private EditText T1;
    private EditText T2;
    private EditText T3;
    private Button BT6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        TextView C1 = (TextView) findViewById(R.id.Bt1);
        TextView C2 = (TextView) findViewById(R.id.Bt2);
        TextView C3 = (TextView) findViewById(R.id.BT3);
        TextView C4 = (TextView) findViewById(R.id.Bt4);

        EditText T1 = (EditText) findViewById(R.id.editText);
        EditText T2 = (EditText) findViewById(R.id.editText2);
        EditText T3 = (EditText) findViewById(R.id.editText3);
        BT6 = (Button) findViewById(R.id.SubmitBTN);

        BT6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(ForgotPassword.this,MainActivity.class);
                startActivity(ini);

            }
        });




    }
}
