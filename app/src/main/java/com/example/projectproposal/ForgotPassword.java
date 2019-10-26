package com.example.projectproposal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.RequestPasswordResetCallback;

public class ForgotPassword extends AppCompatActivity {
    EditText edEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        edEmail = findViewById(R.id.edEmail);

        public void resetPassword (View view)
        {
            if (TextUtils.isEmpty(edEmail.getText())) {
                edEmail.setError("Email is required!");
            } else {
                ParseUser.requestPasswordResetInBackground(edEmail.getText().toString(), new RequestPasswordResetCallback() {
                    public void done(ParseException e) {
                        if (e == null) {
                            // An email was successfully sent with reset instructions.
                            Toast.makeText(ForgotPassword.this, "An email was successfully sent with reset instructions.", Toast.LENGTH_LONG).show();
                        } else {
                            // Something went wrong. Look at the ParseException to see what's up.
                            Toast.makeText(ForgotPassword.this, "Something went wrong. Look at the ParseException to see what's up.", Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        }
    }
}