package com.example.tourguide.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tourguide.Place;
import com.example.tourguide.PlaceAdapter;
import com.example.tourguide.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    View view;


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.list, container, false);

        ArrayList<Place> restaurantsArray = new ArrayList<>();
        restaurantsArray.add(new Place(R.drawable.nile_river_cafe,
                getString(R.string.Nile_River_Cafe_name),
                getString(R.string.Nile_River_Cafe_desc),
                getString(R.string.Nile_River_Cafe_loc),
                getString(R.string.Nile_River_Cafe_hours),
                getString(R.string.Nile_River_Cafe_phone)));

        restaurantsArray.add(new Place(R.drawable.ozone,
                getString(R.string.Ozone_Cafe_name),
                getString(R.string.Ozone_Cafe_desc),
                getString(R.string.Ozone_Cafe_loc),
                getString(R.string.Ozone_Cafe_hours),
                getString(R.string.Ozone_Cafe_phone)));

        restaurantsArray.add(new Place(R.drawable.le_grill,
                getString(R.string.Le_Grill_name),
                getString(R.string.Le_Grill_desc),
                getString(R.string.Le_Grill_loc),
                getString(R.string.Le_Grill_hours),
                getString(R.string.Le_Grill_phone)));

        restaurantsArray.add(new Place(R.drawable.samakna,
                getString(R.string.Samakna_Restaurant_name),
                getString(R.string.Samakna_Restaurant_desc),
                getString(R.string.Samakna_Restaurant_loc),
                getString(R.string.Samakna_Restaurant_hours),
                getString(R.string.Samakna_Restaurant_phone)));

        PlaceAdapter adapter = new PlaceAdapter(restaurantsArray);
        RecyclerView recyclerView =view.findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
        return view;
    }

}
