package com.ungerdesign.treadwalltracker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Chronometer;

import com.ungerdesign.treadwalltracker.R;

public class TimerActivity extends AppCompatActivity {
    private static final String TAG = TimerActivity.class.getName();
    public static final String EXTRA_ELAPSED_TIME = "com.ungerdesign.treadwalltracker.ELAPSED_TIME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        // TODO Record start time
        long startTime = SystemClock.elapsedRealtime();

        Log.i(TAG, "Starting timer at: " + startTime);

        // Start timer
        Chronometer chrono = findViewById(R.id.chronometer2);
        chrono.setBase(startTime);
        chrono.start();
    }

    public void finishAttempt(View view) {
        // Stop timer
        Chronometer chrono = findViewById(R.id.chronometer2);
        long elapsedTime = SystemClock.elapsedRealtime() - chrono.getBase();
        chrono.stop();

        Log.i(TAG, "Stopping timer with elapsed: " + elapsedTime);

        // TODO Record elapsed time

        Intent intent = new Intent(this, StagingActivity.class);
        intent.putExtra(EXTRA_ELAPSED_TIME, elapsedTime);
        startActivity(intent);
    }
}
