package com.ungerdesign.treadwalltracker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ungerdesign.treadwalltracker.MainActivity;
import com.ungerdesign.treadwalltracker.R;

public class ExitInterviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit_interview);
    }

    public void finalizeActivity(View view) {
        // TODO Record exit interview data

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
