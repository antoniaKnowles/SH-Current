package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class LevelCompleted extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Get the layout for this SecondFragment
        return inflater.inflate(R.layout.fragment_level_completed, container, false);
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);





        view.findViewById(R.id.floatingActionButton3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.resetLevel();

                NavHostFragment.findNavController(LevelCompleted.this)
                        .navigate(R.id.action_levelCompleted_to_FirstFragment);


            }
        });

        view.findViewById(R.id.button_levelComplete_Continue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               MainActivity.resetLevel();

                NavHostFragment.findNavController(LevelCompleted.this)
                        .navigate(R.id.action_levelCompleted_to_FirstFragment);
            }
        });


    }



}