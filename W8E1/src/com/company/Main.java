package com.company;

public class Main {

    public static String toSencanceCase(String input)
    {
        String res="";
        res=input.substring(0,1).toUpperCase();
        res+=input.substring(1).toLowerCase();
        return res;
    }

    public static void main(String[] args) {

        System.out.println(toSencanceCase("helLo"));

    }
}
