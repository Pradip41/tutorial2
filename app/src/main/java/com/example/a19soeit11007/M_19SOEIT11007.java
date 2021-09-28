package com.example.a19soeit11007;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class M_19SOEIT11007 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m19_soeit11007);
    }

    public void btn(View view) {

        Intent a1 = new Intent(this,MainActivity.class);
        startActivity(a1);
        finish();
    }
}