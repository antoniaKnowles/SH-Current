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
    /**
     * This fragment is the home page of the app
     */

    private Button button2;//connected to buttons in xml file, so the ability to deactivate can be used
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
    private int level;//Local variable of level


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ///Gets the lay out for the home fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        /*
        The following pattern controls if the button is available or not to the user,
         this is done by call checked passed in main class, before it is displayed to the user.
         If it is true that the level has already been passed it will then be activated
         */

        button2 =  (Button) view.findViewById(R.id.button_level2);
        button2.setEnabled(MainActivity.checkPassed(2));

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
                //sets the level to the button selected
                level = 1;
                //informs main of selection
                selectionOfLevel(level);
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

        view.findViewById(R.id.button_level2).setOnClickListener(new View.OnClickListener() {//if Level 2 button clicked
            @Override
            public void onClick(View view) {
                //sets the level to the button selected
                level = 2;
                //informs main of selection
                selectionOfLevel(level);
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }


        });

        view.findViewById(R.id.button_level3).setOnClickListener(new View.OnClickListener() {//if Level 3 button clicked
            @Override
            public void onClick(View view) {
                //sets the level to the button selected
                level = 3;
                //informs main of selection
                selectionOfLevel(level);
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

        view.findViewById(R.id.button_level4).setOnClickListener(new View.OnClickListener() {//if Level 4 button clicked
            @Override
            public void onClick(View view) {
                //sets the level to the button selected
                level= 4;
                //informs main of selection
                selectionOfLevel(level);
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentThree);

            }
        });

        view.findViewById(R.id.button_level5).setOnClickListener(new View.OnClickListener() {//if Level 5 button clicked
            @Override
            public void onClick(View view) {
                //sets the level to the button selected
                level=5;
                //informs main of selection
                selectionOfLevel(level);
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentTwo);

            }
        });

        view.findViewById(R.id.button_level6).setOnClickListener(new View.OnClickListener() {//if Level 6 button clicked
            @Override
            public void onClick(View view) {
                //sets the level to the button selected
                level = 6;
                //informs main of selection
                selectionOfLevel(level);
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentTwo);

            }
        });

        view.findViewById(R.id.button_level7).setOnClickListener(new View.OnClickListener() {//if Level 7 button clicked
            @Override
            public void onClick(View view) {
                //sets the level to the button selected
                level = 7;
                //informs main of selection
                selectionOfLevel(level);
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

        view.findViewById(R.id.button_level8).setOnClickListener(new View.OnClickListener() {//if Level 8 button clicked
            @Override
            public void onClick(View view) {
                //sets the level to the button selected
                level = 8;
                //informs main of selection
                selectionOfLevel(level);
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentThree);

            }
        });

        view.findViewById(R.id.button_level9).setOnClickListener(new View.OnClickListener() {//if Level 9 button clicked
            @Override
            public void onClick(View view) {
                //sets the level to the button selected
                level = 9;
                //informs main of selection
                selectionOfLevel(level);
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentFour);

            }
        });


        view.findViewById(R.id.button_level10).setOnClickListener(new View.OnClickListener() {//if Level 10 button clicked
            @Override
            public void onClick(View view) {
                //sets the level to the button selected
                level = 10;
                //informs main of selection
                selectionOfLevel(level);
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

        view.findViewById(R.id.button_level11).setOnClickListener(new View.OnClickListener() {//if Level 11 button clicked
            @Override
            public void onClick(View view) {
                //sets the level to the button selected
                level = 11;
                //informs main of selection
                selectionOfLevel(level);
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });


        view.findViewById(R.id.button_level12).setOnClickListener(new View.OnClickListener() {//if Level 12 button clicked
            @Override
            public void onClick(View view) {
                //sets the level to the button selected
                level = 12;
                //informs main of selection
                selectionOfLevel(level);
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentThree);

            }
        });

        view.findViewById(R.id.button_level13).setOnClickListener(new View.OnClickListener() {//if Level 13 button clicked
            @Override
            public void onClick(View view) {
                //sets the level to the button selected
                level = 13;
                //informs main of selection
                selectionOfLevel(level);
                //Direct to the second fragment
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_secondFragmentThree);

            }
        });

        view.findViewById(R.id.button_level14).setOnClickListener(new View.OnClickListener() {//if Level 14 button clicked
            @Override
            public void onClick(View view) {
                //sets the level to the button selected
                level = 14;
                //informs main of selection
                selectionOfLevel(level);
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


    /*
    This method splits up what needs to be changed in main to start a new level,
    This includes storing the information about the most recent one and then
     checking the level selected hasn't already been played, in which case it is re loaded
     */
    public void selectionOfLevel(int i){
        MainActivity.setlevel(i);
        MainActivity.getOldLevel(i);
        MainActivity.passedLevel(i);
    }
}