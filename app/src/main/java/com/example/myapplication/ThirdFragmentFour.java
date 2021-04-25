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
This fragment is the same as the other fragments however due to the restriction of having to navigate to separate question pages.
Each one has to be separate.
 */

public class ThirdFragmentFour extends Fragment {


    public TextView Answer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Get the layout for this Fragment
        return inflater.inflate(R.layout.fragment_third_four, container, false);
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        Answer = (TextView)view.findViewById(R.id.incorect_Ans);
        Answer.setText(MainActivity.getAns());

        view.findViewById(R.id.floatingActionButton3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.addQuestionNumber();
                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(ThirdFragmentFour.this)
                        .navigate(R.id.action_thirdFragmentFour_to_FirstFragment);


            }
        });

        view.findViewById(R.id.button_third).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.addQuestionNumber();
                NavHostFragment.findNavController(ThirdFragmentFour.this)
                        .navigate(R.id.action_thirdFragmentFour_to_secondFragmentFour);//changing line that directs too the fourth question fragment
            }
        });
    }



}