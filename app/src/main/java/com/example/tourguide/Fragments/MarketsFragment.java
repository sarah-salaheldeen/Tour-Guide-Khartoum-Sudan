package com.example.tourguide.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tourguide.Place;
import com.example.tourguide.PlaceAdapter;
import com.example.tourguide.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MarketsFragment extends Fragment {

    View view;


    public MarketsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.list, container, false);

        ArrayList<Place> marketsArray = new ArrayList<>();
        marketsArray.add(new Place(R.drawable.saad_market,
                getString(R.string.Saad_Gishra_Market_name),
                getString(R.string.Saad_Gishra_Market_desc),
                getString(R.string.Saad_Gishra_Market_loc),
                getString(R.string.Saad_Gishra_Market_hours),
                getString(R.string.Saad_Gishra_Market_phone)));

        marketsArray.add(new Place(R.drawable.central_market,
                getString(R.string.Central_Market_name),
                getString(R.string.Central_Market_desc),
                getString(R.string.Central_Market_loc),
                getString(R.string.Central_Market_hours),
                ""));

        marketsArray.add(new Place(R.drawable.anfal,
                getString(R.string.AlAnfal_Super_Market_name),
                getString(R.string.AlAnfal_Super_Market_desc),
                getString(R.string.AlAnfal_Super_Market_loc),
                getString(R.string.working_hours_24),
                getString(R.string.AlAnfal_Super_Market_phone)));

        marketsArray.add(new Place(R.drawable.alwaha_mall,
                getString(R.string.AlWaha_Mall_name),
                getString(R.string.AlWaha_Mall_desc),
                "Abdul Moneim Mohammed Street، Khartoum, Sudan",
                getString(R.string.AlWaha_Mall_hours),
                getString(R.string.AlWaha_Mall_phone)));

        PlaceAdapter adapter = new PlaceAdapter(marketsArray);
        RecyclerView recyclerView =view.findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
        return view;
    }

}
