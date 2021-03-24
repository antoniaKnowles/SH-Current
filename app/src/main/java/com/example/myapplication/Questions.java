package com.example.myapplication;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;


public class Questions extends Fragment {

    public  ArrayList<String> QuestionPt1 = new ArrayList<>();
    public  ArrayList<String> QuestionPt2 = new ArrayList<>();
    public  ArrayList<ArrayList<String>> choice = new ArrayList<>();
    public  ArrayList<String> answer = new ArrayList<>();
    public ArrayList<String> Input;


    public  void ReadFilesOne() {


       Input =  MainActivity.getInput();//Gets the input of strings for each question

        for (String line : Input) {//for each in the array list of questions

            String[] linePart = line.split(";;");//split the line up

            QuestionPt1.add(linePart[0]);//Context of Question
            QuestionPt2.add(linePart[1]);//Item of Question

            ArrayList<String> options = new ArrayList<>();
            //Saving the possible options for the answers of the questions in Array list
            options.add(linePart[2]);
            options.add(linePart[3]);
            options.add(linePart[4]);
            options.add(linePart[5]);
            choice.add(options);

            answer.add(linePart[6]);//Saves the answer of each question
        }

    }


    public   String getQuestion1(int a){//Returns the Question Context
        String q = QuestionPt1.get(a);
        return q;
    }

    public   String getQuestion2(int a){//Returns the Question Item
        String q = QuestionPt2.get(a);
        return q;
    }

    public  String getchoice1(int a){//Returns the Question first choice
        String c1 = (choice.get(a)).get(0);
        return c1;
    }

    public  String getchoice2(int a){//Returns the Question Second choice
        String c2 = (choice.get(a)).get(1);
        return c2;
    }
    public  String getchoice3(int a){//Returns the Question Third choice
        String c3 = (choice.get(a)).get(2);
        return c3;
    }

    public  String getchoice4(int a){//Returns the Question fourth choice
        String c4 = (choice.get(a)).get(3);
        return c4;
    }

    public  String getAns(int a){//Returns the Question Answer
        String ans = (answer.get(a));
        return ans;
    }

}
