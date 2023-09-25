package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int [] fib;
        int num;

        while (true)
        {
            System.out.println("Enter a number from 1 to 45");
            num = scanner.nextInt();
            fib = new int[num];

            if (num > 0 && num <= 45)
            {
                break;
            }
            else
            {
                System.out.println("Wrong input");
            }
        }


        for (int i = 0; i <num; i++)
        {
            if (i == 0 || i == 1)
            {
                fib[i]=1;
            }
            else
            {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }

        for (int n : fib)
        {
            System.out.print(n + " ");
        }

    }
}
