package com.example.tourguide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder> {

    ArrayList<Place> placesList;

    public static class PlaceViewHolder extends RecyclerView.ViewHolder {
        public ImageView placeImage;
        TextView placeNameTextView;
        TextView placeDescTextView;
        TextView placeLocationTextView;
        TextView placeHoursTextView;
        TextView placePhoneTextView;

        public PlaceViewHolder(View itemView){
            super(itemView);
            placeImage =itemView.findViewById(R.id.place_image);
            placeNameTextView =itemView.findViewById(R.id.place_name);
            placeDescTextView =itemView.findViewById(R.id.place_description);
            placeLocationTextView =itemView.findViewById(R.id.location);
            placeHoursTextView =itemView.findViewById(R.id.hours);
            placePhoneTextView =itemView.findViewById(R.id.phone);
        }
    }

    public PlaceAdapter(ArrayList<Place> placesList){
        this.placesList = placesList;
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        PlaceViewHolder placeViewHolder =new PlaceViewHolder(v);
        return placeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        Place currentPlace = placesList.get(position);

        holder.placeImage.setImageResource(currentPlace.getmImageResourceId());
        holder.placeNameTextView.setText(currentPlace.getmName());
        holder.placeDescTextView.setText(currentPlace.getmDescription());
        holder.placeLocationTextView.setText(currentPlace.getmLocation());
        holder.placeHoursTextView.setText(currentPlace.getmWorkingHours());
        holder.placePhoneTextView.setText(currentPlace.getmPhoneNo());
    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }
}
