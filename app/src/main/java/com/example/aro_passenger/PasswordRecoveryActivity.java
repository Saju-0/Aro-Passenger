package com.example.aro_passenger;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PasswordRecoveryActivity extends AppCompatActivity {

    private static final String TAG = LoginActivity.class.getSimpleName();

    private ImageView iv_BackArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.password_recovery);

        initializeXML();

        clickListener();
    }


    /* calling the value of initialize in this method*/
    private void initializeXML() {
        iv_BackArrow = findViewById(R.id.iv_BackArrow);
    }


    /* calling the value of clickListener in this method */
    private void clickListener() {
     

        iv_BackArrow.setOnClickListener(v -> {
            Log.e(TAG, "iv_BackArrow button clicked");

            startActivity(new Intent(PasswordRecoveryActivity.this, LoginActivity.class));
        });
    }
}

