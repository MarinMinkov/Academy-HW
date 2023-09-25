package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numX = 0;
        int numY = 0;
        int total = 0;

        while(true)
        {
            System.out.print("Enter number from 1 to 20: ");
            numX = scanner.nextInt();
            System.out.print("Enter number from 1 to 20: ");
            numY = scanner.nextInt();

            if (numX > 0 && numX<=20 && numY > 0 && numX<=20)
            {
                total = numX * numY;
                break;
            }
            else
            {
                System.out.println("Incorrect input");
            }
        }

/*        for (int i = numY; i>0; i--)
        {
            for (int j = numX; j>0; j--)
            {
                System.out.print(total + " ");
                total--;
            }

            System.out.println();
        }*/

        for (int i = 0; i<numY; i++)
        {
            for (int j = 0; j < numX; j++)
            {
                System.out.print(total + " ");
                total--;
            }

            System.out.println();
        }

    }
}