package com.company;

public class Main {

    public static String strPars (String... srt)
    {
        String resStr = "";

        for (String n:srt)
        {
            resStr+=n+" ";
        }
        resStr.toLowerCase();

        return resStr;
    }

    public static void main(String[] args) {
        System.out.println(strPars("This","is","a","test"));

    }
}
