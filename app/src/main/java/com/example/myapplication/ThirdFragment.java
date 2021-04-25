package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

/*
This is the class to used if a incorrect answer is selected
 */

public class ThirdFragment extends Fragment {


    public TextView Answer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      // Get the layout for this Fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        Answer = (TextView)view.findViewById(R.id.incorect_Ans);//gets the answer varable
        Answer.setText(MainActivity.getAns());//sets the text to display the correct answer

        view.findViewById(R.id.floatingActionButton3).setOnClickListener(new View.OnClickListener() {//home button
            @Override
            public void onClick(View view) {
                MainActivity.addQuestionNumber();
                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(R.id.action_thirdFragment_to_FirstFragment);


            }
        });

        view.findViewById(R.id.button_third).setOnClickListener(new View.OnClickListener() {//continue on to the next question
            @Override
            public void onClick(View view) {
                MainActivity.addQuestionNumber();
                //MainActivity.addQuestionNumber();
                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(R.id.action_thirdFragment_to_SecondFragment);
            }
        });
    }



}