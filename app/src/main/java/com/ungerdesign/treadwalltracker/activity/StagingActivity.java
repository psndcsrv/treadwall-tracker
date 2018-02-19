package com.ungerdesign.treadwalltracker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.ungerdesign.treadwalltracker.R;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class StagingActivity extends AppCompatActivity {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM:SS");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staging);

        Intent intent = getIntent();
        long elapsedTime = intent.getLongExtra(TimerActivity.EXTRA_ELAPSED_TIME, 0);

        TextView lastAttemptLabelView = findViewById(R.id.lastAttemptLabelView);
        TextView lastAttemptElapsedView = findViewById(R.id.lastAttemptElapsedView);
        if (elapsedTime > 0) {
            lastAttemptLabelView.setVisibility(View.VISIBLE);
            lastAttemptElapsedView.setVisibility(View.VISIBLE);

            lastAttemptElapsedView.setText(formatElapsedTime(elapsedTime));
        } else {
            lastAttemptLabelView.setVisibility(View.INVISIBLE);
            lastAttemptElapsedView.setVisibility(View.INVISIBLE);
        }
    }

    public void startAttempt(View view) {
        Intent intent = new Intent(this, TimerActivity.class);
        startActivity(intent);
    }

    public void finishActivity(View view) {
        Intent intent = new Intent(this, ExitInterviewActivity.class);
        startActivity(intent);
    }

    private String formatElapsedTime(long elapsed) {
        long minutes = TimeUnit.MILLISECONDS.toMinutes(elapsed);
        return String.format("%02d:%02d",
                minutes,
                TimeUnit.MILLISECONDS.toSeconds(elapsed) - TimeUnit.MINUTES.toSeconds(minutes)
                );
    }
}
