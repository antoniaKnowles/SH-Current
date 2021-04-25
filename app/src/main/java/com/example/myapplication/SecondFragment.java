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
This class supports 2 lines of questions and four possible answers
This class also has to be independent so it can be called again
 */

public class SecondFragment extends Fragment {

    public Questions q = new Questions();//creates the questions file

    public TextView Question1;//variable for the first line of the question
    public TextView Question2;//variable for the second line of the question
    public Button ButtonChoice1;//variable for button 1
    public Button ButtonChoice2;//variable for button 2
    public Button ButtonChoice3;//variable for button 3
    public Button ButtonChoice4;//variable for button 4

    private String Answer;//variable for the answer to be stored

    private int QuestionNumber = MainActivity.getQuestionNumber();//get the question number in-case they are continuing the level

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

      // Get the layout for this SecondFragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

      /*
      Gets the textView and buttons from xml layout, so they can be edited
       */

        Question1 = (TextView) view.findViewById(R.id.textview_second);
        Question2 = (TextView) view.findViewById(R.id.textview_second_two);
        ButtonChoice1 = (Button) view.findViewById(R.id.button_one);
        ButtonChoice2 = (Button) view.findViewById(R.id.button_two);
        ButtonChoice3 = (Button) view.findViewById(R.id.button_three);
        ButtonChoice4 = (Button) view.findViewById(R.id.button_four);

        q.ReadFilesOne();//reads in the file
        updateQuestion();//updates the question as this is called for every separate question


        view.findViewById(R.id.floatingActionButton_help).setOnClickListener(new View.OnClickListener() {// if the help button is clicked
            @Override
            public void onClick(View view) {

                MainActivity.newLevel(MainActivity.getlevel());//ensures the level
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_knowledge);//passes the user to knowledge
            }
        });

        view.findViewById(R.id.floatingActionButton2).setOnClickListener(new View.OnClickListener() {//if the home button is clicked
            @Override
            public void onClick(View view) {

                MainActivity.newLevel(MainActivity.getlevel());//ensures the level
               NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);//passes the user to the home page
            }
        });


        view.findViewById(R.id.button_four).setOnClickListener(new View.OnClickListener() {//if button four is selected
            @Override
            public void onClick(View view) {

                if (ButtonChoice4.getText().equals(Answer)) {
                    correct();//if user selects correct
                }else{
                   Incorrect();//if user selects incorrect
                }
            }
        });

        /*
        Similar code required for each button as they are waiting to see hwta is clicked
         */

        view.findViewById(R.id.button_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ButtonChoice3.getText().equals(Answer)) {
                    correct();
                }else{
                    Incorrect();
                }
            }
        });


        view.findViewById(R.id.button_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ButtonChoice2.getText().equals(Answer)) {
                    correct();
                }else{
                    Incorrect();
                }
            }
        });


        view.findViewById(R.id.button_one).setOnClickListener(new View.OnClickListener() {
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
    Ensures all the buttons are updated on the xml
     */

    private void updateQuestion() {
        Question1.setText(q.getQuestion1(QuestionNumber));//gets the questions
        Question2.setText(q.getQuestion2(QuestionNumber));
        ButtonChoice1.setText(q.getchoice1(QuestionNumber));
        ButtonChoice2.setText(q.getchoice2(QuestionNumber));
        ButtonChoice3.setText(q.getchoice3(QuestionNumber));
        ButtonChoice4.setText(q.getchoice4(QuestionNumber));
        Answer = q.getAns(QuestionNumber);

        MainActivity.currentAns(Answer);//tells the main what the current answer is so that it can be passed if answered incorrect

    }
/*
Next steps after choice is made
 */
   private void correct(){
       if( MainActivity.checkCompleted() == "Pass"){
           NavHostFragment.findNavController(SecondFragment.this).navigate(R.id.action_SecondFragment_to_levelPassed);

       }else if( MainActivity.checkCompleted() == "Complete"){
           NavHostFragment.findNavController(SecondFragment.this).navigate(R.id.action_SecondFragment_to_levelCompleted);

       }else{//if neither completed or passed level continue level
           MainActivity.addQuestionNumber();
           NavHostFragment.findNavController(SecondFragment.this).navigate(R.id.action_SecondFragment_self);
       }
   }

   /*
   if answered incorrectly
    */
    private void Incorrect(){

        MainActivity.addIncorrect();//add it to the array of incorrect question numbers
        NavHostFragment.findNavController(SecondFragment.this)
                .navigate(R.id.action_SecondFragment_to_thirdFragment);//pass to incorrect fragment
    }


}



