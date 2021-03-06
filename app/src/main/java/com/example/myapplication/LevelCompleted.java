package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
/*
This class is used when the level has been completed
 */

public class LevelCompleted extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Get the layout for this SecondFragment
        return inflater.inflate(R.layout.fragment_level_completed, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.floatingActionButton3).setOnClickListener(new View.OnClickListener() {//when help button is selected
            @Override
            public void onClick(View view) {
                Home();
            }
        });

        view.findViewById(R.id.button_levelComplete_Continue).setOnClickListener(new View.OnClickListener() {//when compleete button is selected
            @Override
            public void onClick(View view) {
                Home();
            }
        });
    }

    public void Home(){
        MainActivity.resetLevel();//resets the level so it can begin again
        NavHostFragment.findNavController(LevelCompleted.this).navigate(R.id.action_levelCompleted_to_FirstFragment);//moves the user back to home
    }

}