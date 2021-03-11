package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends Fragment {


    private Questions qLib = new Questions();

    private TextView mScoreView;
    private TextView mQuestion1View;
    private TextView mQuestion2View;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private String mAnswer;

    private int mQuestionNumber = MainActivity.getQuestionNumber();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);




        mQuestion1View = (TextView)view.findViewById(R.id.textview_second);
        mQuestion2View = (TextView)view.findViewById(R.id.textview_second_two);
        mButtonChoice1 = (Button)view.findViewById(R.id.button_one);
        mButtonChoice2 = (Button) view.findViewById(R.id.button_two);
        mButtonChoice3 = (Button)view.findViewById(R.id.button_three);
        mButtonChoice4 = (Button)view.findViewById(R.id.button_four);

        updateQuestion();



        view.findViewById(R.id.floatingActionButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    NavHostFragment.findNavController(SecondFragment.this)
                            .navigate(R.id.action_SecondFragment_to_FirstFragment);


            }
        });

        view.findViewById(R.id.button_four).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice4.getText() == mAnswer){

                    MainActivity.addQuestionNumber();

                    NavHostFragment.findNavController(SecondFragment.this)
                            .navigate(R.id.action_SecondFragment_self);

                }
                if(mButtonChoice4.getText() != mAnswer) {


                    NavHostFragment.findNavController(SecondFragment.this)
                            .navigate(R.id.action_SecondFragment_to_thirdFragment);

                }

            }
        });

        view.findViewById(R.id.button_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice3.getText() == mAnswer){

                    MainActivity.addQuestionNumber();

                    NavHostFragment.findNavController(SecondFragment.this)
                            .navigate(R.id.action_SecondFragment_self);

                }

                if(mButtonChoice3.getText() != mAnswer) {


                    NavHostFragment.findNavController(SecondFragment.this)
                            .navigate(R.id.action_SecondFragment_to_thirdFragment);

                }

            }
        });



        view.findViewById(R.id.button_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice2.getText() == mAnswer){

                    MainActivity.addQuestionNumber();

                    NavHostFragment.findNavController(SecondFragment.this)
                            .navigate(R.id.action_SecondFragment_self);

                }

                if(mButtonChoice2.getText() != mAnswer) {


                    NavHostFragment.findNavController(SecondFragment.this)
                            .navigate(R.id.action_SecondFragment_to_thirdFragment);

                }

            }
        });




        view.findViewById(R.id.button_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice1.getText() == mAnswer){

                    MainActivity.addQuestionNumber();

                    NavHostFragment.findNavController(SecondFragment.this)
                            .navigate(R.id.action_SecondFragment_self);

                }

                if(mButtonChoice1.getText() != mAnswer) {


                    NavHostFragment.findNavController(SecondFragment.this)
                            .navigate(R.id.action_SecondFragment_to_thirdFragment);

                }

            }
        });








    }

    private void updateQuestion(){
        mQuestion1View.setText(Questions.getQuestion1(mQuestionNumber));
        mQuestion2View.setText(Questions.getQuestion2(mQuestionNumber));
        mButtonChoice1.setText(Questions.getchoice1(mQuestionNumber));
        mButtonChoice2.setText(Questions.getchoice2(mQuestionNumber));
        mButtonChoice3.setText(Questions.getchoice3(mQuestionNumber));
        mButtonChoice4.setText(Questions.getchoice4(mQuestionNumber));
        mAnswer = Questions.getAns(mQuestionNumber);

    }



}