package com.example.userinterface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.userinterface.adapter.CategoriesAdapter;
import com.example.userinterface.adapter.PopularSearchAdapter;
import com.example.userinterface.databinding.ActivityMainBinding;
import com.example.userinterface.model.CategoriesData;
import com.example.userinterface.model.PopularSearchData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        PopularSearchData[] myData = new PopularSearchData[]{
                new PopularSearchData("UI/UX","Designer","5"),
                new PopularSearchData("Java Script","Developer","24"),
                new PopularSearchData("Java ","Developer","4"),
                new PopularSearchData("Java Script","Developer","24"),
                new PopularSearchData("Java ","Developer","2"),
                new PopularSearchData("Type Script","Developer","34")
        };
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.recyclerView_one);
        PopularSearchAdapter adapter = new PopularSearchAdapter(myData);
        recyclerView.setAdapter(adapter);

//        CategoriesData[] myData2 = new CategoriesData[]{
//                new CategoriesData("Science",""),
//                new CategoriesData("Culture",""),
//                new CategoriesData("IT",""),
//                new CategoriesData("Beauty","")
//        };
//        RecyclerView recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView_two);
//        CategoriesAdapter adapter1 = new CategoriesAdapter(myData2);
//        recyclerView1.setAdapter(adapter1);

    }
}