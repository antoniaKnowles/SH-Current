package com.example.myapplication;

public class Questions {


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



    public  static String getQuestion1(int a){
        String q = QuestionPt1[0];
        return q;
    }

    public  static String getQuestion2(int a){
        String q = QuestionPt2[a];
        return q;
    }

    public static String getchoice1(int a){
        String c1 = choice[a][0];
        return c1;
    }

    public static String getchoice2(int a){
        String c2 = choice[a][1];
        return c2;
    }
    public static String getchoice3(int a){
        String c3 = choice[a][2];
        return c3;
    }

    public static String getchoice4(int a){
        String c4 = choice[a][3];
        return c4;
    }

    public static String getAns(int a){
        String ans = answer[a];
        return ans;
    }

}
