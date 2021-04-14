package com.example.myfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Timer extends AppCompatActivity {

    TextView timerValue;
    static final long START_TIME_IN_MILLIS = 3600000;
    CountDownTimer countDownTimer;
    boolean timerRunning;
    long timeLeftInMillis = START_TIME_IN_MILLIS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        timerValue = (TextView)findViewById(R.id.Timer);

        startTimer();
    }

    private void startTimer()
    {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis=millisUntilFinished;
                updateCountdownTimer();
            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(), "Workout Complete!", Toast.LENGTH_SHORT).show();

            }
        }.start();
        timerRunning = true;
    }

    private void updateCountdownTimer() {
        int minutes = (int) (timeLeftInMillis/1000) / 60;
        int seconds = (int) (timeLeftInMillis/1000) % 60;

        String timeLeft = String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
        timerValue.setText(timeLeft);
    }
}