package com.example.myapplication;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
/*
This file is in charge of reading in the question file and split it up
 */

public class Questions extends Fragment {

    /*
    Creates an array for every question line, so that it can save each levels values
     */
    public  ArrayList<String> QuestionPt1 = new ArrayList<>();
    public  ArrayList<String> QuestionPt2 = new ArrayList<>();
    public  ArrayList<String> QuestionPt3 = new ArrayList<>();
    public  ArrayList<String> QuestionPt4 = new ArrayList<>();
    public  ArrayList<String> QuestionPt5 = new ArrayList<>();
    public  ArrayList<String> QuestionPt6 = new ArrayList<>();
    public  ArrayList<String> QuestionPt7 = new ArrayList<>();
    public  ArrayList<String> QuestionPt8 = new ArrayList<>();




    public  ArrayList<ArrayList<String>> choice = new ArrayList<>();//creates a list of all the possible choices for the answers of the questions
    public  ArrayList<String> answer = new ArrayList<>();//array of the answers for each level


    /*
    Reads in the file
     */

    public  void ReadFilesOne() {


        ArrayList<String> Input =  MainActivity.getInput();//Gets the input of strings for each question
        int level = MainActivity.getlevel();//gets the level

        for (String line : Input) {//for each in the array list of questions

            String[] linePart = line.split(";;");//split the line up
             int count = 0;//counts the parts in the line

            if(!((level==14)||(level==9) )) {//as a image
                QuestionPt1.add(linePart[count]);//Context of Question
                count++;//increase the count for each part of the line
                QuestionPt2.add(linePart[count]);//Item of Question
                count++;
            }

             if((level ==5)|(level ==6)) {//as these levels contain more display lines
                 QuestionPt3.add(linePart[count]);//Item of Question
                 count++;
                 QuestionPt4.add(linePart[count]);//Item of Question
                 count++;
                 QuestionPt5.add(linePart[count]);//Item of Question
                 count++;
                 QuestionPt6.add(linePart[count]);//Item of Question
                 count++;
                 QuestionPt7.add(linePart[count]);//Item of Question
                 count++;
                 QuestionPt8.add(linePart[count]);//Item of Question
                 count++;
             }

            ArrayList<String> options = new ArrayList<>();//creates a array list for each levels choices of answers

             options.add(linePart[count]);//adds the answers to the array of answers for each level
             count++;
             options.add(linePart[count]);
             count++;

            if((level==14)||(level==9) ) {//since 9 and 14 have one extra answer
                options.add(linePart[count]);
                count++;
            }
            if((level==7)||(level==11)||(level==10)||(level==3)||(level==1)||(level==2)) {//since these levels have 2 extra answers
                options.add(linePart[count]);
                count++;
                options.add(linePart[count]);
                count++;
            }

            choice.add(options);//adds the the array for all levels

            answer.add(linePart[count]);//Saves the answer of each question
        }

    }


    public String getQuestion1(int a){//Returns the Question Item for line 1
        String q = QuestionPt1.get(a);
        return q;
    }

    public   String getQuestion2(int a){//Returns the Question Item for line 2
        String q = QuestionPt2.get(a);
        return q;
    }

    public   String getQuestion3(int a){//Returns the Question Item for line 3
        String q = QuestionPt3.get(a);
        return q;
    }

    public   String getQuestion4(int a){//Returns the Question Item for line 4
        String q = QuestionPt4.get(a);
        return q;
    }
    public   String getQuestion5(int a){//Returns the Question Item for line 5
        String q = QuestionPt5.get(a);
        return q;
    }
    public   String getQuestion6(int a){//Returns the Question Item for line 6
        String q = QuestionPt6.get(a);
        return q;
    }
    public   String getQuestion7(int a){//Returns the Question Item for line 7
        String q = QuestionPt7.get(a);
        return q;
    }
    public   String getQuestion8(int a){//Returns the Question Item for line 8
        String q = QuestionPt8.get(a);
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
