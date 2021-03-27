package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class LevelPassed extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Get the layout for this SecondFragment
        return inflater.inflate(R.layout.fragment_level_passed, container, false);
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


      MainActivity.passedLevel((MainActivity.getlevel()+1));


        view.findViewById(R.id.floatingActionButton3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(LevelPassed.this)
                        .navigate(R.id.action_levelPassed_to_FirstFragment);


            }
        });

        view.findViewById(R.id.button_levelPassed_Continue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(LevelPassed.this)
                        .navigate(R.id.action_levelPassed_to_FirstFragment);
            }
        });

        view.findViewById(R.id.button_levelPassed_More).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if((MainActivity.getlevel() == 1)||(MainActivity.getlevel() == 2)||(MainActivity.getlevel() == 3)||(MainActivity.getlevel() == 7)||(MainActivity.getlevel() == 10)||(MainActivity.getlevel() == 11)) {
                    MainActivity.addQuestionNumber();
                    NavHostFragment.findNavController(LevelPassed.this)
                            .navigate(R.id.action_levelPassed_to_SecondFragment);
                } else if((MainActivity.getlevel() != 5)&&(MainActivity.getlevel() != 6)&&(MainActivity.getlevel() != 14)&&(MainActivity.getlevel() != 9)) {
                    MainActivity.addQuestionNumber();
                    NavHostFragment.findNavController(LevelPassed.this)
                            .navigate(R.id.action_levelPassed_to_secondFragmentThree);
                } else if((MainActivity.getlevel() == 5)||(MainActivity.getlevel() == 6)) {
                    MainActivity.addQuestionNumber();
                    NavHostFragment.findNavController(LevelPassed.this)
                            .navigate(R.id.action_levelPassed_to_secondFragmentTwo);
                }
                //else{pass to 9/14
            }
        });
    }



}