package com.example.splashscreenyt;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); // command for executing the Motion Layout on AVD

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        new Handler().postDelayed(new Runnable() { // new Handler class for the Splash Screen and Intending new activity!!
            @Override
            public void run() { // overide run method

                Intent intent=new Intent(HomeActivity.this,MainActivity.class); // new Intent class for intending the activity
                startActivity(intent);
                finish();

            }
        },1000*2); //delay seconds for the splash screen  to main screen

    }
}