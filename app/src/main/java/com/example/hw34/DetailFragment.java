package com.example.hw34;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.hw34.databinding.FragmentDetailBinding;

import java.util.ArrayList;

public class DetailFragment extends Fragment implements OnItemClick{

    private ArrayList<Continent> countryList;
    private FragmentDetailBinding binding;
    private ContinentAdapter adapter;
    private Continent continent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentAdapter(countryList,this);
        binding.recycler2.setAdapter(adapter);

    }

    private void loadData() {
        countryList = new ArrayList<>();
        Bundle bundle = new Bundle(getArguments());
        Integer keyId = bundle.getInt("key");
        switch (keyId){
            case 1 :
                countryList.add(new Continent("Russia","https://upload.wikimedia.org/wikipedia/commons/d/d4/Flag_of_Russia.png",6));
                countryList.add(new Continent("France","https://upload.wikimedia.org/wikipedia/commons/6/62/Flag_of_France.png",7));
                countryList.add(new Continent("Spain","https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Flag_of_Spain.svg/2560px-Flag_of_Spain.svg.png",8));
                countryList.add(new Continent("Sweden","https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Flag_of_Sweden.svg/2560px-Flag_of_Sweden.svg.png",9));
                countryList.add(new Continent("Kazakhstan","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kazakhstan.svg/1280px-Flag_of_Kazakhstan.svg.png",10));
                break;
            case 2:
                countryList.add(new Continent("Djibouti","https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Flag_of_Djibouti.svg/2560px-Flag_of_Djibouti.svg.png",6));
                countryList.add(new Continent("Congo","https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Flag_of_the_Democratic_Republic_of_the_Congo.svg/2560px-Flag_of_the_Democratic_Republic_of_the_Congo.svg.png",7));
                countryList.add(new Continent("Togo","https://upload.wikimedia.org/wikipedia/commons/thumb/6/68/Flag_of_Togo.svg/2560px-Flag_of_Togo.svg.png",8));
                countryList.add(new Continent("Sierra Leone","https://upload.wikimedia.org/wikipedia/commons/4/48/Flag_of_Sierra_Leone.png",9));
                countryList.add(new Continent("Tanzania","https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Flag_of_Tanzania.svg/640px-Flag_of_Tanzania.svg.png",10));
                break;
            case 3:
                countryList.add(new Continent("Australia","https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Flag_of_Australia.svg/2560px-Flag_of_Australia.svg.png",6));
                break;
            case 4:
                countryList.add(new Continent("Canada","https://upload.wikimedia.org/wikipedia/en/thumb/c/cf/Flag_of_Canada.svg/1280px-Flag_of_Canada.svg.png",6));
                countryList.add(new Continent("USA","https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/US_flag_large_51_stars.png/1024px-US_flag_large_51_stars.png",7));
                countryList.add(new Continent("Jamaica","https://upload.wikimedia.org/wikipedia/commons/b/b4/Flag_of_Jamaica.png",8));
                countryList.add(new Continent("Cuba","https://upload.wikimedia.org/wikipedia/commons/9/92/Flag_of_Cuba.png",9));
                countryList.add(new Continent("Mexico","https://upload.wikimedia.org/wikipedia/commons/1/17/Flag_of_Mexico.png",10));
                break;
            case 5:
                countryList.add(new Continent("Brazil","https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/2560px-Flag_of_Brazil.svg.png",6));
                countryList.add(new Continent("Peru","https://upload.wikimedia.org/wikipedia/commons/2/2d/Flag_of_Peru.png",7));
                countryList.add(new Continent("Chile","https://upload.wikimedia.org/wikipedia/commons/a/ae/Flag_of_Chile.png",8));
                countryList.add(new Continent("Columbia","https://upload.wikimedia.org/wikipedia/commons/f/f8/Flag_of_Colombia.png",9));
                countryList.add(new Continent("Argentina","https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/2560px-Flag_of_Argentina.svg.png",10));
                break;
        }
    }

    @Override
    public void onItemClick(int position) {

    }
}