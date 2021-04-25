package com.example.myapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;

import android.widget.ImageView;


import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;

import androidx.navigation.fragment.NavHostFragment;
/*
This question file is for level 9 and 14 as they have images
 */

public class SecondFragmentFour extends Fragment {//https://javapapers.com/android/get-user-input-in-android/



    public Questions q = new Questions();//creates the questions file

    public Button ButtonChoice1;//variable for button 1
    public Button ButtonChoice2;//variable for button 2
    public Button ButtonChoice3;//variable for button 3
    public ImageView image;//image variable
    private String Answer;//variable for the answer to be stored
    private int QuestionNumber = MainActivity.getQuestionNumber();//get the question number in-case they are continuing the level


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Get the layout for this SecondFragment
           return inflater.inflate(R.layout.fragment_second_four, container, false);
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         /*
      Gets the image and buttons from xml layout, so they can be edited
       */

        ButtonChoice1 = (Button) view.findViewById(R.id.button_four_1);
        ButtonChoice2 = (Button) view.findViewById(R.id.button_four_2);
        ButtonChoice3 = (Button) view.findViewById(R.id.button_four_3);
        image = (ImageView) view.findViewById(R.id.imageViewCode) ;

        q.ReadFilesOne();//reads in the file
        updateQuestion();//updates the question as this is called for every separate question

        view.findViewById(R.id.button_four_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ButtonChoice1.getText().equals(Answer)) {

                    correct();

                } else {

                    Incorrect();
                }

            }
        });
        view.findViewById(R.id.button_four_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ButtonChoice2.getText().equals(Answer)) {

                    correct();

                } else {

                    Incorrect();
                }

            }
        });

        view.findViewById(R.id.button_four_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ButtonChoice3.getText().equals(Answer)) {

                    correct();

                } else {

                    Incorrect();
                }

            }
        });

        view.findViewById(R.id.floatingActionButton_help ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//if help button save everything and proceed to knowledge
                MainActivity.addQuestionNumber();
                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(SecondFragmentFour.this)
                        .navigate(R.id.action_secondFragmentFour_to_knowledge);


            }
        });

        view.findViewById(R.id.floatingActionButtonhome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {// menu button save all and proceed to home
                MainActivity.addQuestionNumber();
                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(SecondFragmentFour.this)
                        .navigate(R.id.action_secondFragmentFour_to_FirstFragment);


            }
        });



    }


    private void updateQuestion() {//get the image read in from file depending on the question number
        if(MainActivity.getlevel() == 9) {//level 9
            switch (QuestionNumber) {

                case 0:
                    image.setImageResource(R.drawable.nine_one);
                    break;
                case 1:
                    image.setImageResource(R.drawable.nine_two);
                    break;
                case 2:
                    image.setImageResource(R.drawable.nine_three);
                    break;
                case 3:
                    image.setImageResource(R.drawable.nine_four);
                    break;
                case 4:
                    image.setImageResource(R.drawable.nine_five);
                    break;
                case 5:
                    image.setImageResource(R.drawable.nine_six);
                    break;
                case 6:
                    image.setImageResource(R.drawable.nine_seven);
                    break;
                case 7:
                    image.setImageResource(R.drawable.nine_eight);
                    break;
                default:
                    break;

            }
        }else{//level 14
            switch (QuestionNumber) {

                case 0:
                    image.setImageResource(R.drawable.fourteen_one);
                    break;
                case 1:
                    image.setImageResource(R.drawable.fourteen_two);
                    break;
                case 2:
                    image.setImageResource(R.drawable.fourteen_three);
                    break;
                case 3:
                    image.setImageResource(R.drawable.fourteen_four);
                    break;
                case 4:
                    image.setImageResource(R.drawable.fourteen_five);
                    break;
                case 5:
                    image.setImageResource(R.drawable.fourteen_six);
                    break;
                case 6:
                    image.setImageResource(R.drawable.fourteen_seven);
                    break;
                case 7:
                    image.setImageResource(R.drawable.fourteen_eight);
                    break;
                default:
                    break;

            }
        }

        ButtonChoice1.setText(q.getchoice1(QuestionNumber));
        ButtonChoice2.setText(q.getchoice2(QuestionNumber));
        ButtonChoice3.setText(q.getchoice3(QuestionNumber));
        Answer = q.getAns(QuestionNumber);
        MainActivity.currentAns(Answer);

    }

    private void correct(){
        if( MainActivity.checkCompleted() == "Pass"){//check if passed
            NavHostFragment.findNavController(SecondFragmentFour.this).navigate(R.id.action_secondFragmentFour_to_levelPassed);

        }else if( MainActivity.checkCompleted() == "Complete"){//check if completed
            if(MainActivity.getlevel()==14) {
                NavHostFragment.findNavController(SecondFragmentFour.this).navigate(R.id.action_secondFragmentFour_to_end2);
            }
                NavHostFragment.findNavController(SecondFragmentFour.this).navigate(R.id.action_secondFragmentFour_to_levelCompleted);

        }else{
            MainActivity.addQuestionNumber();
            NavHostFragment.findNavController(SecondFragmentFour.this).navigate(R.id.action_secondFragmentFour_self);
        }
    }

    private void Incorrect(){//if incorrect add to incorrect

        MainActivity.addIncorrect();

        NavHostFragment.findNavController(SecondFragmentFour.this)
                .navigate(R.id.action_secondFragmentFour_to_thirdFragmentFour);
    }

}

