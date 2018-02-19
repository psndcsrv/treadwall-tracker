package com.ungerdesign.treadwalltracker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ungerdesign.treadwalltracker.R;

public class TimerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        // TODO Record start time
        // TODO Start timer
    }

    public void finishAttempt(View view) {
        // TODO Stop timer
        // TODO Record elapsed time

        Intent intent = new Intent(this, StagingActivity.class);
        startActivity(intent);
    }
}
