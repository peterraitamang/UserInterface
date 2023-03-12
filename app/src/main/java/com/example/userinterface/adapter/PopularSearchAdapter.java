package com.example.userinterface.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.userinterface.MainActivity;
import com.example.userinterface.R;
import com.example.userinterface.ScreenTwoActivity;
import com.example.userinterface.databinding.ActivityMainBinding;
import com.example.userinterface.model.PopularSearchData;

public class PopularSearchAdapter extends RecyclerView.Adapter<PopularSearchAdapter.ViewHolder>{

    private PopularSearchData[]mydata;

    public PopularSearchAdapter(PopularSearchData[] mydata) {
        this.mydata = mydata;
    }

    ActivityMainBinding b;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recyclerview_item1_page1,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final PopularSearchData popularSearchData = mydata [position];
        holder.textView1.setText(mydata[position].getTxtPost());
        holder.textView2.setText(mydata[position].getTxtDesignation());
        holder.textView3.setText(mydata[position].getTxtQuantity());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), ScreenTwoActivity.class);
                    view.getContext().startActivity(intent);
                }
                else {
                    Toast.makeText(view.getContext(),popularSearchData.getTxtQuantity()+" "+popularSearchData.getTxtPost()+" "+popularSearchData.getTxtDesignation()+" "+ "position vacant.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mydata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView1,textView2,textView3;
        public CardView cardView;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textView1= (TextView) itemView.findViewById(R.id.txt_cardview_1);
            this.textView2= (TextView) itemView.findViewById(R.id.txt_cardview_2);
            this.textView3= (TextView) itemView.findViewById(R.id.txt_cardview_3);
            this.cardView = (CardView) itemView.findViewById(R.id.cardview1);
        }
    }
}
