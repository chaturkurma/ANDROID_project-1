package com.example.projectproposal;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Signup extends AppCompatActivity {
<<<<<<< HEAD
    private TextView Title;
    private TextView f1;
    private TextView lname;
    private TextView email;
    private TextView contact;
    private TextView password;
    private TextView confPassword;
    private EditText a;
    private EditText b;
    private EditText c;
    private EditText d;
    private EditText e;
    private EditText f;
    private Button BT;

=======
>>>>>>> 2c55fa850fdc1119fd08b389ed18757c0abd919f

    EditText edName, edEmail, edPassword, edConfirmPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

<<<<<<< HEAD
        Title = (TextView) findViewById(R.id.title);
        f1 = (TextView) findViewById(R.id.Fname);
        lname = (TextView) findViewById(R.id.Lname);
        email = (TextView) findViewById(R.id.Email);
        contact = (TextView) findViewById(R.id.Contact);
        password = (TextView) findViewById(R.id.Password);
        confPassword = (TextView) findViewById(R.id.ConfirmPassword);

        a = (EditText) findViewById((R.id.B1));
        b = (EditText) findViewById((R.id.B2));
        c = (EditText) findViewById((R.id.B3));
        d = (EditText) findViewById((R.id.B4));
        e = (EditText) findViewById((R.id.B5));
        f = (EditText) findViewById((R.id.B6));
        BT = (Button)findViewById(R.id.BTN5);

    }

    public void gotoSuccessfulSignUpActivityAction(View v) {
        //Fullname Field validation
        final String fName=f1.getText().toString();
        final String mobNum=contact.getText().toString();
        final String user=lname.getText().toString();
        final String p=password.getText().toString();
        final String Cpass=confPassword.getText().toString();
        if(fName.length()==0){
            f1.requestFocus();
            f1.setError("Name field cannot be empty!!");
        }
        else if(!fName.matches("[a-zA-Z ]+"))
        {
            f1.requestFocus();
            f1.setError("ENTER ONLY ALPHABETICAL CHARACTER");
        }
        //Mobile Number validation

        else if(mobNum.length()==0|| mobNum.length()>11){
            contact.requestFocus();
            contact.setError("Mobile Field is Empty/ too Long");
        }
        else if (!Pattern.matches("[0-9]+",mobNum)){
            contact.setError("Mobile Field should contain only numerical values");
        }

        //UserId validation

        else if(user.length()==0){
            lname.requestFocus();
            lname.setError("Name field cannot be empty!!");
        }

        //Password validation
        else if(p.length()<8&&!isValidPassword(p)){
            password.requestFocus();
            password.setError("Enter Valid Password with atleast 1 capital letter, 1 small letter, 1 number and a symbol");
        }

        //Confirm Password Validation
        else if(!(Cpass.equals(p))){
            confPassword.requestFocus();
            confPassword.setError("Password and Confirm Password does not match");
        }

        else {
            try {
                Intent toOtherIntent = new Intent(this, WelcomePage.class);
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
=======
        edName = findViewById(R.id.edName);
        edEmail = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPassword);
        edConfirmPassword = findViewById(R.id.edConfirmPassword);
    }

    public void signup(View view) {
        if( TextUtils.isEmpty(edName.getText())){
            edName.setError( "Name is required!" );
        }else if( TextUtils.isEmpty(edEmail.getText())){
            edEmail.setError( "Email is required!" );
        }else if( TextUtils.isEmpty(edPassword.getText())){
            edPassword.setError( "Password is required!" );
        }else if( TextUtils.isEmpty(edConfirmPassword.getText())){
            edConfirmPassword.setError( "Confirm password is required!" );
        }else if(!edPassword.getText().toString().equals(edConfirmPassword.getText().toString())){
            Toast.makeText(Signup.this, "Passwords are not the same!", Toast.LENGTH_LONG).show();
        }
        else{
>>>>>>> 2c55fa850fdc1119fd08b389ed18757c0abd919f

            final ProgressDialog progress = new ProgressDialog(this);
            progress.setMessage("Loading ...");
            progress.show();
            ParseUser user = new ParseUser();
            user.setUsername(edEmail.getText().toString().trim());
            user.setEmail(edEmail.getText().toString().trim());
            user.setPassword(edPassword.getText().toString());
            user.put("name", edName.getText().toString().trim());
            user.signUpInBackground(new SignUpCallback() {
                @Override
                public void done(ParseException e) {
                    progress.dismiss();
                    if (e == null) {
                        Toast.makeText(Signup.this, "Welcome!", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Signup.this, WelcomePage.class);
                        startActivity(intent);
                        finish();
                    } else {
                        ParseUser.logOut();
                        Toast.makeText(Signup.this, e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }
            });
        }
    }
<<<<<<< HEAD
=======
}
>>>>>>> 2c55fa850fdc1119fd08b389ed18757c0abd919f
