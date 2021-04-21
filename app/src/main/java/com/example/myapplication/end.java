package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class end extends Fragment {
    /**
     *Last point of the game if all levels have been completed
     */


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Get the layout for this Fragment
        return inflater.inflate(R.layout.fragment_end, container, false);
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_third).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.addQuestionNumber();//Informs the main class that the game is completed

                NavHostFragment.findNavController(end.this)
                        .navigate(R.id.action_end2_to_FirstFragment);//navigates to home page
            }
        });
    }



}