package com.example.healthmate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<ExampleItem> mList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        //public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            //mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.l1);
            mTextView2 = itemView.findViewById(R.id.l2);

        }
    }

    public ExampleAdapter(ArrayList<ExampleItem> exampleList) {
        mList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_example_item,
                parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ExampleItem currentItem = mList.get(position);

        //holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void filterList(ArrayList<ExampleItem> filteredList) {
        mList = filteredList;
        notifyDataSetChanged();
    }
}
