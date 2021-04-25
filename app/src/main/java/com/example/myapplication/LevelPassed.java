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
This is displayed when the level is passed
 */

public class LevelPassed extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Get the layout for this SecondFragment
        return inflater.inflate(R.layout.fragment_level_passed, container, false);
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

      MainActivity.passedLevel((MainActivity.getlevel()+1));//says that the next level is unlocked

        view.findViewById(R.id.floatingActionButton3).setOnClickListener(new View.OnClickListener() {//when the home button is clicked
            @Override
            public void onClick(View view) {
               Home();
            }
        });

        view.findViewById(R.id.button_levelPassed_Continue).setOnClickListener(new View.OnClickListener() {//moving to the next level
            @Override
            public void onClick(View view) {
                Home();
            }
        });

        /*
        Direct the user tot he level layout required baised on the level number
         */
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

                }else if((MainActivity.getlevel() == 9)||(MainActivity.getlevel() == 14)){

                    MainActivity.addQuestionNumber();
                    NavHostFragment.findNavController(LevelPassed.this)
                            .navigate(R.id.action_levelPassed_to_secondFragmentFour);


                }

            }
        });
    }

    public void Home(){
        MainActivity.newLevel(MainActivity.getlevel());//ensures the level is correct
        NavHostFragment.findNavController(LevelPassed.this)
                .navigate(R.id.action_levelPassed_to_FirstFragment);//takes to the home page to move to the next level
    }



}