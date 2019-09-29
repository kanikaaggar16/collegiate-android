package com.example.demo.collegiate;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Splash_Screen extends AppCompatActivity {
    private ImageView logo;

    long SPLASH_TIMEOUT=4000;
    Thread thread;
    FirebaseAuth firebaseAuth;


/*
    private static int splashTimeOut=2000;
*/
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        firebaseAuth = FirebaseAuth.getInstance();
        final FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();

        thread= new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(SPLASH_TIMEOUT);
                    if (firebaseUser != null){
                        Intent i = new Intent(Splash_Screen.this, course.class);
                        startActivity(i);
                        finish();
                    }else {
                        Intent i = new Intent(Splash_Screen.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    }


                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

            }
        });

        thread.start();





    logo = (ImageView) findViewById(R.id.logo);
            /*new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(Splash_Screen.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }, splashTimeOut);
*/
        }
    }

