package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double i = 0.0;
        Double rate = 0.0;
        Double sum = 0.0;

        for (i = 0.0; rate != -1.0; i++) {
            rate = scanner.nextDouble();
            if(rate>2.0&&rate<=6.0)
            {

                sum = sum + rate;
            }
            else if (rate == -1.0)
            {

            }
            else
            {
                System.out.println("Wrong number");
                i--;
            }
        }

        System.out.println((sum)/(i-1));


    }
    }

