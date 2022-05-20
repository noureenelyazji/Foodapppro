package com.example.foodapppro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void register(View view) {
        startActivity(new Intent(WelcomeActivity.this,RegistrationActivity.class));
    }

    public void login(View view) {
        startActivity(new Intent(WelcomeActivity.this,RegistrationActivity.class));

    }
}