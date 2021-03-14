package com.example.myapplication;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.collection.CircularArray;
import androidx.fragment.app.Fragment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Questions extends Fragment {

/*
   public static String[] QuestionPt1;
    public static String[] QuestionPt2;
    public static String[][] choice;
    public static String[] answer;

 */
    public  ArrayList<String> QuestionPt1 = new ArrayList<>();
    public  ArrayList<String> QuestionPt2 = new ArrayList<>();
    public  ArrayList<ArrayList<String>> choice = new ArrayList<>();
    public  ArrayList<String> answer = new ArrayList<>();
    public ArrayList<String> Input;
    int countQuestion = 0;






    public  void ReadFilesOne() throws IOException {
//going array list
        //change code so it adds

       Input =  MainActivity.getInput();
       // Scanner scanner = new Scanner(getResources().openRawResource(R.raw.level_one));
       //System.out.println("made it 1");
       // while (scanner.hasNext()) {


            //String[] linePart = scanner.nextLine().split(",");
        for (String line : Input) {

            String[] linePart = line.split(",");


//struggle to add
            QuestionPt1.add(linePart[0]);
            QuestionPt2.add(linePart[1]);

            ArrayList<String> options = new ArrayList<>();
            options.add(linePart[2]);
            options.add(linePart[3]);
            options.add(linePart[4]);
            options.add(linePart[5]);
            choice.add(options);

            answer.add(linePart[6]);

            System.out.println("made it 1");
        }
      //}
    }


        /*
        String str="";
        StringBuffer buf = new StringBuffer();
        InputStream is = getResources().openRawResource(R.raw.Level_one);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        if (is!=null) {
            while ((str = reader.readLine()) != null) {
                buf.append(str + "\n" );
            }
        }




        is.close();

*/


/*

    public static String QuestionPt1[] = {
            "What type belongs to "
    };


    public static String QuestionPt2[] = {
            "7.52 ","52","false","number","0.87564","a","0","Name","1.3724","0.2","true","j"
    };



    public static String choice[][] ={
            {"Integer(Int)","Double","Boolean","String"},

            {"","String","Integer(Int)","Float"},

            {"Integer(Int)","Float","Boolean","Char"},

            {"Double","","Boolean","String"},

            {"Float","Char","","Integer(Int)"},

            {"","Char","String","Boolean"},

            {"Double","Char","Boolean","Integer(Int)"},

            {"String","Integer(Int)","Float","Char"},

            {"Float","String","Double","Char"},

            {"Char","Boolean","Double","Integer(Int)"},

            {"String","Boolean","Double","Integer(Int)"},

            {"Float","Boolean","String","Char"},



    };

    public static String answer[]={"Double","Integer(Int)","Boolean","String","Float","Char","Integer(Int)","String","Float","Double","Boolean","Char"};

*/

    public   String getQuestion1(int a){
        String q = QuestionPt1.get(a);//as only one queation
        return q;
    }

    public   String getQuestion2(int a){
        String q = QuestionPt2.get(a);
        return q;
    }

    public  String getchoice1(int a){
        String c1 = (choice.get(a)).get(0);
        return c1;
    }

    public  String getchoice2(int a){
        String c2 = (choice.get(a)).get(1);
        return c2;
    }
    public  String getchoice3(int a){
        String c3 = (choice.get(a)).get(2);
        return c3;
    }

    public  String getchoice4(int a){
        String c4 = (choice.get(a)).get(3);
        return c4;
    }

    public  String getAns(int a){
        String ans = (answer.get(a));
        return ans;
    }

}
