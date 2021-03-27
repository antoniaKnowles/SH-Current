package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class ThirdFragment extends Fragment {


    public TextView Ans;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      // Get the layout for this SecondFragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //MainActivity.addQuestionNumber();


        Ans = (TextView)view.findViewById(R.id.incorect_Ans);
        Ans.setText(MainActivity.getAns());

        view.findViewById(R.id.floatingActionButton3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.addQuestionNumber();
                MainActivity.newLevel(MainActivity.getlevel());

                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(R.id.action_thirdFragment_to_FirstFragment);


            }
        });

        view.findViewById(R.id.button_third).setOnClickListener(new View.OnClickListener() {
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