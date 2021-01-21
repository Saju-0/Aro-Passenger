package com.example.aro_passenger;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.aro_passenger.Fragment.RoundFragment;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = LoginActivity.class.getSimpleName();

    private CardView cv_login_btn;
    private TextView tv_signup;
    private TextView tv_forgotpassword;
    private ImageView iv_BackArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        initializeXML();


        clickListener();
    }

    private void initializeXML() {

        cv_login_btn = findViewById(R.id.cv_login_btn);
        tv_signup = findViewById(R.id.tv_signup);
        tv_forgotpassword = findViewById(R.id.tv_forgotpassword);
        iv_BackArrow = findViewById(R.id.iv_BackArrow);
    }


    private void clickListener() {

        cv_login_btn.setOnClickListener(v ->
                Log.e(TAG, "cv_login_btn button clicked"));

        tv_signup.setOnClickListener(v -> {
            Log.e(TAG, "tv_signup_btn button clicked");

            Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
            startActivity(intent);
        });

        tv_forgotpassword.setOnClickListener(v -> {
            Log.e(TAG, "tv_forgotpassword_btn button clicked");

            Intent intent = new Intent(LoginActivity.this, PasswordRecoveryActivity.class);
            startActivity(intent);


        });

        iv_BackArrow.setOnClickListener(v -> {
            Log.e(TAG, "iv_BackArrow clicked");
            Intent intent = new Intent(LoginActivity.this, RoundFragment.class);
            startActivity(intent);

        });


    }


}