package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.fragment.NavHostFragment;

public class Knowledge_Information extends Fragment {
    public TextView mQuestion1View;
    //Knowledge k = new Knowledge();




    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Get the layout for the first knowledge Fragment
        return inflater.inflate(R.layout.fragment_knowledge__information, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       // Knowledge k = new Knowledge(); - mQuestion1View.setText(R.string.Variable);
        mQuestion1View = (TextView) view.findViewById(R.id.textview_first_text);
       switch( MainActivity.getSelectedHelp()) {
            case 1: mQuestion1View.setText(R.string.Variable); break;
       }


        view.findViewById(R.id.floatingActionButton2).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(Knowledge_Information.this).navigate(R.id.action_knowledge_Information_to_FirstFragment);//Take back to home fragment


            }
        });
        view.findViewById(R.id.floatingActionButton_help).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(Knowledge_Information.this).navigate(R.id.action_knowledge_Information_to_knowledge);//Take back to home fragment


            }
        });


    }


}