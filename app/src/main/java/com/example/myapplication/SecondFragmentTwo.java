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



public class SecondFragmentTwo extends Fragment {


    public Questions q = new Questions();//creates the questions file
    public TextView Question1;//variable for the line of the question
    public TextView Question2;
    public TextView Question3;
    public TextView Question4;
    public TextView Question5;
    public TextView Question6;
    public TextView Question7;
    public TextView Question8;
    public Button ButtonChoice1;//variable for button
    public Button ButtonChoice2;

    private String Answer;//variable for the answer to be stored

    private int QuestionNumber = MainActivity.getQuestionNumber();//get the question number in-case they are continuing the level

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Get the layout for this SecondFragment
        return inflater.inflate(R.layout.fragment_second_two, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

         /*
      Gets the textView and buttons from xml layout, so they can be edited
       */

        Question1 = (TextView) view.findViewById(R.id.textview_second_1_two);
        Question2 = (TextView) view.findViewById(R.id.textview_second_2_two);
        Question3 = (TextView) view.findViewById(R.id.textview_second_3_two);
        Question4 = (TextView) view.findViewById(R.id.textview_second_4_two);
        Question5 = (TextView) view.findViewById(R.id.textview_second_5_two);
        Question6 = (TextView) view.findViewById(R.id.textview_second_6_two);
        Question7 = (TextView) view.findViewById(R.id.textview_second_7_two);
        Question8 = (TextView) view.findViewById(R.id.textview_second_8_two);
        ButtonChoice1 = (Button) view.findViewById(R.id.button_one_two);
        ButtonChoice2 = (Button) view.findViewById(R.id.button_two_two);


        q.ReadFilesOne();//reads in the file
        updateQuestion();//updates the question as this is called for every separate question


        view.findViewById(R.id.floatingActionButton_help).setOnClickListener(new View.OnClickListener() {//help button
            @Override
            public void onClick(View view) {

                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(SecondFragmentTwo.this)
                        .navigate(R.id.action_secondFragmentTwo_to_knowledge);


            }
        });

        view.findViewById(R.id.floatingActionButton2).setOnClickListener(new View.OnClickListener() {//menu button
            @Override
            public void onClick(View view) {

                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(SecondFragmentTwo.this)
                        .navigate(R.id.action_secondFragmentTwo_to_FirstFragment);


            }
        });




        view.findViewById(R.id.button_two_two).setOnClickListener(new View.OnClickListener() {//answer button
            @Override
            public void onClick(View view) {


                if (ButtonChoice2.getText().equals(Answer)) {

                    correct();

                }else{
                    Incorrect();

                }

            }
        });


        view.findViewById(R.id.button_one_two).setOnClickListener(new View.OnClickListener() {//answer button
            @Override
            public void onClick(View view) {


                if (ButtonChoice1.getText().equals(Answer)) {

                    correct();



                }else{

                    Incorrect();




                }

            }
        });


    }
/*
Gets the questions and updates the buttons
 */
    private void updateQuestion() {
        Question1.setText(q.getQuestion1(QuestionNumber));
        Question2.setText(q.getQuestion2(QuestionNumber));
        Question3.setText(q.getQuestion3(QuestionNumber));
        Question4.setText(q.getQuestion4(QuestionNumber));
        Question5.setText(q.getQuestion5(QuestionNumber));
        Question6.setText(q.getQuestion6(QuestionNumber));
        Question7.setText(q.getQuestion7(QuestionNumber));
        Question8.setText(q.getQuestion8(QuestionNumber));
        ButtonChoice1.setText(q.getchoice1(QuestionNumber));
        ButtonChoice2.setText(q.getchoice2(QuestionNumber));

        Answer = q.getAns(QuestionNumber);

        MainActivity.currentAns(Answer);

    }

    private void correct(){
        if( MainActivity.checkCompleted() == "Pass"){//check if the user has passed
            NavHostFragment.findNavController(SecondFragmentTwo.this).navigate(R.id.action_secondFragmentTwo_to_levelPassed);


        }else if( MainActivity.checkCompleted() == "Complete"){//check if it is compelte
            NavHostFragment.findNavController(SecondFragmentTwo.this).navigate(R.id.action_secondFragmentTwo_to_levelCompleted);

        }else{
            MainActivity.addQuestionNumber();
            NavHostFragment.findNavController(SecondFragmentTwo.this)
                    .navigate(R.id.action_secondFragmentTwo_self);
        }
    }

    private void Incorrect(){//if incorrect

        MainActivity.addIncorrect();

        NavHostFragment.findNavController(SecondFragmentTwo.this)
                .navigate(R.id.action_secondFragmentTwo_to_thirdFragmentTwo);
    }



}