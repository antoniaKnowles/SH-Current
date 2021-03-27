package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    public static int mQuestionNumber = 0;
    public static int NumberReadIn = 0;
    public static int level = 1;
    public static String ansCurrent ="";
    public static int numberoflevel = 14;
    public static ArrayList<String> arr = new ArrayList<String>();
    public static ArrayList<Integer> ReadInNames = new ArrayList<Integer>();
    public static ArrayList<Integer> IncorrectQuestionNumber = new ArrayList<Integer>();
    public static ArrayList<ArrayList<Integer>> IncorrectQuestionNumberStore = new ArrayList<ArrayList<Integer>>();
    public static ArrayList<ArrayList<String>> ReadInFile = new ArrayList<ArrayList<String>>();
    public static int[] LevelQuestion = new int[15];
    public static ArrayList<Integer> LevelsPass = new ArrayList<Integer>();
    public static int questionsaskedCount = 0;

    public static ArrayList<String> getInput() {//needs to return diffrent array for every level

       // return ReadInFIle.get(i);//return the input questions in format of strings for each separate question
        //if 1
        //if 2
       // LevelSize[level][1] = arr.size();//number of question for this level
      //  LevelSize[level][2] = (arr.size()/2);//number of question for this level
        //maybe new method to check if level is passed
        return ReadInFile.get(level-1);
       // return arr;
    }

    public static void resetLevel() {
        mQuestionNumber = 0;
    }



    public static void newLevel(int i) {
        if(!IncorrectQuestionNumber.isEmpty()) {
            for(int j = 0; j < IncorrectQuestionNumber.size(); j++) {
                IncorrectQuestionNumberStore.get(i).add(IncorrectQuestionNumber.get(j));

            }
            IncorrectQuestionNumber.clear();
        }

        if(mQuestionNumber != 0) {
            LevelQuestion[level] = mQuestionNumber;
            mQuestionNumber = 0;
        }

        level = i;
        passedLevel(level);

    }
    public static boolean checkPassed(int i) {
         if(LevelsPass.contains(i)){
             return true;
         }

        return false;
    }


    public static void passedLevel(int newlevel) {
        if(!LevelsPass.contains(newlevel)) {
            LevelsPass.add(newlevel);
        }
    }

    public static void getOldLevel(int newLevel) {
        if(IncorrectQuestionNumberStore.contains(newLevel)) {//might have to change this
            for(int j = 0; j <IncorrectQuestionNumberStore.get(newLevel).size(); j++) {
                IncorrectQuestionNumber.add(j);

            }
            IncorrectQuestionNumberStore.remove(newLevel);
        }
        if(LevelQuestion[level] != 0) {
            mQuestionNumber = LevelQuestion[level];
        }
        level = newLevel;

    }

    public static void addQuestionNumber() {

        mQuestionNumber = mQuestionNumber+1;//increase the current question index

    }

    public static int getQuestionNumber() {

        questionsaskedCount++;

        if((questionsaskedCount > ReadInFile.get(level-1).size())&&(!IncorrectQuestionNumber.isEmpty())) {
            //.get(arr.size()
             int newQuestionNum  = IncorrectQuestionNumber.get(0);
             IncorrectQuestionNumber.remove(0);
             return  newQuestionNum;

        }

        return mQuestionNumber;// returns the current question index
    }

    public static String getAns() {

        return ansCurrent;// returns the current answer
    }

    public static void currentAns(String mAnswer) {
        ansCurrent = mAnswer;// receives the current answer from where the string is split
    }

    public static int getlevel() {
        return level;//here
    }
    public static void setlevel(int i) {
        level = i;//here
    }



    public static void addIncorrect() {
       IncorrectQuestionNumber.add(mQuestionNumber);

    }


    public static String checkCompleted() {

        if((ReadInFile.get(level-1).size()<=(mQuestionNumber+1)) && (IncorrectQuestionNumber.size() == 0)){
            //arr.size()
            return "Complete";
        }else if ((((ReadInFile.get(level-1).size())/2)-1)==(mQuestionNumber-IncorrectQuestionNumber.size())){
            return "Pass";
        }
        return null;
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ReadInNames.add(R.raw.level_one);
        ReadInNames.add(R.raw.level_two);
        ReadInNames.add(R.raw.level_three);
        ReadInNames.add(R.raw.level_four);
        ReadInNames.add(R.raw.level_five);
        ReadInNames.add(R.raw.level_six);
        ReadInNames.add(R.raw.level_seven);
        ReadInNames.add(R.raw.level_eight);
        ReadInNames.add(R.raw.level_nine);
        ReadInNames.add(R.raw.level_ten);
        ReadInNames.add(R.raw.level_eleven);
        ReadInNames.add(R.raw.level_twelve);
        ReadInNames.add(R.raw.level_thirteen);
        ReadInNames.add(R.raw.level_fourteen);



        for (int i = 0; i < numberoflevel; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            IncorrectQuestionNumberStore.add(temp);
            ArrayList<String> temp2 = new ArrayList<String>();
            ReadInFile.add(temp2);
        }


        for (int i = 0; i < ReadInNames.size(); i++) {


            String str = "";
            InputStream is = this.getResources().openRawResource(ReadInNames.get(i));//gets the path to the files storing the Questions
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));//Reads in the file


            while (true) {//while there is still lines to read
                try {
                    if ((str = reader.readLine()) == null)
                        break;//set the line to str as long as it isn't empty
                } catch (IOException e) {//Exception catching
                    e.printStackTrace();
                }
                arr.add(str);//adding the Questions information to the list of questions

            }

            try {
                is.close();//closes the input stream
            } catch (IOException e) {//catches the exception
                e.printStackTrace();
            }
            for (int j = 0; j < arr.size(); j++) {
                ReadInFile.get(NumberReadIn).add(arr.get(j));
            }
            arr.clear();
            NumberReadIn++;
        }


            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


        }





}










