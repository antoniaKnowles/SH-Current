package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Knowledge extends Fragment {

    private Button button2;// Creates a button


    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;

    public int selected = 0;//returns to Knowledge Information the level selected

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Get the layout for knowledge Fragment
        return inflater.inflate(R.layout.fragment_knowledge, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        Button[] buttonName = new Button[] {button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14};
        int[] buttonId = new int[] {R.id.button_Knowledge1,R.id.button_Knowledge2,R.id.button_Knowledge3,R.id.button_Knowledge4,R.id.button_Knowledge5,R.id.button_Knowledge6,R.id.button_Knowledge7,R.id.button_Knowledge8,R.id.button_Knowledge9,R.id.button_Knowledge10,R.id.button_Knowledge11,R.id.button_Knowledge12,R.id.button_Knowledge13,R.id.button_Knowledge14};


        for(int j =0; j< buttonName.length;j++) {

            buttonName[j] = (Button) view.findViewById(buttonId[j+1]);//creates button
            buttonName[j].setEnabled(MainActivity.checkPassed(j+2));// allow user access if the level has been recoded as passed


        }
/*
        button3 =  (Button) view.findViewById(R.id.button_Knowledge3);
        button3.setEnabled(MainActivity.checkPassed(3));

        button4 =  (Button) view.findViewById(R.id.button_Knowledge4);
        button4.setEnabled(MainActivity.checkPassed(4));

        button5 =  (Button) view.findViewById(R.id.button_Knowledge5);
        button5.setEnabled(MainActivity.checkPassed(5));

        button6 =  (Button) view.findViewById(R.id.button_Knowledge6);
        button6.setEnabled(MainActivity.checkPassed(6));

        button7 =  (Button) view.findViewById(R.id.button_Knowledge7);
        button7.setEnabled(MainActivity.checkPassed(7));

        button8 =  (Button) view.findViewById(R.id.button_Knowledge8);
        button8.setEnabled(MainActivity.checkPassed(8));

        button9 =  (Button) view.findViewById(R.id.button_Knowledge9);
        button9.setEnabled(MainActivity.checkPassed(9));

        button10 =  (Button) view.findViewById(R.id.button_Knowledge10);
        button10.setEnabled(MainActivity.checkPassed(10));

        button11 =  (Button) view.findViewById(R.id.button_Knowledge11);
        button11.setEnabled(MainActivity.checkPassed(11));

        button12 =  (Button) view.findViewById(R.id.button_Knowledge12);
        button12.setEnabled(MainActivity.checkPassed(12));

        button13 =  (Button) view.findViewById(R.id.button_Knowledge13);
        button13.setEnabled(MainActivity.checkPassed(13));

        button14 =  (Button) view.findViewById(R.id.button_Knowledge14);
        button14.setEnabled(MainActivity.checkPassed(14));

 */


      for(int i= 0;i <buttonId.length;i++) {
          int finalI = i;
          view.findViewById(buttonId[i]).setOnClickListener(new View.OnClickListener() {//On click of home button
              @Override
              public void onClick(View view) {

                  MainActivity.setSelectedHelp((finalI +1));//informs main of what level of help was selected
                  NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment

              }
          });
      }
/*
        view.findViewById(R.id.button_Knowledge2).setOnClickListener(new View.OnClickListener() {//On click of home button
        @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(2);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment

            }
        });

        view.findViewById(R.id.button_Knowledge3).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(3);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
             }
        });
        view.findViewById(R.id.button_Knowledge4).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(4);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge5).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(5);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge6).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(6);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge7).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(7);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge8).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(8);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge9).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(9);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge10).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(10);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge11).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(11);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge12).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(12);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge13).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(13);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });
        view.findViewById(R.id.button_Knowledge14).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                MainActivity.setSelectedHelp(14);
                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_knowledge_Information);//Take back to home fragment
            }
        });

*/
        view.findViewById(R.id.floatingActionButtonhome).setOnClickListener(new View.OnClickListener() {//On click of home button
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(Knowledge.this).navigate(R.id.action_knowledge_to_FirstFragment);//Take back to home fragment


            }
        });




    }

    public int getSelected(){
        return selected;
    }
}