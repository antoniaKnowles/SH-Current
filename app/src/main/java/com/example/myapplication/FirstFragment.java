package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Get the layout for this FirstFragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {


                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

        view.findViewById(R.id.button_level2).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {

              //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });


        view.findViewById(R.id.button_Knowledge).setOnClickListener(new View.OnClickListener() {//if Knowledge button selected
            @Override
            public void onClick(View view) {
                //Direct to Knowledge fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_knowledge);
            }
        });
    }
}