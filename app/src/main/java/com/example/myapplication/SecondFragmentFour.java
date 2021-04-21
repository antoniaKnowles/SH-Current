package com.example.myapplication;

import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragmentFour extends Fragment {//https://javapapers.com/android/get-user-input-in-android/



    public Questions qLib = new Questions();

    public Button mButtonChoice1;
    public Button mButtonChoice2;
    public Button mButtonChoice3;
    public ImageView image;
    private String mAnswer;
    private int mQuestionNumber = MainActivity.getQuestionNumber();


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

           return inflater.inflate(R.layout.fragment_second_four, container, false);
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mButtonChoice1 = (Button) view.findViewById(R.id.button_four_1);
        mButtonChoice2 = (Button) view.findViewById(R.id.button_four_2);
        mButtonChoice3 = (Button) view.findViewById(R.id.button_four_3);
        image = (ImageView) view.findViewById(R.id.imageViewCode) ;

        qLib.ReadFilesOne();
        updateQuestion();

        view.findViewById(R.id.button_four_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mButtonChoice1.getText().equals(mAnswer)) {

                    correct();

                } else {

                    Incorrect();
                }

            }
        });
        view.findViewById(R.id.button_four_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mButtonChoice2.getText().equals(mAnswer)) {

                    correct();

                } else {

                    Incorrect();
                }

            }
        });

        view.findViewById(R.id.button_four_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mButtonChoice3.getText().equals(mAnswer)) {

                    correct();

                } else {

                    Incorrect();
                }

            }
        });

        view.findViewById(R.id.floatingActionButton_help ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.addQuestionNumber();
                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(SecondFragmentFour.this)
                        .navigate(R.id.action_secondFragmentFour_to_knowledge);


            }
        });

        view.findViewById(R.id.floatingActionButtonhome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.addQuestionNumber();
                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(SecondFragmentFour.this)
                        .navigate(R.id.action_secondFragmentFour_to_FirstFragment);


            }
        });



    }


    private void updateQuestion() {
        if(MainActivity.getlevel() == 9) {
            switch (mQuestionNumber) {

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
        }else{
            switch (mQuestionNumber) {

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

        mButtonChoice1.setText(qLib.getchoice1(mQuestionNumber));
        mButtonChoice2.setText(qLib.getchoice2(mQuestionNumber));
        mButtonChoice3.setText(qLib.getchoice3(mQuestionNumber));
        mAnswer = qLib.getAns(mQuestionNumber);
        MainActivity.currentAns(mAnswer);

    }

    private void correct(){
        if( MainActivity.checkCompleted() == "Pass"){
            NavHostFragment.findNavController(SecondFragmentFour.this).navigate(R.id.action_secondFragmentFour_to_levelPassed);

        }else if( MainActivity.checkCompleted() == "Complete"){
            if(MainActivity.getlevel()==14) {
                NavHostFragment.findNavController(SecondFragmentFour.this).navigate(R.id.action_secondFragmentFour_to_end2);
            }
                NavHostFragment.findNavController(SecondFragmentFour.this).navigate(R.id.action_secondFragmentFour_to_levelCompleted);

        }else{
            MainActivity.addQuestionNumber();
            NavHostFragment.findNavController(SecondFragmentFour.this).navigate(R.id.action_secondFragmentFour_self);
        }
    }

    private void Incorrect(){

        MainActivity.addIncorrect();

        NavHostFragment.findNavController(SecondFragmentFour.this)
                .navigate(R.id.action_secondFragmentFour_to_thirdFragmentFour);
    }

}

