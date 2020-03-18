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
public class AttractionsFragment extends Fragment {

    View view;


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.list, container, false);

        ArrayList<Place> attractionsArray = new ArrayList<>();
        attractionsArray.add(new Place(R.drawable.nubian_pyramids,
                getString(R.string.Nubian_pyramids_name),
                getString(R.string.Nubian_pyramids_desc),
                getString(R.string.khartoum_sudan_loc),
                getString(R.string.working_hours_24),
                ""));

        attractionsArray.add(new Place(R.drawable.sudan_nat_museum,
                getString(R.string.National_Museum_name),
                getString(R.string.National_Museum_desc),
                getString(R.string.National_Museum_loc),
                getString(R.string.National_Museum_hours),
                getString(R.string.National_Museum_phone)));

        attractionsArray.add(new Place(R.drawable.tuti_island,
                getString(R.string.Tuti_Island_name),
                getString(R.string.Tuti_Island_desc),
                getString(R.string.khartoum_sudan_loc),
                getString(R.string.working_hours_24),
                ""));

        PlaceAdapter adapter = new PlaceAdapter(attractionsArray);
        RecyclerView recyclerView =view.findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
        return view;
    }
    }
