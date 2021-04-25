package com.example.myapplication;

import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
This is the main class of the system dealing with all the connections within the application
 */
public class MainActivity extends AppCompatActivity {


    public static int QuestionNumber = 0;//counts the number of the questions
    public static int NumberReadIn = 0;//count of how many questions was read in
    public static int level = 1;//starting level at 1 as there is no level 0
    public static String ansCurrent ="";//vaule for the current answer
    public static int numberoflevel = 14;// number of how many questions levels
    public static int questionsaskedCount = 0;//counts the number of questions asked
    public static int selectedLevelHelp = 0;//the level of help that was selected
    public static int[] LevelQuestion = new int[15];//the questions levels
    public static ArrayList<String> arr = new ArrayList<String>();//reading in lines
   // public static ArrayList<Integer> ReadInNames = new ArrayList<Integer>();
    public static ArrayList<Integer> IncorrectQuestionNumber = new ArrayList<Integer>();//incorrect questions list for each level
    public static ArrayList<ArrayList<Integer>> IncorrectQuestionNumberStore = new ArrayList<ArrayList<Integer>>();//record of incorrect answer for each level
    public static ArrayList<ArrayList<String>> ReadInFile = new ArrayList<ArrayList<String>>();//files being read in
    public static ArrayList<Integer> LevelsPass = new ArrayList<Integer>();//track of levels passed




    public static ArrayList<String> getInput() {//needs to return different array for every level

        return ReadInFile.get(level-1);

    }

    public static void resetLevel() {//resets all the variables to 0 after completed

        QuestionNumber = 0;
        questionsaskedCount = 0;
    }

    public static void newLevel(int i) {// moves onto the next level

        if(!IncorrectQuestionNumber.isEmpty()) {//checks that there are still incorrect answers
            for(int j = 0; j < IncorrectQuestionNumber.size(); j++) {
                IncorrectQuestionNumberStore.get(i).add(IncorrectQuestionNumber.get(j));//stores the incorrect answers for the next time this levelis used
            }
            IncorrectQuestionNumber.clear();
        }

        if(QuestionNumber != 0) {// saves the question number
            LevelQuestion[level] = QuestionNumber;
            QuestionNumber = 0;
        }
        if(questionsaskedCount != 0) {//re-sits question count
            questionsaskedCount=0;
        }

        level = i;//ensure the level
        passedLevel(level);//check the new level is passed

    }

    public static boolean checkPassed(int i) {//checks if the level has been passed

         if(LevelsPass.contains(i)){
             return true;
         }
        return false;
    }


    public static void passedLevel(int newlevel) {// informs that the level has been passed
        if(!LevelsPass.contains(newlevel)) {
            LevelsPass.add(newlevel);
        }
    }

    public static void getOldLevel(int newLevel) {//restes to a old level

        if(IncorrectQuestionNumberStore.contains(newLevel)) {//might have to change this
            for(int j = 0; j <IncorrectQuestionNumberStore.get(newLevel).size(); j++) {
                IncorrectQuestionNumber.add(j);//re adds all the incorrect answered questions
            }
            IncorrectQuestionNumberStore.remove(newLevel);
        }
        if(LevelQuestion[level] != 0) {
            QuestionNumber = LevelQuestion[level];//sets the question number
        }
        level = newLevel;//ensures level

    }

    public static void addQuestionNumber() {

        QuestionNumber = QuestionNumber+1;//increase the current question index
    }

    public static int getQuestionNumber() {//returns the question number

        questionsaskedCount++;
        //if all questions answered once move onto incorrectly answered questions
        if((questionsaskedCount > ReadInFile.get(level-1).size())&&(!IncorrectQuestionNumber.isEmpty())) {
             int newQuestionNum  = IncorrectQuestionNumber.get(0);
             IncorrectQuestionNumber.remove(0);
             return  newQuestionNum;
        }
        return QuestionNumber;// returns the current question index
    }

    public static String getAns() {// returns the current answer

        return ansCurrent;
    }

    public static void currentAns(String mAnswer) {// receives the current answer from where the string is split
        ansCurrent = mAnswer;
    }

    public static int getlevel() {//returns currect level

        return level;
    }
    public static void setlevel(int i) {//sets the current level
        level = i;
    }

    public static void addIncorrect() {//adds a incorrect answer
       IncorrectQuestionNumber.add(QuestionNumber);
    }


    public static String checkCompleted() {




        if((ReadInFile.get(level-1).size()<=questionsaskedCount) && (IncorrectQuestionNumber.size() == 0)){//if all questions both correct and incorrect have been answered
            return "Complete";
        }else if ((((ReadInFile.get(level-1).size())/2))==(questionsaskedCount-IncorrectQuestionNumber.size())&&(!((level== 9)||(level == 14)))){//if half the questions have been answered correctly
            return "Pass";
        }




        return null;
    }


    public static void setSelectedHelp(int i){// set the help level

        selectedLevelHelp = i;
    }
    public static int getSelectedHelp(){// return selected help

        return selectedLevelHelp;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ArrayList<Integer> ReadInNames = new ArrayList<Integer>();//file for reading in
/*
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
*/
        ReadInNames.addAll(Arrays.asList(R.raw.level_one, R.raw.level_two, R.raw.level_three, R.raw.level_four,
                R.raw.level_five,R.raw.level_six,R.raw.level_seven,R.raw.level_eight,R.raw.level_nine,R.raw.level_ten,
                R.raw.level_eleven,R.raw.level_twelve,R.raw.level_thirteen,R.raw.level_fourteen));// adds the files names


        for (int i = 0; i < numberoflevel; i++) {

            ArrayList<Integer> temp = new ArrayList<Integer>();//creates the stores for incorrect answers
            IncorrectQuestionNumberStore.add(temp);
            ArrayList<String> temp2 = new ArrayList<String>();//creates the read in file array
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
                  ReadInFile.get(NumberReadIn).add(arr.get(j));//adds to the read in file
            }
              arr.clear();
              NumberReadIn++;
            }

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        }

}










