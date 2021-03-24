package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Knowledge extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Get the layout for knowledge Fragment
        return inflater.inflate(R.layout.fragment_knowledge, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.floatingActionButton2).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_FirstFragment);//Take back to home fragment


            }
        });



    }
}