package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            int num = scanner.nextInt();
            if (num == -1)
            { break; }

            for (int i = num; i > 0; i--)
            {
                for (int j = i; j > 0; j--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
