package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.fragment.NavHostFragment;

class KnowledgeLevel1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Get the layout for the first knowledge Fragment
        return inflater.inflate(R.layout.fragment_knowledge_level1, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.floatingActionButton2).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(KnowledgeLevel1.this).navigate(R.id.action_knowledge_to_FirstFragment);//Take back to home fragment


            }
        });
        view.findViewById(R.id.floatingActionButton_help).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(KnowledgeLevel1.this).navigate(R.id.action_knowledgeLevel1_to_knowledge);//Take back to home fragment


            }
        });


    }

}