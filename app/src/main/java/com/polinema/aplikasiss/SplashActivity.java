package com.polinema.aplikasiss;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // langsung pindah ke Main2Activity atau activity lain begitu memasuki
        // splash screen ini
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
        finish();
    }
}