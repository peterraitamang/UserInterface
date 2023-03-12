package com.example.userinterface.adapter;

import android.content.Intent;
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
import com.example.userinterface.ScreenThreeActivity;
import com.example.userinterface.model.CategoriesData;
import com.example.userinterface.model.SearchDetailsData;

import org.w3c.dom.Text;

public class SearchDetailsAdapter extends RecyclerView.Adapter<SearchDetailsAdapter.ViewHolder>{
    private SearchDetailsData[]myData;

    public SearchDetailsAdapter(SearchDetailsData[] myData) {
        this.myData = myData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recyclerview_item1_page2, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final SearchDetailsData searchDetailsData = myData[position];
        holder.tv_designation.setText(myData[position].getDesignation());;
        holder.tv_initialSalary.setText(myData[position].getInitialSalary());
        holder.tv_finalSalary.setText(myData[position].getFinalSalary());
        holder.iv_image.setImageResource(myData[position].getImage());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                if(position == 2) {
                Intent intent = new Intent(view.getContext(), ScreenThreeActivity.class);
                view.getContext().startActivity(intent);
                }
                else {
                    Toast.makeText(view.getContext(), searchDetailsData.getDesignation()+""+"Selected.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return myData.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public CardView cardView;
        public TextView tv_designation;
        public TextView tv_initialSalary;
        public TextView tv_finalSalary;
        public ImageView iv_image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.cardView = (CardView) itemView.findViewById(R.id.cardview_pg2);
            this.tv_designation = (TextView) itemView.findViewById(R.id.textview2);
            this.tv_initialSalary = (TextView) itemView.findViewById(R.id.textview4);
            this.tv_finalSalary = (TextView) itemView.findViewById(R.id.textview6);
            this.iv_image = (ImageView)  itemView.findViewById(R.id.iv_1);
        }
    }
}
