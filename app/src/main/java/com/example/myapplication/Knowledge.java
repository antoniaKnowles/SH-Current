package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Knowledge extends Fragment {

    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    public int selected;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Get the layout for knowledge Fragment
        return inflater.inflate(R.layout.fragment_knowledge, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        button2 =  (Button) view.findViewById(R.id.button_Knowledge2);
        button2.setEnabled(true);//(MainActivity.checkPassed(2))

        button3 =  (Button) view.findViewById(R.id.button_Knowledge3);
        button3.setEnabled(true);

        button4 =  (Button) view.findViewById(R.id.button_Knowledge4);
        button4.setEnabled(true);

        button5 =  (Button) view.findViewById(R.id.button_Knowledge5);
        button5.setEnabled(true);

        button6 =  (Button) view.findViewById(R.id.button_Knowledge6);
        button6.setEnabled(true);

        button7 =  (Button) view.findViewById(R.id.button_Knowledge7);
        button7.setEnabled(true);

        button8 =  (Button) view.findViewById(R.id.button_Knowledge8);
        button8.setEnabled(true);

        button9 =  (Button) view.findViewById(R.id.button_Knowledge9);
        button9.setEnabled(true);

        button10 =  (Button) view.findViewById(R.id.button_Knowledge10);
        button10.setEnabled(true);

        button11 =  (Button) view.findViewById(R.id.button_Knowledge11);
        button11.setEnabled(true);

        button12 =  (Button) view.findViewById(R.id.button_Knowledge12);
        button12.setEnabled(true);

        button13 =  (Button) view.findViewById(R.id.button_Knowledge13);
        button13.setEnabled(true);

        button14 =  (Button) view.findViewById(R.id.button_Knowledge14);
        button14.setEnabled(true);



        view.findViewById(R.id.button_Knowledge1).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                selected = 1;
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledgeLevel1);//Take back to home fragment


            }
        });

        view.findViewById(R.id.floatingActionButtonhome).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_FirstFragment);//Take back to home fragment


            }
        });


    }
}