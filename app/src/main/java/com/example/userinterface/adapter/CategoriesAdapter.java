package com.example.userinterface.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.userinterface.R;
import com.example.userinterface.model.CategoriesData;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder>{
    private CategoriesData[]mydata;

    public CategoriesAdapter(CategoriesData[] mydata) {
        this.mydata = mydata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recyclerview_item2_page2,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final CategoriesData categoriesData = mydata[position];
        holder.textView1.setText(mydata[position].getTxtName());
        holder.imageView.setImageResource(mydata[position].getImage());
        
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), categoriesData.getTxtName()+" "+"selected.", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mydata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public CardView cardView;
        public TextView textView1;
        public ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.cardView = (CardView) itemView.findViewById(R.id.cardview2);
            this.textView1 = (TextView) itemView.findViewById(R.id.txt_categories1);
            this.imageView = (ImageView) itemView.findViewById(R.id.img_categories2);
        }
    }
}
