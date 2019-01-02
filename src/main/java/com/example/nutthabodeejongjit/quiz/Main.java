package com.example.nutthabodeejongjit.quiz;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main extends AppCompatActivity {
    Handler handler;
    Runnable runnable;
    long delay_time;
    long time = 4000L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Main.this,Question.class);
                startActivity(intent);
                finish();
            }
        };
    }

    public void onResume() {
        super.onResume();
        delay_time = time;
        handler.postDelayed(runnable, delay_time);
        time = System.currentTimeMillis();
    }

    public void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable);
        time = delay_time - (System.currentTimeMillis() - time);
    }
}
