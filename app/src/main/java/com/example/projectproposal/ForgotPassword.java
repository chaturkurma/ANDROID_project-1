package com.example.projectproposal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        C1 = findViewById(R.id.Bt1);
        C2 = findViewById(R.id.Bt2);
        C3 = findViewById(R.id.BT3);
        C4 = findViewById(R.id.Bt4);

        T1 = findViewById(R.id.editText);
        T2 = findViewById(R.id.editText2);
        T3 = findViewById(R.id.editText3);
        BT6 = findViewById(R.id.SubmitBTN);
    }

    public void gotoSignInAction(View v) {
        final String user = T1.getText().toString();
        final String p = T2.getText().toString();
        if (user.length() == 0) {
            T1.requestFocus();
            T1.setError("Name field cannot be empty!!");
        } else if (p.length() < 8 && !isValidPassword(p)) {
            T2.requestFocus();
            T2.setError("Enter Valid Password with atleast 1 capital letter, 1 small letter, 1 number and a symbol");
        } else {
            try {
                Intent toOtherIntent = new Intent(ForgotPassword.this, MainActivity.class);
                startActivity(toOtherIntent);

            } catch (Exception e) {
            }
        }


    }


    public static boolean isValidPassword(final String password) {

        Pattern pattern;
        Matcher matcher;
        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);
        return matcher.matches();

    }
}

       // BT6.setOnClickListener(new View.OnClickListener() {

         //   @Override
           // public void onClick(View view) {

             //   Intent ini = new Intent(ForgotPassword.this,MainActivity.class);
               // startActivity(ini);

            //}
        //});




    //}
//}
