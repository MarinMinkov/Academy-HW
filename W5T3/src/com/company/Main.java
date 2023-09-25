package com.company;

public class Main {

    public static void printNumbers(int max)
    {
        if (max<0)
        {
            System.out.println("Number is less than 0");
        }
        else if (max==0)
        {
            System.out.println("0");
        }
        else
        {
            for (int i = 1; i <= max; i++)
            {
                if (i<max)// if else to avoid adding "," after the last number.
                {
                    System.out.print(i + ", ");
                }
                else
                {
                    System.out.print(i);
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printNumbers(5);
        printNumbers(-5);
        printNumbers(0);

    }
}
