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
public class HotelsFragment extends Fragment {

    View view;


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.list, container, false);

        ArrayList<Place> HotelsArray = new ArrayList<>();
        HotelsArray.add(new Place(R.drawable.salam,
                getString(R.string.Al_Salam_Rotana_name),
                getString(R.string.Al_Salam_Rotana_desc),
                getString(R.string.Al_Salam_Rotana_loc),
                getString(R.string.working_hours_24),
                getString(R.string.Al_Salam_Rotana_phone)));

        HotelsArray.add(new Place(R.drawable.grand_villa,
                getString(R.string.Grand_Holiday_name),
                getString(R.string.Grand_Holiday_desc),
                getString(R.string.khartoum_sudan_loc),
                getString(R.string.working_hours_24),
                getString(R.string.Grand_Holiday_phone)));

        HotelsArray.add(new Place(R.drawable.corinthia,
                getString(R.string.Corinthia_Hotel_name),
                getString(R.string.Corinthia_Hotel_desc),
                getString(R.string.khartoum_sudan_loc),
                getString(R.string.working_hours_24),
                getString(R.string.Corinthia_Hotel_phone)));

        PlaceAdapter adapter = new PlaceAdapter(HotelsArray);
        RecyclerView recyclerView =view.findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
        return view;
    }

}
