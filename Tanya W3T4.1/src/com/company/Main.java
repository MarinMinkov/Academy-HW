package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double i = 0;
        double sum = 0;
        double rate = 0;

        for (i = 0; rate != -1; i++) {
            rate = scanner.nextDouble();

            if (rate >= 2 && rate <= 6)
            {
                sum += rate;

            }
            else
            {
                System.out.println("This is not a proper rate. Enter new rate");
                i = i-1;

            }
        }
        System.out.println((sum) / (i));
    }
    }

