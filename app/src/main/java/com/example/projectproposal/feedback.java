package com.example.projectproposal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class feedback extends AppCompatActivity {
    private Button BTN6;
    private TextView feedback;
    private TextView Rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        TextView feedback  = (TextView) findViewById(R.id.BTN5);
        TextView Rating = (TextView) findViewById(R.id.BTN4);
        BTN6 = (Button) findViewById(R.id.FinishBTN);

        BTN6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(feedback.this,MainActivity.class);
                startActivity(ini);

            }

        });
    }
}
