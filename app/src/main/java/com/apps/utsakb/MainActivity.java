//9 mei 2020
//nim : 10117144
//nama: Muhamad Pani Rayadi
//Kelas : IF4
package com.apps.utsakb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(MainActivity.this, menu.class);
                startActivity(home);
                finish();
            }
        },waktu_loading);
    }
}
