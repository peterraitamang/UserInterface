package com.example.userinterface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.userinterface.adapter.SearchDetailsAdapter;
import com.example.userinterface.databinding.ActivityScreenTwoBinding;
import com.example.userinterface.model.SearchDetailsData;

public class ScreenTwoActivity extends AppCompatActivity {
    ActivityScreenTwoBinding c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        c = ActivityScreenTwoBinding.inflate(getLayoutInflater());
        setContentView(c.getRoot());

        SearchDetailsData[] myData = new SearchDetailsData[]{
                new SearchDetailsData("UI/UX Designer",R.drawable.ic_ui_ux,"$7k","$8k"),
                new SearchDetailsData("Senior Designer", R.drawable.ic_senior_designer,"$5k","7k"),
                new SearchDetailsData("Lead UI Designer", R.drawable.ic_lead_ui,"$10k","13k"),
                new SearchDetailsData("Product Designer", R.drawable.ic_product_designer,"$4k","6k"),
                new SearchDetailsData("CTO", R.drawable.ic_cto,"$20k","27k")

        };
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView_three);
        SearchDetailsAdapter adapter = new SearchDetailsAdapter(myData);
        recyclerView.setAdapter(adapter);

        btnback();
    }

    private void btnback() {
        c.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}