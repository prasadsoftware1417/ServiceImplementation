package com.example.service_implementation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void stop(View view) {

        stopService(new Intent(this,ServiceDemo.class));
    }

    public void start(View view) {
        startService(new Intent(this,ServiceDemo.class));
    }
}
