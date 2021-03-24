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
    public static String ansCurrent ="";
   // public static ArrayList<ArrayList<String> >ReadInFIle = new ArrayList<ArrayList<String>>();
    public static ArrayList<String> arr = new ArrayList<String>();


    public static ArrayList<String> getInput() {

       // return ReadInFIle.get(i);//return the input questions in format of strings for each separate question
        return arr;
    }

    public static void addQuestionNumber() {

        mQuestionNumber = mQuestionNumber+1;//increase the current question index

    }

    public static int getQuestionNumber() {

        return mQuestionNumber;// returns the current question index
    }

    public static String getAns() {

        return ansCurrent;// returns the current answer
    }

    public static void currentAns(String mAnswer) {
        ansCurrent = mAnswer;// receives the current answer from where the string is split
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //ArrayList<String> files = new ArrayList<String>();
        //files.add("R.raw.level_one");

       // for(int i =0;i< files.size();i++) {

            String str = "";
            InputStream is = this.getResources().openRawResource(R.raw.level_one);//gets the path to the files storing the Questions
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

           // ReadInFIle.add(arr);

      //  }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }




}










