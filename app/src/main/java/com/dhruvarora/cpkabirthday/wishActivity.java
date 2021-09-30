package com.dhruvarora.cpkabirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;

public class wishActivity extends AppCompatActivity {

    LottieAnimationView animationView;
    LottieAnimationView animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish);

        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        animationView = findViewById(R.id.animation_view);
        animationView.setVisibility(View.VISIBLE);
        animationView.playAnimation();
        animation = findViewById(R.id.animation);
        Thread td = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5000);
                } catch (Exception e){
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(wishActivity.this,wishMsg.class);
                    startActivity(intent);
                    finish();
                }
            }
        }; td.start();
    }
}