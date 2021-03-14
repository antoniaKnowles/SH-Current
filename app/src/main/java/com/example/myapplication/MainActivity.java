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
   // public  ArrayList<String> arr ;

   // public static ArrayList<String> ReadOne(){

    public static ArrayList<String> getInput() {

        return arr;
    }

    //    return arr;
   // }

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
        // StringBuffer buf = new StringBuffer();
        //ArrayList<String> arr = new ArrayList<String>();
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





/*
        Scanner scanner = new Scanner(this.getResources().openRawResource(R.raw.level_one));
        try {
            System.out.println("made it 3");
            Questions.ReadFilesOne(scanner);
        } catch (IOException e) {
            e.printStackTrace();
        }
        */



    }




}





/*


String
InputStream inputStream = getResources().openRawResource(R.raw.level_one.txt);
BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(inputStream));
String eachline = bufferedReader.readLine();
while (eachline != null) {
    // `the words in the file are separated by space`, so to get each words
    String[] words = eachline.split(" ");
    eachline = bufferedReader.readLine();
}



    public void ReadFiles() throws IOException {

        Scanner scanner = new Scanner(getResources().openRawResource(R.raw.Level_one));

        while(scanner.hasNext()){
            String[] line = scanner.nextLine().split(",");
           String Question1[]

        }

        String str="";
        StringBuffer buf = new StringBuffer();
        InputStream is = this.getResources().openRawResource(R.raw.Level_one);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        if (is!=null) {
            while ((str = reader.readLine()) != null) {
                buf.append(str + "\n" );
            }
        }




        is.close();

    */




