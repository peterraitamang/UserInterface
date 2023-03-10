package com.example.userinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.userinterface.databinding.ActivityScreenTwoBinding;

public class ScreenTwoActivity extends AppCompatActivity {
    ActivityScreenTwoBinding c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        c = ActivityScreenTwoBinding.inflate(getLayoutInflater());
        setContentView(c.getRoot());


    }
}