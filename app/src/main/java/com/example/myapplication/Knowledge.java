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
    public int selected = 0;

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
        button9.setEnabled(false);

        button10 =  (Button) view.findViewById(R.id.button_Knowledge10);
        button10.setEnabled(true);

        button11 =  (Button) view.findViewById(R.id.button_Knowledge11);
        button11.setEnabled(true);

        button12 =  (Button) view.findViewById(R.id.button_Knowledge12);
        button12.setEnabled(true);

        button13 =  (Button) view.findViewById(R.id.button_Knowledge13);
        button13.setEnabled(true);

        button14 =  (Button) view.findViewById(R.id.button_Knowledge14);
        button14.setEnabled(false);



        view.findViewById(R.id.button_Knowledge1).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(1);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment

            }
        });

        view.findViewById(R.id.button_Knowledge2).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(2);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment

            }
        });

        view.findViewById(R.id.button_Knowledge3).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(3);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
             }
        });
        view.findViewById(R.id.button_Knowledge4).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(4);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge5).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(5);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge6).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(6);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge7).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(7);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge8).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(8);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge9).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(9);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge10).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(10);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge11).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(11);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge12).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(12);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge13).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(13);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge14).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(14);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });


        view.findViewById(R.id.floatingActionButtonhome).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_FirstFragment);//Take back to home fragment


            }
        });


    }

    public int getSelected(){
        return selected;
    }
}