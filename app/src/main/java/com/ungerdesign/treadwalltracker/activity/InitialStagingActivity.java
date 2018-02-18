package com.ungerdesign.treadwalltracker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ungerdesign.treadwalltracker.R;

public class InitialStagingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_staging);
    }

    public void startAttempt(View view) {
        Intent intent = new Intent(this, TimerActivity.class);
        startActivity(intent);
    }
}
