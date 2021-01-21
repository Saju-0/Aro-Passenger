package com.example.aro_passenger;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    private static final String TAG = LoginActivity.class.getSimpleName();
    private ImageView iv_BackArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        initializeXML();
        clickListener();
    }

    private void initializeXML() {
        iv_BackArrow = findViewById(R.id.iv_BackArrow);

    }

    private void clickListener() {

        iv_BackArrow.setOnClickListener(v -> {
            Log.e(TAG, "iv_BackArrow button clicked");

        });
        iv_BackArrow.setOnClickListener(v -> {
            Log.e(TAG, "iv_BackArrow button clicked");

            Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }

}
