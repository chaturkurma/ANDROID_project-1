package com.example.projectproposal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

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


        final EditText ans1 = (EditText) findViewById(R.id.Ans1);
        final EditText ans2 = (EditText) findViewById(R.id.Ans2);
        final EditText ans3 = (EditText) findViewById(R.id.Ans3);
        submit = (Button) findViewById(R.id.nextBTN);

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String a1 = ans1.getText().toString();
                String a2 = ans2.getText().toString();
                String a3 = ans3.getText().toString();
                Intent ini = new Intent(Survey_questions.this,SecondActivity.class);
                ini.putExtra("a1", a1);
                ini.putExtra("a2", a2);
                ini.putExtra("a3", a3);
                startActivity(ini);

            }
        });



    }
}
