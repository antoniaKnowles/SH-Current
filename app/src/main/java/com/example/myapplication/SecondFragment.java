package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.io.IOException;

public class SecondFragment extends Fragment {


    public Questions qLib = new Questions();
    public TextView mQuestion1View;
    public TextView mQuestion2View;
    public Button mButtonChoice1;
    public Button mButtonChoice2;
    public Button mButtonChoice3;
    public Button mButtonChoice4;
    private String mAnswer;

    private int mQuestionNumber = MainActivity.getQuestionNumber();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

      // Get the layout for this SecondFragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        mQuestion1View = (TextView) view.findViewById(R.id.textview_second);
        mQuestion2View = (TextView) view.findViewById(R.id.textview_second_two);
        mButtonChoice1 = (Button) view.findViewById(R.id.button_one);
        mButtonChoice2 = (Button) view.findViewById(R.id.button_two);
        mButtonChoice3 = (Button) view.findViewById(R.id.button_three);
        mButtonChoice4 = (Button) view.findViewById(R.id.button_four);

        qLib.ReadFilesOne();
        updateQuestion();


        view.findViewById(R.id.floatingActionButton_help).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_knowledge);


            }
        });

        view.findViewById(R.id.floatingActionButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);


            }
        });

        view.findViewById(R.id.button_four).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice4.getText().equals(mAnswer)) {



                    correct();

                }else{

                   Incorrect();


                }

            }
        });

        view.findViewById(R.id.button_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice3.getText().equals(mAnswer)) {

                    correct();

                }else{

                    Incorrect();

                }

            }
        });


        view.findViewById(R.id.button_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice2.getText().equals(mAnswer)) {

                    correct();

                }else{
                    Incorrect();
                }



            }
        });


        view.findViewById(R.id.button_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice1.getText().equals(mAnswer)) {

                  correct();



                }else{


                  Incorrect();

                }

            }
        });


    }

    private void updateQuestion() {
        mQuestion1View.setText(qLib.getQuestion1(mQuestionNumber));//was questions
        mQuestion2View.setText(qLib.getQuestion2(mQuestionNumber));
        mButtonChoice1.setText(qLib.getchoice1(mQuestionNumber));
        mButtonChoice2.setText(qLib.getchoice2(mQuestionNumber));
        mButtonChoice3.setText(qLib.getchoice3(mQuestionNumber));
        mButtonChoice4.setText(qLib.getchoice4(mQuestionNumber));
        mAnswer = qLib.getAns(mQuestionNumber);

        MainActivity.currentAns(mAnswer);

    }

   private void correct(){
       if( MainActivity.checkCompleted() == "Pass"){
           NavHostFragment.findNavController(SecondFragment.this).navigate(R.id.action_SecondFragment_to_levelPassed);

       }else if( MainActivity.checkCompleted() == "Complete"){
           NavHostFragment.findNavController(SecondFragment.this).navigate(R.id.action_SecondFragment_to_levelCompleted);

       }else{
           MainActivity.addQuestionNumber();
           NavHostFragment.findNavController(SecondFragment.this).navigate(R.id.action_SecondFragment_self);
       }
   }

    private void Incorrect(){

        MainActivity.addIncorrect();

        NavHostFragment.findNavController(SecondFragment.this)
                .navigate(R.id.action_SecondFragment_to_thirdFragment);
    }


}



