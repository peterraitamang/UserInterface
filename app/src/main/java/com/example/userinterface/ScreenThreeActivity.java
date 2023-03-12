package com.example.userinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.userinterface.databinding.ActivityScreenThreeBinding;
import com.example.userinterface.databinding.ActivityScreenTwoBinding;

public class ScreenThreeActivity extends AppCompatActivity {
    ActivityScreenThreeBinding d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        d = ActivityScreenThreeBinding.inflate(getLayoutInflater());
        setContentView(d.getRoot());
         btnback();
    }

    private void btnback() {
        d.ivBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}