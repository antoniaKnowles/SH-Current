package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {

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
    private int level;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       // NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_loginFragment);
        // Get the layout for this FirstFragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        button2 =  (Button) view.findViewById(R.id.button_level2);
        button2.setEnabled(true);//(MainActivity.checkPassed(2))

        button3 =  (Button) view.findViewById(R.id.button_level3);
        button3.setEnabled(true);

        button4 =  (Button) view.findViewById(R.id.button_level4);
        button4.setEnabled(true);

        button5 =  (Button) view.findViewById(R.id.button_level5);
        button5.setEnabled(true);

        button6 =  (Button) view.findViewById(R.id.button_level6);
        button6.setEnabled(true);

        button7 =  (Button) view.findViewById(R.id.button_level7);
        button7.setEnabled(true);

        button8 =  (Button) view.findViewById(R.id.button_level8);
        button8.setEnabled(true);

        button9 =  (Button) view.findViewById(R.id.button_level9);
        button9.setEnabled(true);

        button10 =  (Button) view.findViewById(R.id.button_level10);
        button10.setEnabled(true);

        button11 =  (Button) view.findViewById(R.id.button_level11);
        button11.setEnabled(true);

        button12 =  (Button) view.findViewById(R.id.button_level12);
        button12.setEnabled(true);

        button13 =  (Button) view.findViewById(R.id.button_level13);
        button13.setEnabled(true);

        button14 =  (Button) view.findViewById(R.id.button_level14);
        button14.setEnabled(true);


        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                level = 1;
                selectionOfLevel(level);
                //check if pervios have been played if do pull
                // MainActivity.getOldLevel(1);
               //  MainActivity.passedLevel(1);
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

        view.findViewById(R.id.button_level2).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                level = 2;
                selectionOfLevel(level);

                 //change qestions to second level
                //check if pervios have been played if do pull
               // MainActivity.newLevel(2);
              //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }


        });

        view.findViewById(R.id.button_level3).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                level = 3;
                selectionOfLevel(level);

                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

        view.findViewById(R.id.button_level4).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                level= 4;
                selectionOfLevel(level);

                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentThree);

            }
        });

        view.findViewById(R.id.button_level5).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                level=5;
                selectionOfLevel(level);

                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentTwo);

            }
        });

        view.findViewById(R.id.button_level6).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                level = 6;
                selectionOfLevel(level);

                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentTwo);

            }
        });

        view.findViewById(R.id.button_level7).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                level = 7;
                selectionOfLevel(level);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

        view.findViewById(R.id.button_level8).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                level = 8;
                selectionOfLevel(level);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentThree);

            }
        });

        view.findViewById(R.id.button_level9).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                level = 9;
                selectionOfLevel(level);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentFour);

            }
        });


        view.findViewById(R.id.button_level10).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                level = 10;
                selectionOfLevel(level);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

        view.findViewById(R.id.button_level11).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                level = 11;
                selectionOfLevel(level);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });


        view.findViewById(R.id.button_level12).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                level = 12;
                selectionOfLevel(level);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentThree);

            }
        });

        view.findViewById(R.id.button_level13).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                level = 13;
                selectionOfLevel(level);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentThree);

            }
        });

        view.findViewById(R.id.button_level14).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                level = 14;
                selectionOfLevel(level);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentFour);

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

    public void selectionOfLevel(int i){
        MainActivity.setlevel(i);
        MainActivity.getOldLevel(i);
        MainActivity.passedLevel(i);
    }
}