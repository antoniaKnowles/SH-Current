package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Get the layout for this FirstFragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        button2 =  (Button) view.findViewById(R.id.button_level2);
        button2.setEnabled((MainActivity.checkPassed(2)));

        button3 =  (Button) view.findViewById(R.id.button_level3);
        button3.setEnabled(MainActivity.checkPassed(3));

        button4 =  (Button) view.findViewById(R.id.button_level4);
        button4.setEnabled(MainActivity.checkPassed(4));

        button5 =  (Button) view.findViewById(R.id.button_level5);
        button5.setEnabled(MainActivity.checkPassed(5));

        button6 =  (Button) view.findViewById(R.id.button_level6);
        button6.setEnabled(MainActivity.checkPassed(6));

        button7 =  (Button) view.findViewById(R.id.button_level7);
        button7.setEnabled(MainActivity.checkPassed(7));

        button8 =  (Button) view.findViewById(R.id.button_level8);
        button8.setEnabled(MainActivity.checkPassed(8));

        button9 =  (Button) view.findViewById(R.id.button_level9);
        button9.setEnabled(MainActivity.checkPassed(9));

        button10 =  (Button) view.findViewById(R.id.button_level10);
        button10.setEnabled(MainActivity.checkPassed(10));

        button11 =  (Button) view.findViewById(R.id.button_level11);
        button11.setEnabled(MainActivity.checkPassed(11));

        button12 =  (Button) view.findViewById(R.id.button_level12);
        button12.setEnabled(MainActivity.checkPassed(12));

        button13 =  (Button) view.findViewById(R.id.button_level13);
        button13.setEnabled(MainActivity.checkPassed(13));

        button14 =  (Button) view.findViewById(R.id.button_level14);
        button14.setEnabled(MainActivity.checkPassed(14));


        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {

                //check if pervios have been played if do pull
                 MainActivity.getOldLevel(1);
                 MainActivity.passedLevel(1);
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

        view.findViewById(R.id.button_level2).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {

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
                MainActivity.newLevel(3);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

        view.findViewById(R.id.button_level4).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                MainActivity.newLevel(4);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentTwo);

            }
        });

        view.findViewById(R.id.button_level5).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
              MainActivity.newLevel(5);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentThree);

            }
        });

        view.findViewById(R.id.button_level6).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
               MainActivity.newLevel(6);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentThree);

            }
        });

        view.findViewById(R.id.button_level7).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
               MainActivity.newLevel(7);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

        view.findViewById(R.id.button_level8).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
              MainActivity.newLevel(8);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentTwo);

            }
        });


        view.findViewById(R.id.button_level10).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
              MainActivity.newLevel(10);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

        view.findViewById(R.id.button_level11).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
               MainActivity.newLevel(11);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });


        view.findViewById(R.id.button_level12).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                MainActivity.newLevel(12);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentTwo);

            }
        });

        view.findViewById(R.id.button_level13).setOnClickListener(new View.OnClickListener() {//if Level 1 button clicked
            @Override
            public void onClick(View view) {
                MainActivity.newLevel(13);
                //  MainActivity.readIn2();
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentTwo);

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