package com.company;

import java.util.Random;

public class Main {

    public static int generateRandomNumber (int min, int max)
    {
        int res = 0;
        Random random = new Random();
        try
        {
            res = random.nextInt(max+1-min)+min;
        }
        catch (Exception e)
        {
            System.out.println("Error. Max must be bigger than Min!");
            res= -1;
        }

        return res;
    }

    public static void main(String[] args) {

        System.out.println(generateRandomNumber(10,50));
        System.out.println(generateRandomNumber(59,59));
        System.out.println(generateRandomNumber(0,6));
        System.out.println(generateRandomNumber(5, 2));



    }
}