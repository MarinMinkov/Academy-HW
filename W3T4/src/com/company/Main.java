package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double grade = 0;
        double sum = 0;
        int counter=0;
        while(grade != -1)
        {
            grade = scanner.nextDouble();
            if (grade>=2 && grade<=6)
            {
                sum+=grade;
                counter++;
            }
        }

        if (sum/counter%2==0||sum/counter%3==0||sum/counter%4==0||sum/counter%5==0||sum/counter%6==0)
        {
            System.out.printf("%,.0f", sum/counter); //Print whole numbers without decimal.
        }
        else
        {
            System.out.printf("%,.2f", sum / counter); //Print numbers rounded to 2 decimal places.
        }
    }
}
