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

/*
Question level for 2 question lines and 2 answers
 */

public class SecondFragmentThree extends Fragment {


    public Questions q = new Questions();//creates the questions file
    public TextView Question1;//variable for the first line of the question
    public TextView Question2;//variable for the second line of the question
    public Button ButtonChoice1;//variable for button 1
    public Button ButtonChoice2;//variable for button 2


    private String Answer;//variable for the answer to be stored

    private int QuestionNumber = MainActivity.getQuestionNumber();//get the question number in-case they are continuing the level

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Get the layout for this SecondFragment
        return inflater.inflate(R.layout.fragment_second_three, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

/*
      Gets the textView and buttons from xml layout, so they can be edited
       */

        Question1 = (TextView) view.findViewById(R.id.textview_second_three);
        Question2 = (TextView) view.findViewById(R.id.textview_second_two_three);
        ButtonChoice1 = (Button) view.findViewById(R.id.button_one_three);
        ButtonChoice2 = (Button) view.findViewById(R.id.button_two_three);


        q.ReadFilesOne();//reads in the file
        updateQuestion();//updates the question as this is called for every separate question


        view.findViewById(R.id.floatingActionButton_help).setOnClickListener(new View.OnClickListener() {// if the help button is clicked
            @Override
            public void onClick(View view) {

                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(SecondFragmentThree.this)
                        .navigate(R.id.action_secondFragmentThree_to_knowledge);//passes the user to knowledge


            }
        });

        view.findViewById(R.id.floatingActionButton2).setOnClickListener(new View.OnClickListener() {//if the home button is clicked
            @Override
            public void onClick(View view) {

                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(SecondFragmentThree.this)
                        .navigate(R.id.action_secondFragmentThree_to_FirstFragment);//passes the user to the home page


            }
        });


/*
Checks that the button selected is correct or incorrect
 */

        view.findViewById(R.id.button_two_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (ButtonChoice2.getText().equals(Answer)) {


                 correct();


                }else{

               Incorrect();
                }



            }
        });


        view.findViewById(R.id.button_one_three).setOnClickListener(new View.OnClickListener() {
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

    private void updateQuestion() {
        Question1.setText(q.getQuestion1(QuestionNumber));//resits questions
        Question2.setText(q.getQuestion2(QuestionNumber));//resits questions
        ButtonChoice1.setText(q.getchoice1(QuestionNumber));//resits button
        ButtonChoice2.setText(q.getchoice2(QuestionNumber));//resits button

        Answer = q.getAns(QuestionNumber);//answers saved

        MainActivity.currentAns(Answer);

    }

    private void correct(){
        if( MainActivity.checkCompleted() == "Pass"){//checked if passed level
            NavHostFragment.findNavController(SecondFragmentThree.this).navigate(R.id.action_secondFragmentThree_to_levelPassed);

        }else if( MainActivity.checkCompleted() == "Complete"){//checked if level competed
            NavHostFragment.findNavController(SecondFragmentThree.this).navigate(R.id.action_secondFragmentThree_to_levelCompleted);

        }else{
            MainActivity.addQuestionNumber();
            NavHostFragment.findNavController(SecondFragmentThree.this).navigate(R.id.action_secondFragmentThree_self);
        }
    }

    private void Incorrect(){//incorrect level

        MainActivity.addIncorrect();

        NavHostFragment.findNavController(SecondFragmentThree.this)
                .navigate(R.id.action_secondFragmentThree_to_thirdFragmentThree);
    }


}