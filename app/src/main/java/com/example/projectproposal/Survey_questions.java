package com.example.projectproposal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Survey_questions extends AppCompatActivity {

    private TextView ques1;
    private TextView ques2;
    private TextView ques3;
    private Button submit;
    private EditText ans1;
    private EditText ans2;
    private EditText ans3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_questions);

        TextView ques1 = (TextView) findViewById(R.id.Q1);
        TextView ques2 = (TextView) findViewById(R.id.Q2);
        TextView ques3 = (TextView) findViewById(R.id.Q3);
        EditText ans1 = (EditText) findViewById(R.id.Ans1);
        EditText ans2 = (EditText) findViewById(R.id.Ans2);
        EditText ans3 = (EditText) findViewById(R.id.Ans3);
        submit = (Button) findViewById(R.id.BTN);

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(Survey_questions.this,SecondActivity.class);
                startActivity(ini);

            }
        });

    }
}
