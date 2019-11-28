package com.example.projectproposal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdminUniversityList extends AppCompatActivity {
    private Button BTN;
    private Button BTN1;
    private TextView tit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_university_list);
        TextView tv = (TextView) findViewById(R.id.univ1);
        TextView tv1 = (TextView) findViewById(R.id.univ2);
        BTN = (Button) findViewById(R.id.button3);
        BTN1 = (Button) findViewById(R.id.BTNnext);
        TextView tit = (TextView)findViewById(R.id.titleUniv);
        BTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(AdminUniversityList.this, AddUniversity.class);
                startActivity(ini);


            }
        });

       


    }


}
