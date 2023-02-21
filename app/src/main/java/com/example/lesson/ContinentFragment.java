package com.example.lesson;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lesson.databinding.FragmentFirstBinding;

import java.util.ArrayList;


public class ContinentFragment extends Fragment implements OnItemClick{

    private FragmentFirstBinding binding;

    private ArrayList<Continent> continentList;

    private ContinentAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentAdapter(continentList, this);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        continentList = new ArrayList<>();

        continentList.add(new Continent("Австралия"));
        continentList.add(new Continent("Африка"));
        continentList.add(new Continent("Евразия"));
        continentList.add(new Continent("Южная Америка"));
        continentList.add(new Continent("Северная Америка"));

    }

    @Override
    public void onClick(Integer position) {
    Bundle bundle = new Bundle();
    bundle.putInt("Key", position);
    CountryFragment countryFragment = new CountryFragment();
    countryFragment.setArguments(bundle);
    requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, countryFragment).addToBackStack(null).commit();

    }
}