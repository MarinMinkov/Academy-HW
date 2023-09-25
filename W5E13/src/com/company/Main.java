package com.company;

import java.util.Scanner;

public class Main {

/*    public static String combineStrings (String fName, String lName)
    {
        String res="";
        res=fName+lName;

        return res;
    }*/
    public static String inputStringsMerge ()
    {
        Scanner scanner = new Scanner(System.in);
        String res=scanner.nextLine();
        res+=scanner.nextLine();
        return res;
    }

    public static void main(String[] args) {

        //System.out.println(combineStrings("Ivan","Ivanov"));

        System.out.println(inputStringsMerge());
    }

}
