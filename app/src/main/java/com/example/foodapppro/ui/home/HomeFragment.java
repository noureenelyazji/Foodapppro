package com.example.foodapppro.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapppro.R;
import com.example.foodapppro.adapters.HomeHorAdapter;
import com.example.foodapppro.adapters.HomeVerAdapter;
import com.example.foodapppro.databinding.FragmentHomeBinding;
import com.example.foodapppro.models.HomeHorModel;
import com.example.foodapppro.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView homeHorizontaRec ,homeVerticalRec;
    List<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;
    List<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root =inflater.inflate(R.layout.fragment_home,container,false);

        homeHorizontaRec =root.findViewById(R.id.home_hor_rec);
        homeVerticalRec=  root.findViewById(R.id.home_ver_rec);


        ////////////////hor

        homeHorModelList =new ArrayList<>();
        homeHorModelList.add(new HomeHorModel(R.drawable.pizza,"pizza"));
        homeHorModelList.add(new HomeHorModel(R.drawable.burger,"Burger"));
        homeHorModelList.add(new HomeHorModel(R.drawable.fried,"fries"));
        homeHorModelList.add(new HomeHorModel(R.drawable.ice,"Ice cream"));
        homeHorModelList.add(new HomeHorModel(R.drawable.sandwich,"Sandwich"));
        homeHorAdapter =new HomeHorAdapter(getActivity(),homeHorModelList);
        homeHorizontaRec.setAdapter(homeHorAdapter);
        homeHorizontaRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontaRec.setHasFixedSize(true);
        homeHorizontaRec.setNestedScrollingEnabled(false);


        ////////////////ver
        homeVerModelList =new ArrayList<>();
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza,"pizza","10:00-23:00","4.9","min -> $45"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza,"pizza","10:00-23:00","4.9","min -> $45"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza,"pizza","10:00-23:00","4.9","min -> $45"));
        homeVerAdapter =new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        homeVerticalRec.setHasFixedSize(true);
        homeVerticalRec.setNestedScrollingEnabled(false);
        return root;
    }

}