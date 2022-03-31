package com.example.quoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class SpleshQuote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splesh_quote);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        Thread td = new Thread(){

            public void run(){

                try {
                    sleep(3000);
                }
                catch (Exception ex){

                    ex.printStackTrace();
                }

                finally {
                    Intent intent = new Intent(SpleshQuote.this , MainActivity.class);
                    startActivity(intent);
                    finish();

                }

            }

        };td.start();
    }
}