package com.ungerdesign.treadwalltracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ungerdesign.treadwalltracker.activity.InitialInterviewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startActivity(View view) {
        final Intent intent = new Intent(this, InitialInterviewActivity.class);
        startActivity(intent);
    }
}
