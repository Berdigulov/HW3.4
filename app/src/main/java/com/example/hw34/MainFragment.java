package com.example.hw34;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.hw34.databinding.FragmentMainBinding;

import java.util.ArrayList;

public class MainFragment extends Fragment implements OnItemClick{
    private FragmentMainBinding binding;
    private ArrayList<Continent> continentList;
    private ContinentAdapter adapter;
    public int getKeyId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentAdapter(continentList,this);
        binding.recycler.setAdapter(adapter);
    }

    private void loadData() {
        continentList = new ArrayList<>();
        continentList.add(new Continent("Eurasia","https://upload.wikimedia.org/wikipedia/commons/3/34/Slavic_countries_in_Euroasia.png",1));
        continentList.add(new Continent("Africa","https://p.kindpng.com/picc/s/226-2268507_africa-map-transparent-background-world-map-png-orange.png",2));
        continentList.add(new Continent("Australia","https://www.visitbritain.com/sites/default/files/australia.png",3));
        continentList.add(new Continent("North America","https://thumbs.dreamstime.com/b/great-social-physical-us-republic-zone-shape-white-backdrop-freehand-line-black-ink-hand-drawn-web-global-planet-logo-emblem-226176386.jpg",4));
        continentList.add(new Continent("South America","https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/1-12_South_America_Green-Grey.png/2560px-1-12_South_America_Green-Grey.png",5));

    }

    @Override
    public void onItemClick(int position) {
        Continent continent = adapter.getContinent(position);
        Bundle bundle = new Bundle();
        bundle.putInt("key",continent.getGetKeId());
        Fragment fragment = new DetailFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
    }
}