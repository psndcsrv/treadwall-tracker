package com.ungerdesign.treadwalltracker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ungerdesign.treadwalltracker.R;

public class InitialInterviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_interview);
    }

    public void finishInterview(View view) {
        // TODO Save interview values
        Intent intent = new Intent(this, InitialStagingActivity.class);
        startActivity(intent);
    }
}
