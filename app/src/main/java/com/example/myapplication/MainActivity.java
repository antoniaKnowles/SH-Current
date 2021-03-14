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

    public static ArrayList<String> arr = new ArrayList<String>();


    public static ArrayList<String> getInput() {

        return arr;
    }



    public static void addQuestionNumber() {

        mQuestionNumber = mQuestionNumber+1;

    }

    public static int getQuestionNumber() {

        return mQuestionNumber;
    }

    public static String getAns() {

        return ansCurrent;
    }

    public static void currentAns(String mAnswer) {
        ansCurrent = mAnswer;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        String str="";

        InputStream is = this.getResources().openRawResource(R.raw.level_one);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));


        while (true) {
            try {
                if ((str = reader.readLine()) == null) break;
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            arr.add(str);

        }

        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);









    }




}










