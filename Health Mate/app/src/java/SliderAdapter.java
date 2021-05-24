package com.example.healthmate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderViewHolder>{

    List<Slideritem> slideritems;
    ViewPager2 viewPager2;

    public SliderAdapter(List<Slideritem> slideritems, ViewPager2 viewPager2) {
        this.slideritems = slideritems;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SliderViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.slide_container,
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {
        holder.setImage(slideritems.get(position));
    }

    @Override
    public int getItemCount() {
        return slideritems.size();
    }

    class SliderViewHolder extends RecyclerView.ViewHolder{

        private RoundedImageView imageView;
        public SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.idimageslide);
        }
        void setImage(Slideritem slideritem){
            imageView.setImageResource(slideritem.getImage());
        }
    }
}
