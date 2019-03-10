package com.example.lenovo.cremond_android;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class LoadingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        startLoding();
    }

    private void startLoding(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 2000);
    }


}
