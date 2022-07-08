package com.example.btrade;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.ViewHolder> {
    private final List<RecModel> items;
    public RecAdapter(List<RecModel>items){this.items=items;}
    @NonNull
    @Override
    public RecAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.static_activity,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecAdapter.ViewHolder holder, int position) {
        int resource=items.get(position).getImg2();
        String name= items.get(position).getTxt1();
        String value= items.get(position).getTxt2();
        String quality= items.get(position).getTxt3();
        String description=items.get(position).getTxt4();
        holder.setData(resource,name,value,quality,description);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final ImageView imageView;
        private final TextView textView1;
        private final TextView textView2;
        private final TextView textView3;
        private final TextView textView4;


        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            imageView= itemView.findViewById(R.id.img2);
            textView1=itemView.findViewById(R.id.txt1);
            textView2=itemView.findViewById(R.id.txt2);
            textView3=itemView.findViewById(R.id.txt3);
            textView4=itemView.findViewById(R.id.txt4);

        }

        public void setData(int resource, String name, String value, String quality,String description) {
            imageView.setImageResource(resource);
            textView1.setText(name);
            textView2.setText(value);
            textView3.setText(quality);
            textView4.setText(description);
        }
    }
}


