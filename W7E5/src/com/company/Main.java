package com.company;

import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) {



        String sentences = "One.Two?Three!Four.Five";

        String [] tempStr = sentences.split("[.?!]");


        for (int i = 0; i < tempStr.length; i++)
        {
            System.out.println(tempStr[i]);
        }


    }
}
