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

  // public SecondFragment Sec = new SecondFragment();
  //  public Questions qLib = new Questions();
    public TextView Ans;
    private String mAnswer;
   // private  String str = "";


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    public void ansPass(String in){
      //  str = in;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    //    qLib = Sec.returnQ();


        Ans = (TextView)view.findViewById(R.id.incorect_Ans);


         // int no = MainActivity.getQuestionNumber();
         // String st = Questions.getAns(no);
        Ans.setText(MainActivity.getAns());

        view.findViewById(R.id.floatingActionButton3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(R.id.action_thirdFragment_to_FirstFragment);


            }
        });

        view.findViewById(R.id.button_third).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.addQuestionNumber();
                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(R.id.action_thirdFragment_to_SecondFragment);
            }
        });
    }



}