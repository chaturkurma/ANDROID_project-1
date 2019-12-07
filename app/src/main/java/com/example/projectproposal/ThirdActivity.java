package com.example.projectproposal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    private TextView txt;
    private TextView t1;
    private TextView t2;
    private TextView t3;
    private TextView t4;
    private TextView t5;
    private TextView w1;
    private TextView w2;
    private TextView w3;
    private TextView w4;
    private TextView w5;
    private Button BTN;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView t1=(TextView) findViewById(R.id.univName);
        TextView t2=(TextView) findViewById(R.id.univLoc);
        TextView t3=(TextView) findViewById(R.id.gradRate);
        TextView t4=(TextView) findViewById(R.id.ReqScore);
        TextView t5=(TextView) findViewById(R.id.score2);
        TextView nameTv=(TextView) findViewById(R.id.name);
        TextView typeTv=(TextView) findViewById(R.id.type);
        TextView locationTv=(TextView) findViewById(R.id.location);
        TextView rateTv=(TextView) findViewById(R.id.rate);
        TextView greTv=(TextView) findViewById(R.id.gre);
        TextView tofleTv=(TextView) findViewById(R.id.tofle);
        BTN = (Button)findViewById(R.id.button2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String gre = intent.getStringExtra("gre");
        String rate = intent.getStringExtra("rate");
        String tofle = intent.getStringExtra("tofle");
        String type = intent.getStringExtra("type");
        String location = intent.getStringExtra("location");
         url = intent.getStringExtra("url");
        nameTv.setText(name);
        greTv.setText(gre);
        tofleTv.setText(tofle);
        rateTv.setText(rate);
        typeTv.setText(type);
        locationTv.setText(location);

        BTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ini);

            }
        });


    }
}
