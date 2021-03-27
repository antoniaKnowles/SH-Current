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

import java.io.IOException;

public class SecondFragmentTwo extends Fragment {


    public Questions qLib = new Questions();
    public TextView mQuestion1View;
    public TextView mQuestion2View;
    public TextView mQuestion3View;
    public TextView mQuestion4View;
    public TextView mQuestion5View;
    public TextView mQuestion6View;
    public TextView mQuestion7View;
    public TextView mQuestion8View;
    public Button mButtonChoice1;
    public Button mButtonChoice2;

    private String mAnswer;

    private int mQuestionNumber = MainActivity.getQuestionNumber();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Get the layout for this SecondFragment
        return inflater.inflate(R.layout.fragment_second_two, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        mQuestion1View = (TextView) view.findViewById(R.id.textview_second_1_two);
        mQuestion2View = (TextView) view.findViewById(R.id.textview_second_2_two);
        mQuestion3View = (TextView) view.findViewById(R.id.textview_second_3_two);
        mQuestion4View = (TextView) view.findViewById(R.id.textview_second_4_two);
        mQuestion5View = (TextView) view.findViewById(R.id.textview_second_5_two);
        mQuestion6View = (TextView) view.findViewById(R.id.textview_second_6_two);
        mQuestion7View = (TextView) view.findViewById(R.id.textview_second_7_two);
        mQuestion8View = (TextView) view.findViewById(R.id.textview_second_8_two);
        mButtonChoice1 = (Button) view.findViewById(R.id.button_one);
        mButtonChoice2 = (Button) view.findViewById(R.id.button_two);


        qLib.ReadFilesOne();
        updateQuestion();


        view.findViewById(R.id.floatingActionButton_help).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(SecondFragmentTwo.this)
                        .navigate(R.id.action_secondFragmentTwo_to_knowledge);


            }
        });

        view.findViewById(R.id.floatingActionButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(SecondFragmentTwo.this)
                        .navigate(R.id.action_secondFragmentTwo_to_FirstFragment);


            }
        });




        view.findViewById(R.id.button_two_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice2.getText().equals(mAnswer)) {

                    correct();



                }else{
                    Incorrect();

                }



            }
        });


        view.findViewById(R.id.button_one_two).setOnClickListener(new View.OnClickListener() {
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
        mQuestion3View.setText(qLib.getQuestion3(mQuestionNumber));
        mQuestion4View.setText(qLib.getQuestion4(mQuestionNumber));
        mQuestion5View.setText(qLib.getQuestion5(mQuestionNumber));
        mQuestion6View.setText(qLib.getQuestion6(mQuestionNumber));
        mQuestion7View.setText(qLib.getQuestion7(mQuestionNumber));
        mQuestion8View.setText(qLib.getQuestion8(mQuestionNumber));
        mButtonChoice1.setText(qLib.getchoice1(mQuestionNumber));
        mButtonChoice2.setText(qLib.getchoice2(mQuestionNumber));

        mAnswer = qLib.getAns(mQuestionNumber);

        MainActivity.currentAns(mAnswer);

    }

    private void correct(){
        if( MainActivity.checkCompleted() == "Pass"){
            NavHostFragment.findNavController(SecondFragmentTwo.this).navigate(R.id.action_secondFragmentTwo_to_levelPassed);


        }else if( MainActivity.checkCompleted() == "Complete"){
            NavHostFragment.findNavController(SecondFragmentTwo.this).navigate(R.id.action_secondFragmentTwo_to_levelCompleted);

        }else{
            MainActivity.addQuestionNumber();
            NavHostFragment.findNavController(SecondFragmentTwo.this)
                    .navigate(R.id.action_secondFragmentTwo_self);
        }
    }

    private void Incorrect(){

        MainActivity.addIncorrect();

        NavHostFragment.findNavController(SecondFragmentTwo.this)
                .navigate(R.id.action_secondFragmentTwo_to_thirdFragmentTwo);
    }



}