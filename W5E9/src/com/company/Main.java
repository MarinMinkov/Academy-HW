package com.company;

import java.util.Scanner;

public class Main {

    public static int multiplyNums (int numOne, int numTwo)
    {
        int res = 0;
        res = numOne * numTwo;
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num one: ");
        int numA = scanner.nextInt();
        System.out.println("Enter num one: ");
        int numB = scanner.nextInt();

        System.out.println( numA + "*" + numB + "=" + multiplyNums(numA,numB) );
    }
}
