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

        Name =findViewById(R.id.name);
        password = findViewById((R.id.Password));
        //TextView info = (TextView) findViewById(R.id.textView);
        but =findViewById(R.id.button);
        title =findViewById(R.id.Title);
        but1 = findViewById(R.id.New);
        but2 = findViewById(R.id.Fpassword);
    }

    public void gotoSignInAction(View v) {
        final String user = Name.getText().toString();
        final String p = password.getText().toString();
        if (user.length() == 0) {
            Name.requestFocus();
            Name.setError("Name field cannot be empty!!");
        } else if (p.length() < 8 && !isValidPassword(p)) {
            password.requestFocus();
            password.setError("Enter Valid Password with atleast 1 capital letter, 1 small letter, 1 number and a symbol");
        } else {
            try {
                Intent toOtherIntent = new Intent(this, SecondActivity.class);
                startActivity(toOtherIntent);

            } catch (Exception e) {
            }
        }
        but2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent ini = new Intent(WelcomePage.this, ForgotPassword.class);
                startActivity(ini);

            }
        });


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


        //[but.setOnClickListener(new View.OnClickListener() {

           // @Override
            //public void onClick(View view) {

                //Intent ini = new Intent(WelcomePage.this,Survey_Page.class);
               // startActivity(ini);

           // }
       // });
       // but1.setOnClickListener(new View.OnClickListener() {

            //@Override
            //public void onClick(View view) {

              //  Intent ini = new Intent(WelcomePage.this,Signup.class);
                //startActivity(ini);

            //}
        //});]
        //but2.setOnClickListener(new View.OnClickListener() {

            //@Override
          //  public void onClick(View view) {

        //        Intent ini = new Intent(WelcomePage.this,ForgotPassword.class);
      //          startActivity(ini);

    //        }
       // });


  //  }


//}
